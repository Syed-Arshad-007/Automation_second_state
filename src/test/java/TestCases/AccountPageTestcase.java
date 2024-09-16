package TestCases;

import CommonFunctions.CommonFunctions;
import PageObjects.AccountPageObjects;
import PageObjects.LoginPageObjects;
import PageObjects.PolicyDetailsPageObjects;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;

import static CommonFunctions.CommonFunctions.driver;
import static CommonFunctions.CommonFunctions.properties;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AccountPageTestcase extends CommonFunctions {

    public static void login() {
        //Login
        actions = new Actions(driver);
        PageFactory.initElements(driver, LoginPageObjects.class);
        actions.pause(Duration.ofSeconds(2));
        LoginPageObjects.username.sendKeys(properties.getProperty("username"));
        actions.pause(Duration.ofSeconds(2));
        LoginPageObjects.password.sendKeys(properties.getProperty("password"));
        visiblityOfElement(LoginPageObjects.welcomeMessage);
        LoginPageObjects.submitButton.click();
    }

    @Test(dataProvider = "AccountPageData")
    public void accountPage(Map<String, String> accountpagedata) throws IOException, InterruptedException {

        //Login
        login();
        Logger logger = Logger.getLogger("AccountPageTestcase.class");
        logger.info("Login takes place successfully");
        testCase = extentReport.createTest("Account page testcase started Successfully");
        testCase = extentReport.createTest("Account page testcase completed Successfully");

        AccountPageObjects account = new AccountPageObjects(driver);
        account.accountPage(accountpagedata);



    }
}
