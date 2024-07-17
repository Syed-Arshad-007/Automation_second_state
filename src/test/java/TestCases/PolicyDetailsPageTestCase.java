package TestCases;

import CommonFunctions.CommonFunctions;
import PageObjects.PolicyDetailsPageObjects;
import PageObjects.UnderwriterPageObjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static TestCases.AccountPageTestcase.login;

public class PolicyDetailsPageTestCase extends CommonFunctions {

    @Test
    public void policyDetailsPage() {

     /*   //Underwriter Page --------------------------------------
        PageFactory.initElements(driver, UnderwriterPageObjects.class);

        //Next Button
        loaderValidation();
        UnderwriterPageObjects.nextButton.click(); */

        //Policy Page
        PageFactory.initElements(driver, PolicyDetailsPageObjects.class);

        //state selection dropdown
        loaderValidation();
        waitToBeClickable(PolicyDetailsPageObjects.stateDropdown);
        PolicyDetailsPageObjects.stateDropdown.click();
        loaderValidation();
        waitToBeClickable(PolicyDetailsPageObjects.stateSelect);
        PolicyDetailsPageObjects.stateSelect.click();
        /*for (WebElement state : PolicyDetailsPageObjects.stateList) {
            if (state.getText().equals("California")) {
                state.click();
                break;
            }
        } */

        //Subline dropdown option
        Actions actions = new Actions(driver);
        try {
            waitToBeClickable((PolicyDetailsPageObjects.sublineDropdown));
            actions.moveToElement(PolicyDetailsPageObjects.sublineDropdown).click().perform();
        } catch (StaleElementReferenceException e) {
            waitToBeClickable(PolicyDetailsPageObjects.sublineDropdown);
            actions.moveToElement(PolicyDetailsPageObjects.sublineDropdown).click().build().perform();
        }
        waitToBeClickable(PolicyDetailsPageObjects.sublineSelect);
        PolicyDetailsPageObjects.sublineSelect.click();

        //Commercial pesticide Applicators Dropdown
        waitToBeClickable(PolicyDetailsPageObjects.commercialPesticide);
        PolicyDetailsPageObjects.commercialPesticide.click();
        PolicyDetailsPageObjects.commercialPesticideSelect.click();

        //Cyber Coverage
        waitToBeClickable(PolicyDetailsPageObjects.cyberCoverage);
        PolicyDetailsPageObjects.cyberCoverage.click();
        PolicyDetailsPageObjects.cyberCoverageSelect.click();

        //EPLI Coverage
        waitToBeClickable(PolicyDetailsPageObjects.noOfFullTimeEmployees);
        PolicyDetailsPageObjects.noOfFullTimeEmployees.sendKeys("500");
        PolicyDetailsPageObjects.noOfPartTimeEmployees.sendKeys("200");
        loaderValidation();
        PolicyDetailsPageObjects.numberOfStaffedLocations.sendKeys("4");
        loaderValidation();
        PolicyDetailsPageObjects.numberOfEPLIClaims.sendKeys("5");

        //State Save Button
        waitToBeClickable(PolicyDetailsPageObjects.saveButton);
        actions.moveToElement(PolicyDetailsPageObjects.saveButton).click().build().perform();

        //Policy level Additional coverage Add button
     /*   loaderValidationForAddCoveragePlusIcon();
        //waitToBeClickable(PolicyDetailsPageObjects.additionalCoveragePlusIcon);
        PolicyDetailsPageObjects.additionalCoveragePlusIcon.click();
        PolicyDetailsPageObjects.additionalCoverageName.sendKeys("Limited Fungi Or Bacteria Coverage");

        PolicyDetailsPageObjects.additionalCoverageName.sendKeys(Keys.ARROW_DOWN);
        PolicyDetailsPageObjects.additionalCoverageName.sendKeys(Keys.ENTER);

        PolicyDetailsPageObjects.fungiOrBacteriaLimit.sendKeys(Keys.BACK_SPACE);
        PolicyDetailsPageObjects.fungiOrBacteriaLimit.sendKeys("1000");
        PolicyDetailsPageObjects.manualPremium.sendKeys("1000");
        PolicyDetailsPageObjects.saveCoverage.click(); */

        //Next button policyDetailsPage
        loaderValidation();
        PolicyDetailsPageObjects.nextButtonPolicyPage.click();


    }
}
