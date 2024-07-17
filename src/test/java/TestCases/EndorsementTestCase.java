package TestCases;

import CommonFunctions.CommonFunctions;
import PageObjects.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static CommonFunctions.CommonFunctions.waitToBeClickable;
import static TestCases.AccountPageTestcase.login;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class EndorsementTestCase extends CommonFunctions {
    static Actions actions;

    @Test
    public static void endrorsementTestCase() {


        //Account Page_______________________________________________________________________________
        PageFactory.initElements(driver, EndorsementPageObjects.class);
        actions = new Actions(driver);
        //Submission Number
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.subNumberEndorsement);
        String submissionNumberEndorsement = EndorsementPageObjects.subNumberEndorsement.getText();
        System.out.println(submissionNumberEndorsement);

        //Submission Type
        loaderValidation();
        //waitToBeClickable(EndorsementPageObjects.submissionType);
        String submissionTypeEndorsement = EndorsementPageObjects.submissionType.getText();
        String expectedTitle = "GL-END";
        System.out.println(submissionTypeEndorsement);

        //Update Submission Endorsement
        loaderValidation();
        EndorsementPageObjects.updateSubmissionButtonEndorsement.click();

        //Underwriter Page_________________________________________________________________________

        //Endorsement Request Date
        actions.pause(Duration.ofSeconds(1)).perform();
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.endoRequestDate);
        EndorsementPageObjects.endoRequestDate.click();
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.endoRequestDateNextButton1);
        EndorsementPageObjects.endoRequestDateNextButton1.click();
        waitToBeClickable(EndorsementPageObjects.endoRequestDateNextButton2);
        EndorsementPageObjects.endoRequestDateNextButton2.click();
        waitToBeClickable(EndorsementPageObjects.endoRequestDateToBeGiven);
        EndorsementPageObjects.endoRequestDateToBeGiven.click();
        waitToBeClickable(EndorsementPageObjects.endoRequestDateOkButton);
        EndorsementPageObjects.endoRequestDateOkButton.click();

        //Next Button Underwriter page
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.nextButtonUnderwriterPageEndo);
        EndorsementPageObjects.nextButtonUnderwriterPageEndo.click();

        //Policy Details Page
        loaderValidation();
        EndorsementPageObjects.nextButtonPolicyPageEndo.click();

        //Risk Coverage States and Locations Page__________________________________________________

        //State Add Icon
        loaderValidation();
        EndorsementPageObjects.stateAddIcon.click();

        //Secondary state select
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.stateDropdown);
        EndorsementPageObjects.stateDropdown.click();
        loaderValidation();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        waitToBeClickable(EndorsementPageObjects.stateSelect);
        executor.executeScript("arguments[0].scrollIntoView();", EndorsementPageObjects.stateSelect);
        EndorsementPageObjects.stateSelect.click();

        //State Save Button
        loaderValidation();
        actions.pause(Duration.ofSeconds(2)).perform();
        waitToBeClickable(EndorsementPageObjects.saveButtonState);
        EndorsementPageObjects.saveButtonState.click();

        //Risk schedule expand button
        loaderValidation();
        visibilityOf(EndorsementPageObjects.stateRiskScheduleExpand);
        actions.moveToElement(EndorsementPageObjects.stateRiskScheduleExpand).click().perform();

        //Location Expand Button
        loaderValidation();
        visibilityOf(EndorsementPageObjects.locationExpand);
        actions.moveToElement(EndorsementPageObjects.locationExpand).click().build().perform();

        //Location Add icon
        loaderValidation();
        visibilityOf(EndorsementPageObjects.locationAddIcon);
        EndorsementPageObjects.locationAddIcon.click();

        //Location Name text field
        loaderValidation();
        EndorsementPageObjects.locationName.sendKeys("Harrison");

        //Address line1
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.addressLine1);
        EndorsementPageObjects.addressLine1.sendKeys("AddressLine1");

        //City
        loaderValidation();
        EndorsementPageObjects.city.sendKeys("Los Angeles");

        //sublineState
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.sublineState);
        EndorsementPageObjects.sublineState.click();
        waitToBeClickable(EndorsementPageObjects.sublineStateSelect);
        EndorsementPageObjects.sublineStateSelect.click();

        //ISO CAP index score
        loaderValidation();
        EndorsementPageObjects.isoCapscore.sendKeys("500");

        //County
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.county);
        EndorsementPageObjects.county.click();
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.countySelect);
        EndorsementPageObjects.countySelect.click();

        //Location Operations
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.locationOperationsDropdown);
        EndorsementPageObjects.locationOperationsDropdown.click();
        waitToBeClickable(EndorsementPageObjects.locationOperationsSelect);
        EndorsementPageObjects.locationOperationsSelect.click();

        //Premises Operations Territory
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.premisesOperationsterr);
        EndorsementPageObjects.premisesOperationsterr.click();
        actions.pause(Duration.ofSeconds(1)).perform();
        waitToBeClickable(EndorsementPageObjects.premisesOpTerrSelect);
        EndorsementPageObjects.premisesOpTerrSelect.click();

        //save Button Location
        loaderValidation();
        EndorsementPageObjects.saveLocation.click();

        //Location Expand after saving
        //loaderValidationLocationExpandAfterSave();
        loaderValidation();
        actions.pause(Duration.ofSeconds(1)).perform();
        EndorsementPageObjects.locationExpAfterSav.click();

        //Classification Expand
        loaderValidation();
        visibilityOf(EndorsementPageObjects.classificationExp);
        EndorsementPageObjects.classificationExp.click();

        //Classification Add Icon
        loaderValidation();
        visibilityOf(EndorsementPageObjects.classificationAddIcon);
        EndorsementPageObjects.classificationAddIcon.click();

        //Classification Number
        loaderValidation();
        EndorsementPageObjects.classificationNumber.sendKeys("2");

        //Class Code
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.classCodeDropdown);
        EndorsementPageObjects.classCodeDropdown.click();
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.classCodeSelect);
        EndorsementPageObjects.classCodeSelect.click();

        //Prem ops Exposure
        loaderValidation();
        visibilityOf(EndorsementPageObjects.premOpsExposure);
        EndorsementPageObjects.premOpsExposure.sendKeys("3000000");

        //Classification Save Button
        loaderValidation();
        EndorsementPageObjects.classificationSaveButton.click();

        //Next Button states and locations
        loaderValidation();
        EndorsementPageObjects.nextButtonStatesAndLocations.click();

        //Product Selection Page__________________________________________________________________________

        //Save button under Primary state
        loaderValidation();
        visiblityOfElement(EndorsementPageObjects.saveButtonUnderPrimaryState);
        loaderValidation();
        EndorsementPageObjects.saveButtonUnderPrimaryState.click();

        //Save button under Location
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.saveButtonUnderLocation);
        EndorsementPageObjects.saveButtonUnderLocation.click();

        //Rate Button
        loaderValidation();
        actions.moveToElement(EndorsementPageObjects.rateButton).click().build().perform();


        //Create Quote Button
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.createQuoteButtonEndo);
        EndorsementPageObjects.createQuoteButtonEndo.click();

        //Quote Number
        loaderValidation();
        actions.pause(Duration.ofSeconds(2));
        waitToBeClickable(EndorsementPageObjects.quoteNumberEndo);
        String quoteNumberEndo = EndorsementPageObjects.quoteNumberEndo.getText();
        System.out.println("Quote Number Endorsement = " + quoteNumberEndo);


        //Create Quote page__________________________________________________________________________

        //Quote Proposal Button
        //CreateQuotePageObjects.quoteProposalButton.click();

        //Actions Button and Bind Quote
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.actionsButtonQuotePage);
        EndorsementPageObjects.actionsButtonQuotePage.click();

        //Bind Quote
        loaderValidation();
        visiblityOfElement(EndorsementPageObjects.bindQuote);
        EndorsementPageObjects.bindQuote.click();

        //Bind Button
        loaderValidation();
        visiblityOfElement(EndorsementPageObjects.bindButton);
        EndorsementPageObjects.bindButton.click();

        //Bind Policy Page____________________________________________________________________________

        //Policy Number
        loaderValidation();
        visiblityOfElement(EndorsementPageObjects.policyNumberEndo);
        String policyNumberEndo = EndorsementPageObjects.policyNumberEndo.getText();
        System.out.println("Policy Number Endo = " + policyNumberEndo);

        //Actions Button
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.actionsButtonBoundPage);
        EndorsementPageObjects.actionsButtonBoundPage.click();

        //Issue Policy
        visiblityOfElement(EndorsementPageObjects.issuePolicy);
        EndorsementPageObjects.issuePolicy.click();

        //Insured Billing Contact Name
        loaderValidation();
        visiblityOfElement(EndorsementPageObjects.insuredBillingContactName);
        EndorsementPageObjects.insuredBillingContactName.sendKeys("test_CA");

        //Insured Billing Contact Email
        loaderValidation();
        visiblityOfElement(EndorsementPageObjects.insuredBillingContactEmail);
        EndorsementPageObjects.insuredBillingContactEmail.sendKeys("anger21@gmail.com");

        //Save Button after entering insured billing contact name and email
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.saveButtonBoundPage);
        EndorsementPageObjects.saveButtonBoundPage.click();

        //Issue Policy Button
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.issueButton);
        EndorsementPageObjects.issueButton.click();

        //Issue Policy Page_____________________________________________________________________________

        //Policy Number After Issue
        loaderValidation();
        visiblityOfElement(EndorsementPageObjects.policyNumberAfterIssuePolicy);
        String policyNumber = EndorsementPageObjects.policyNumberAfterIssuePolicy.getText();
        System.out.println(policyNumber);

        //policy Issuance Button
        // IssuePolicyPageObjects.policyIssuanceButton.click();

        //Actions Button
        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.actionsButtonIssuePage);
        EndorsementPageObjects.actionsButtonIssuePage.click();

        //Renew Policy
        loaderValidation();
        visiblityOfElement(EndorsementPageObjects.reNewPolicy);
        EndorsementPageObjects.reNewPolicy.click();

        //Renew Button
        waitToBeClickable(EndorsementPageObjects.reNewPolicyButton);
        EndorsementPageObjects.reNewPolicyButton.click();


    }

}

