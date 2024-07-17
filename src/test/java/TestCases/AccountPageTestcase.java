package TestCases;

import CommonFunctions.CommonFunctions;
import PageObjects.AccountPageObjects;
import PageObjects.LoginPageObjects;
import PageObjects.PolicyDetailsPageObjects;
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
    public void accountPage(String AccountName,String DBAName,String Address,String	NAICSCode,String	NAICSDescription,String	IntelliScore,String	FinancialStabilityScore
    ) throws IOException, InterruptedException {

        //Login
        login();

        AccountPageObjects account = new AccountPageObjects(driver);
        account.accountPage(AccountName,DBAName,Address,NAICSCode,NAICSDescription,IntelliScore,FinancialStabilityScore);


    }
}
