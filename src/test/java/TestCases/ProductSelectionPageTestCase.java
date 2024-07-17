package TestCases;

import CommonFunctions.CommonFunctions;
import PageObjects.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProductSelectionPageTestCase extends CommonFunctions {
    Actions actions;

    @Test
    public void productSelectionPage() {

        //Product Selection Page
        PageFactory.initElements(driver, ProductSelectionPageObjects.class);

        //Save button under Primary state
        loaderValidation();
        visiblityOfElement(ProductSelectionPageObjects.saveButtonUnderPrimaryState);
        loaderValidation();
        ProductSelectionPageObjects.saveButtonUnderPrimaryState.click();

        //Save button under Location
        loaderValidation();
        waitToBeClickable(ProductSelectionPageObjects.saveButtonUnderLocation);
        ProductSelectionPageObjects.saveButtonUnderLocation.click();
        //Thread.sleep(1000);

        //Rate Button
        actions = new Actions(driver);
        loaderValidation();
        actions.moveToElement(ProductSelectionPageObjects.rateButton).click().build().perform();

        //General Liability Insights
        loaderValidation();
        actions.pause(Duration.ofSeconds(3)).perform();
        waitToBeClickable(ProductSelectionPageObjects.generalLiabilityInsightsExpand1);
        ProductSelectionPageObjects.generalLiabilityInsightsExpand2.click();


        //Mandatory Rules Check Box and Save Button
        loaderValidation();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", ProductSelectionPageObjects.mandatoryRulesCheckBox1);
        ProductSelectionPageObjects.mandatoryRulesCheckBox1.click();
        loaderValidation();
        actions.pause(Duration.ofSeconds(1));
        ProductSelectionPageObjects.mandatoryRulesCheckBox2.click();
        loaderValidation();
        waitToBeClickable(ProductSelectionPageObjects.mandatoryRulesSave);
        ProductSelectionPageObjects.mandatoryRulesSave.click();

        //Create Quote Button
        loaderValidation();
        waitToBeClickable(ProductSelectionPageObjects.createQuoteButton);
        ProductSelectionPageObjects.createQuoteButton.click();


    }
}
