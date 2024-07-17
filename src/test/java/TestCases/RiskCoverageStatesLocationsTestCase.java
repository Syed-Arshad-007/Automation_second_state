package TestCases;

import CommonFunctions.CommonFunctions;
import PageObjects.AccountPageObjects;
import PageObjects.PolicyDetailsPageObjects;
import PageObjects.RiskCoverageStatesLocationsPageObjects;
import PageObjects.UnderwriterPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static TestCases.AccountPageTestcase.login;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class RiskCoverageStatesLocationsTestCase extends CommonFunctions {
    Actions actions;

    @Test
    public void riskCoverageStatesLocationsPage() {

        //RiskCoverage states & Locations page
        PageFactory.initElements(driver, RiskCoverageStatesLocationsPageObjects.class);

        //Risk schedule expand button
        actions = new Actions(driver);
        visibilityOf(RiskCoverageStatesLocationsPageObjects.stateRiskScheduleExpand);
        actions.moveToElement(RiskCoverageStatesLocationsPageObjects.stateRiskScheduleExpand).click().perform();

        //Location Expand Button
        visibilityOf(RiskCoverageStatesLocationsPageObjects.locationExpand);
        actions.moveToElement(RiskCoverageStatesLocationsPageObjects.locationExpand).click().build().perform();

        //Location Add icon
        loaderValidation();
        visibilityOf(RiskCoverageStatesLocationsPageObjects.locationAddIcon);
        RiskCoverageStatesLocationsPageObjects.locationAddIcon.click();

        //Location Name text field
        loaderValidation();
        RiskCoverageStatesLocationsPageObjects.locationName.sendKeys("Harrison");

        //Address line1
        actions.pause(Duration.ofSeconds(1)).perform();
        RiskCoverageStatesLocationsPageObjects.addressLine1.sendKeys("AddressLine1");

        //City
        RiskCoverageStatesLocationsPageObjects.city.sendKeys("Los Angeles");

        //ISO CAP index score
        RiskCoverageStatesLocationsPageObjects.isoCapscore.sendKeys("500");


        //Location Operations
        waitToBeClickable(RiskCoverageStatesLocationsPageObjects.locationOperationsDropdown);
        RiskCoverageStatesLocationsPageObjects.locationOperationsDropdown.click();
        waitToBeClickable(RiskCoverageStatesLocationsPageObjects.locationOperationsSelect);
        RiskCoverageStatesLocationsPageObjects.locationOperationsSelect.click();

        //Premises Operations Territory
        waitToBeClickable(RiskCoverageStatesLocationsPageObjects.premisesOperationsterr);
        RiskCoverageStatesLocationsPageObjects.premisesOperationsterr.click();
        actions.pause(Duration.ofSeconds(1));
        waitToBeClickable(RiskCoverageStatesLocationsPageObjects.premisesOpTerrSelect);
        RiskCoverageStatesLocationsPageObjects.premisesOpTerrSelect.click();

        //save Button Location
        loaderValidation();
        actions.pause(Duration.ofSeconds(1)).perform();
        RiskCoverageStatesLocationsPageObjects.saveLocation.click();

        //Location Expand after saving
        loaderValidation();
        actions.pause(Duration.ofSeconds(1)).perform();
        RiskCoverageStatesLocationsPageObjects.locationExpAfterSav.click();

        //Classification Expand
        loaderValidation();
        visibilityOf(RiskCoverageStatesLocationsPageObjects.classificationExp);
        RiskCoverageStatesLocationsPageObjects.classificationExp.click();

        //Classification Add Icon
        loaderValidation();
        visibilityOf(RiskCoverageStatesLocationsPageObjects.classificationAddIcon);
        loaderValidation();
        RiskCoverageStatesLocationsPageObjects.classificationAddIcon.click();
        //Thread.sleep(1000);

        //Classification Number
        loaderValidation();
        RiskCoverageStatesLocationsPageObjects.classificationNumber.sendKeys("1");

        //Class Code
        loaderValidation();
        waitToBeClickable(RiskCoverageStatesLocationsPageObjects.classCodeDropdown);
        RiskCoverageStatesLocationsPageObjects.classCodeDropdown.click();
        loaderValidation();
        waitToBeClickable(RiskCoverageStatesLocationsPageObjects.classCodeSelect);
        RiskCoverageStatesLocationsPageObjects.classCodeSelect.click();

        //Prem Ops and Prods Comps Exposure
        loaderValidation();
        visibilityOf(RiskCoverageStatesLocationsPageObjects.premOpsExposure);
        RiskCoverageStatesLocationsPageObjects.premOpsExposure.sendKeys("2000000");
        actions.pause(Duration.ofSeconds(3)).perform();

        //Classification Save Button
        loaderValidation();
        waitToBeClickable(RiskCoverageStatesLocationsPageObjects.classificationSaveButton);
        RiskCoverageStatesLocationsPageObjects.classificationSaveButton.click();

        //Next Button states and locations
        loaderValidation();
        RiskCoverageStatesLocationsPageObjects.nextButtonStatesAndLocations.click();

    }

}
