package TestCases;

import CommonFunctions.CommonFunctions;
import PageObjects.BoundPageObjects;
import PageObjects.IssuePolicyPageObjects;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;


public class IssuePolicyPageTestCase extends CommonFunctions {

    @Test
    public static void issuePolicyPage() throws IOException {
        testCase = extentReport.createTest("Issue policy page testcase started Successfully");
        testCase = extentReport.createTest("Issue policy page testcase completed Successfully");


        //Issue Policy Page
        PageFactory.initElements(driver, IssuePolicyPageObjects.class);

        loaderValidation();
        visiblityOfElement(IssuePolicyPageObjects.policyNumberAfterIssuePolicy);
       // System.out.println(policyNumber);
        writeTestResultsinExcelPolicy();

        //policy Issuance Button
        // IssuePolicyPageObjects.policyIssuanceButton.click();

        //Actions Button
        loaderValidation();
        waitToBeClickable(IssuePolicyPageObjects.actionsButton);
        IssuePolicyPageObjects.actionsButton.click();

        //Endorse Policy
        loaderValidation();
        visiblityOfElement(IssuePolicyPageObjects.endorsePolicy);
        IssuePolicyPageObjects.endorsePolicy.click();

        //Endorsement Effective Date
        visiblityOfElement(IssuePolicyPageObjects.endorsementEffectiveDate);
        IssuePolicyPageObjects.endorsementEffectiveDate.click();

        //Endorsement Effective Date Next button
        loaderValidation();
        waitToBeClickable(IssuePolicyPageObjects.endorsementEffectiveDateNextButton1);
        IssuePolicyPageObjects.endorsementEffectiveDateNextButton1.click();
        waitToBeClickable(IssuePolicyPageObjects.endorsementEffectiveDateNextButton2);
        IssuePolicyPageObjects.endorsementEffectiveDateNextButton2.click();
        waitToBeClickable(IssuePolicyPageObjects.endorsementEffectiveDateNextButton3);
        IssuePolicyPageObjects.endorsementEffectiveDateNextButton3.click();

        //Endorsement Effective Date To Be Given
        waitToBeClickable(IssuePolicyPageObjects.endorsementEffectiveDateToBeGiven);
        IssuePolicyPageObjects.endorsementEffectiveDateToBeGiven.click();

        //Endorsement Effective Ok Button
        waitToBeClickable(IssuePolicyPageObjects.endorsementEffectiveOkButton);
        IssuePolicyPageObjects.endorsementEffectiveOkButton.click();

        //Endorsement Type
        waitToBeClickable(IssuePolicyPageObjects.endorsementType);
        IssuePolicyPageObjects.endorsementType.click();

        //Endorsement Type Select
        waitToBeClickable(IssuePolicyPageObjects.endorsementTypeSelect);
        IssuePolicyPageObjects.endorsementTypeSelect.click();

        //Endorse Button
        waitToBeClickable(IssuePolicyPageObjects.endorseButton);
        IssuePolicyPageObjects.endorseButton.click();

    }
}
