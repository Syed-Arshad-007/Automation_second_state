package TestCases;

import CommonFunctions.CommonFunctions;
import PageObjects.BoundPageObjects;
import PageObjects.CreateQuotePageObjects;
import PageObjects.FindPolicyPageObjects;
import PageObjects.FindQuotePageObjects;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static TestCases.AccountPageTestcase.login;

public class BoundPageTestCase extends CommonFunctions {


    @Test
    public static void bindPage() {

        //Bound page
        PageFactory.initElements(driver, BoundPageObjects.class);

        //Policy Number
        loaderValidation();
        visiblityOfElement(BoundPageObjects.policyNumber);
        String policyNumber = BoundPageObjects.policyNumber.getText();
        System.out.println(policyNumber);

        //Actions Button
        loaderValidation();
        waitToBeClickable(BoundPageObjects.actionsButton);
        BoundPageObjects.actionsButton.click();

        //Issue Policy
        visiblityOfElement(BoundPageObjects.issuePolicy);
        BoundPageObjects.issuePolicy.click();

        //Insured Billing Contact Name
        loaderValidation();
        visiblityOfElement(BoundPageObjects.insuredBillingContactName);
        BoundPageObjects.insuredBillingContactName.sendKeys("test_CA");

        //Insured Billing Contact Email
        loaderValidation();
        visiblityOfElement(BoundPageObjects.insuredBillingContactEmail);
        BoundPageObjects.insuredBillingContactEmail.sendKeys("anger21@gmail.com");

        //Save Button after entering insured billing contact name and email
        loaderValidation();
        waitToBeClickable(BoundPageObjects.saveButton);
        BoundPageObjects.saveButton.click();

        //Issue Policy Button
        loaderValidation();
        waitToBeClickable(BoundPageObjects.issueButton);
        BoundPageObjects.issueButton.click();
    }
}