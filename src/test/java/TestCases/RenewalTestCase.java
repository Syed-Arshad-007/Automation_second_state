package TestCases;

import CommonFunctions.CommonFunctions;
import PageObjects.EndorsementPageObjects;
import PageObjects.RenewalPageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class RenewalTestCase extends CommonFunctions {

    static Actions actions;

    @Test
    public static void renewalTestCase() {


        //Account Page_______________________________________________________________________________
        PageFactory.initElements(driver, RenewalPageObjects.class);
        actions = new Actions(driver);

        //Submission Number
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.subNumberRenewal);
        String submissionNumberRenewal = RenewalPageObjects.subNumberRenewal.getText();
        System.out.println("Submission Number Renewal = " + submissionNumberRenewal);

        //Submission Type
        loaderValidation();
        String submissionTypeRenewal = RenewalPageObjects.submissionType.getText();
        System.out.println(submissionTypeRenewal);

        //Update Submission Renewal
        loaderValidation();
        RenewalPageObjects.updateSubmissionButtonRenewal.click();

        //Underwriter Page_________________________________________________________________________

        //Next Button Underwriter page
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.nextButtonUnderwriterPageRenewal);
        RenewalPageObjects.nextButtonUnderwriterPageRenewal.click();

        //Policy Details Page
        loaderValidation();
        RenewalPageObjects.nextButtonPolicyPageRenewal.click();

        //Risk Coverage States and Locations Page__________________________________________________

        //State Add Icon
        loaderValidation();
        RenewalPageObjects.stateAddIcon.click();

        //Secondary state select
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.stateDropdown);
        RenewalPageObjects.stateDropdown.click();
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.stateSelect);
        RenewalPageObjects.stateSelect.click();

        //State Save Button
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.saveButtonState);
        loaderValidation();
        RenewalPageObjects.saveButtonState.click();

        //Risk schedule expand button
        loaderValidation();
        RenewalPageObjects.stateRiskScheduleExpand.click();

        //Location Expand Button
        loaderValidation();
        RenewalPageObjects.locationExpand.click();

        //Location Add icon
        loaderValidation();
        visibilityOf(RenewalPageObjects.locationAddIcon);
        RenewalPageObjects.locationAddIcon.click();

        //Location Name text field
        loaderValidation();
        RenewalPageObjects.locationName.sendKeys("Lux");

        //Address line1
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.addressLine1);
        RenewalPageObjects.addressLine1.sendKeys("125 street station");

        //City
        loaderValidation();
        RenewalPageObjects.city.sendKeys("New City");

        //sublineState
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.sublineState);
        RenewalPageObjects.sublineState.click();
        waitToBeClickable(RenewalPageObjects.sublineStateSelect);
        RenewalPageObjects.sublineStateSelect.click();

        //Zipcode
        waitToBeClickable(RenewalPageObjects.zipcode);
        RenewalPageObjects.zipcode.click();
        waitToBeClickable(RenewalPageObjects.zipcodeSelect);
        RenewalPageObjects.zipcodeSelect.click();

        //ISO CAP index score
        loaderValidation();
        RenewalPageObjects.isoCapscore.sendKeys("500");

        //Location Operations
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.locationOperationsDropdown);
        RenewalPageObjects.locationOperationsDropdown.click();
        waitToBeClickable(RenewalPageObjects.locationOperationsSelect);
        RenewalPageObjects.locationOperationsSelect.click();

        //save Button Location
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.saveLocation);
        RenewalPageObjects.saveLocation.click();

        //Location Expand after saving
        //loaderValidationLocationExpandAfterSave();
        loaderValidation();
        actions.pause(Duration.ofSeconds(1)).perform();
        RenewalPageObjects.locationExpAfterSav.click();

        //Classification Expand
        loaderValidation();
        visibilityOf(RenewalPageObjects.classificationExp);
        RenewalPageObjects.classificationExp.click();

        //Classification Add Icon
        loaderValidation();
        visibilityOf(RenewalPageObjects.classificationAddIcon);
        RenewalPageObjects.classificationAddIcon.click();

        //Classification Number
        loaderValidation();
        RenewalPageObjects.classificationNumber.sendKeys("3");

        //Class Code
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.classCodeDropdown);
        RenewalPageObjects.classCodeDropdown.click();
        waitToBeClickable(RenewalPageObjects.classCodeSelect);
        RenewalPageObjects.classCodeSelect.click();

        //Prem ops Exposure
        loaderValidation();
        visibilityOf(RenewalPageObjects.premOpsExposure);
        RenewalPageObjects.premOpsExposure.sendKeys("4000000");
        actions.pause(Duration.ofSeconds(3)).perform();

        //Estimated Loss Potential Override
        loaderValidation();
        visibilityOf(RenewalPageObjects.estimatedLossPotentialOverride);
        RenewalPageObjects.estimatedLossPotentialOverride.sendKeys("10" + Keys.ENTER);

        //Classification Save Button
        loaderValidation();
        RenewalPageObjects.classificationSaveButton.click();

        //Next Button states and locations
        loaderValidation();
        RenewalPageObjects.nextButtonStatesAndLocations.click();

        //Product Selection Page__________________________________________________________________________

        //Save button under Primary state
        loaderValidation();
        visiblityOfElement(RenewalPageObjects.saveButtonUnderPrimaryState);
        loaderValidation();
        RenewalPageObjects.saveButtonUnderPrimaryState.click();

        //Save button under Location
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.saveButtonUnderLocation);
        RenewalPageObjects.saveButtonUnderLocation.click();

        //Rate Button
        loaderValidation();
        actions.moveToElement(RenewalPageObjects.rateButton).click().build().perform();

        //General Liability Insights
        loaderValidation();
      /*  try {
            loaderValidation();
            waitToBeClickable(RenewalPageObjects.generalLiabilityInsightsExpand);
            RenewalPageObjects.generalLiabilityInsightsExpand.click();  */ // Attempt to click element
        //  } catch (StaleElementReferenceException e) {
        actions.pause(Duration.ofSeconds(5)).perform();
        RenewalPageObjects.generalLiabilityInsightsExpand.click();
        //   } catch (Exception e) {
        //       e.printStackTrace();

        //Mandatory Rules Check Box and Save Button
        loaderValidation();
        actions.pause(Duration.ofSeconds(3)).perform();
        //    JavascriptExecutor js = (JavascriptExecutor) driver;
        //   js.executeScript("arguments[0].scrollIntoView();", RenewalPageObjects.mandatoryRulesCheckBox1);
        RenewalPageObjects.mandatoryRulesCheckBox1.click();
        loaderValidation();
        RenewalPageObjects.mandatoryRulesCheckBox2.click();
        loaderValidation();
        RenewalPageObjects.mandatoryRulesCheckBox3.click();
        loaderValidation();
        RenewalPageObjects.mandatoryRulesCheckBox4.click();
        loaderValidation();
        RenewalPageObjects.mandatoryRulesCheckBox5.click();
        RenewalPageObjects.rowsPerPage.click();
        waitToBeClickable(RenewalPageObjects.rowsPerPageSelect);
        RenewalPageObjects.rowsPerPageSelect.click();
        loaderValidation();
        RenewalPageObjects.mandatoryRulesCheckBox6.click();

        loaderValidation();
        RenewalPageObjects.mandatoryRulesSave.click();

        //Create Quote Button
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.createQuoteButtonRenewal);
        RenewalPageObjects.createQuoteButtonRenewal.click();

        //Quote Number
        loaderValidation();
        String quoteNumberRenewal = RenewalPageObjects.quoteNumberRenewal.getText();
        System.out.println("Quote Number Renewal = " + quoteNumberRenewal);


        //Create Quote page__________________________________________________________________________

        //Quote Proposal Button
        //CreateQuotePageObjects.quoteProposalButton.click();

        //Actions Button and Bind Quote
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.actionsButtonQuotePage);
        RenewalPageObjects.actionsButtonQuotePage.click();

        //Bind Quote
        visiblityOfElement(RenewalPageObjects.bindQuote);
        RenewalPageObjects.bindQuote.click();

        //Bind Button
        visiblityOfElement(RenewalPageObjects.bindButton);
        RenewalPageObjects.bindButton.click();

        //Bind Policy Page____________________________________________________________________________

        //Policy Number
        loaderValidation();
        visiblityOfElement(RenewalPageObjects.policyNumberRenewal);
        String policyNumberRenewal = RenewalPageObjects.policyNumberRenewal.getText();
        System.out.println("Policy Number Renewal = " + policyNumberRenewal);

        //Actions Button
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.actionsButtonBoundPage);
        RenewalPageObjects.actionsButtonBoundPage.click();

        //Issue Policy
        visiblityOfElement(RenewalPageObjects.issuePolicy);
        RenewalPageObjects.issuePolicy.click();

        //Insured Billing Contact Name
        loaderValidation();
        visiblityOfElement(RenewalPageObjects.insuredBillingContactName);
        RenewalPageObjects.insuredBillingContactName.sendKeys("test_CA");

        //Insured Billing Contact Email
        loaderValidation();
        visiblityOfElement(RenewalPageObjects.insuredBillingContactEmail);
        RenewalPageObjects.insuredBillingContactEmail.sendKeys("anger21@gmail.com");

        //Save Button after entering insured billing contact name and email
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.saveButtonBoundPage);
        RenewalPageObjects.saveButtonBoundPage.click();


        //Issue Policy Button
        loaderValidation();
        waitToBeClickable(RenewalPageObjects.issueButton);
        RenewalPageObjects.issueButton.click();

        //Issue Policy Page_____________________________________________________________________________

        //Policy Number After Issue
        loaderValidation();
        visiblityOfElement(RenewalPageObjects.policyNumberAfterIssuePolicy);
        String policyNumber = RenewalPageObjects.policyNumberAfterIssuePolicy.getText();
        System.out.println(policyNumber);


    }

}

