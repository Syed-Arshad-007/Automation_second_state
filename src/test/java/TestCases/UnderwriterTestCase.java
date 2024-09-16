package TestCases;

import CommonFunctions.CommonFunctions;
import PageObjects.AccountPageObjects;
import PageObjects.FindSubmissionPageObjects;
import PageObjects.UnderwriterPageObjects;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static TestCases.AccountPageTestcase.login;

public class UnderwriterTestCase extends CommonFunctions {

    /*  @Test
      public static void findSubmission(){
            //Find Submission Page
            login();

            PageFactory.initElements(driver, FindSubmissionPageObjects.class);
            actions = new Actions(driver);
            //Find Sub Link
            visiblityOfElement(FindSubmissionPageObjects.findSubLink);
            FindSubmissionPageObjects.findSubLink.click();

            //Submission Number Text Field
            waitToBeClickable(FindSubmissionPageObjects.submissionNumber);
            FindSubmissionPageObjects.submissionNumber.sendKeys("SN43290");

            //Submission Number Text Field
            waitToBeClickable(FindSubmissionPageObjects.submissionNumber);
            FindSubmissionPageObjects.submissionNumber.sendKeys("SN43582");

            //Find Submission Button
            waitToBeClickable(FindSubmissionPageObjects.findSubmissionButton);
            FindSubmissionPageObjects.findSubmissionButton.click();

            //Clicking Submission Number After Find
            waitToBeClickable(FindSubmissionPageObjects.clickingSubNumberAfterFind);
            actions.moveToElement(FindSubmissionPageObjects.clickingSubNumberAfterFind).click().perform();

            //Clicking Submission Number After Find
            waitToBeClickable(FindSubmissionPageObjects.clickingSubNumberAfterFindEndorsement);
            actions.moveToElement(FindSubmissionPageObjects.clickingSubNumberAfterFindEndorsement).click().perform();

            //Clicking Submission Number After Find
            waitToBeClickable(FindSubmissionPageObjects.clickingSubNumberAfterFind);
            actions.moveToElement(FindSubmissionPageObjects.clickingSubNumberAfterFind).click().perform();

            /*  PageFactory.initElements(driver, AccountPageObjects.class);
            //Update Submission Button
            loaderValidation();
            visiblityOfElement(AccountPageObjects.updateSubmissionButton);
            AccountPageObjects.updateSubmissionButton.click();
      } */

    @Test
    public void underwriterPage() throws IOException {

        testCase = extentReport.createTest("Underwriter page testcase started Successfully");
        testCase = extentReport.createTest("Underwriter page testcase completed Successfully");

        //Underwriter Page --------------------------------------
        PageFactory.initElements(driver, UnderwriterPageObjects.class);

        //Apply Additional Policy Fee
        waitToBeClickable(UnderwriterPageObjects.applyAdditionalPolicyFeeButton);
        UnderwriterPageObjects.applyAdditionalPolicyFeeButton.click();
        UnderwriterPageObjects.applyAdditionalPolicyFeeSelect.click();

        //Claims Over 1K
        UnderwriterPageObjects.claimsOver1K.sendKeys("1000");

        //Number Of Employees
        UnderwriterPageObjects.noOfEmployees.sendKeys("100");

        //Underwriter questions radio button
        UnderwriterPageObjects.serviceRepair.click();

        //Next Button
        UnderwriterPageObjects.nextButton.click();


    }
}
