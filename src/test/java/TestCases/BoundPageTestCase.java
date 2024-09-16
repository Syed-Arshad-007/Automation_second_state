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

        testCase = extentReport.createTest("Bound page testcase started Successfully");

        BoundPageObjects bound = new BoundPageObjects(driver);
        bound.boundPage();

        testCase = extentReport.createTest("Bound page testcase completed Successfully");
    }
}