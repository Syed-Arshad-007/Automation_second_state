package PageObjects;

import CommonFunctions.CommonFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;

import static CommonFunctions.CommonFunctions.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AccountPageObjects extends CommonFunctions {

    WebDriver driver;

    static Logger logger = Logger.getLogger("AccountPageObjects.class");

    @FindBy(xpath = "//a[contains(text(),'Start New Submission')]")
    public static WebElement startNewSubmissionLink;

    @FindBy(xpath = "//span[text() = 'Select LOB(S)']")
    public static WebElement selectLobOutputText;

    @FindBy(xpath = "//input[@value = 'GeneralLiability']")
    public static WebElement lobSelection;

    @FindBy(xpath = "//span[text() = 'Account Information']")
    public static WebElement accountInformationOutputText;

    @FindBy(xpath = "//div[text() = 'NEW-BUSINESS']")
    public static WebElement submissionType;

    @FindBy(xpath = "//div[@class='custom-loader-container']")
    public static WebElement loader;

    @FindBy(xpath = "//input[@name = 'IsNewAccount']")
    public static WebElement isNewAccount;

    @FindBy(xpath = "//input[@name = 'AccountName']")
    public static WebElement accountName;

    @FindBy(xpath = "//input[@name = 'DBA']")
    public static WebElement dbaName;

    @FindBy(xpath = "//input[@placeholder= 'Enter Full Address * *']")
    public static WebElement address;

    @FindBy(id = "BusinessStartDate")
    public static WebElement businessStartDate;

    @FindBy(xpath = "//div[@class = 'MuiPickersSlideTransition-transitionContainer MuiPickersCalendarHeader-transitionContainer']/preceding-sibling::button")
    public static WebElement businessStDatePreviousButton;

    @FindBy(xpath = "//p[text() = '15']")
    public static WebElement businessStDateToBeGiven;

    @FindBy(xpath = "//span[text() = 'OK']")
    public static WebElement businessStDateOkButton;

    @FindBy(xpath = "//input[@name = 'NAICSCode']")
    public static WebElement naicsCode;

    @FindBy(xpath = "//input[@name = 'NAICSDescription']")
    public static WebElement naicsDescription;

    @FindBy(xpath = "//input[@name = 'Intelliscore']")
    public static WebElement intelliscore;

    @FindBy(xpath = "//input[@name = 'FinancialStabilityScore']")
    public static WebElement financialStabilityScore;

    @FindBy(xpath = "//input[@name = 'PrimaryAccountContactPhone']")
    public static WebElement phoneNumber;

    @FindBy(id = "Name")
    public static WebElement agencyName;

    @FindBy(xpath = "//li[text() = 'Test Agency']")
    public static WebElement agencyNameSelect;

    @FindBy(id = "FirstName1")
    public static WebElement agentName;

    @FindBy(xpath = "//li[text() = 'Max']")
    public static WebElement agentNameSelect;

    @FindBy(xpath = "//input[@name = 'BillingMethod']")
    public static WebElement billingMethod;

    @FindBy(xpath = "//span[text() = 'Create Submission']")
    public static WebElement createSubmissionButton;


    @FindBy(xpath = "//h6[contains (text(),'Submission')]")
    public static WebElement subNumber;

    @FindBy(xpath = "//span[text() = 'Update Submission']")
    public static WebElement updateSubmissionButton;

    public AccountPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void accountPage(Map<String,String> accountpagedata) throws IOException, InterruptedException {

        //Explicit wait
        actions = new Actions(driver);

        logger.info("Home page displayed successfully");
        //Start New Submission Link
        waitToBeClickable(startNewSubmissionLink);
        AccountPageObjects.startNewSubmissionLink.click();

        logger.info("Account page started");
        //Lob Selection
        visiblityOfElement(AccountPageObjects.selectLobOutputText);
        AccountPageObjects.lobSelection.click();

        //Is New Account
        loaderValidation();
        AccountPageObjects.isNewAccount.click();

        //Account Name
        loaderValidation();
        AccountPageObjects.accountName.sendKeys(accountpagedata.get("AccountName"));

        //DBA Name
        waitToBeClickable(AccountPageObjects.dbaName);
        AccountPageObjects.dbaName.sendKeys(accountpagedata.get("DBAName"));

        //Address
        visiblityOfElement(AccountPageObjects.dbaName);
        waitToBeClickable(AccountPageObjects.address);
        AccountPageObjects.address.sendKeys(accountpagedata.get("Address"));
        actions.pause(Duration.ofSeconds(2)).perform();
        loaderValidation();
        AccountPageObjects.address.sendKeys(Keys.ARROW_DOWN);
        loaderValidation();
        waitToBeClickable(AccountPageObjects.address);
        AccountPageObjects.address.sendKeys(Keys.ENTER);


        //Business Start Date
        visibilityOf(AccountPageObjects.naicsDescription);
        loaderValidation();
        actions.pause(Duration.ofSeconds(1));
        waitToBeClickable(AccountPageObjects.businessStartDate);
        actions.moveToElement(AccountPageObjects.businessStartDate).click().build().perform();
        waitToBeClickable(AccountPageObjects.businessStDatePreviousButton);
        AccountPageObjects.businessStDatePreviousButton.click();
        loaderValidation();
        waitToBeClickable(AccountPageObjects.businessStDateToBeGiven);
        AccountPageObjects.businessStDateOkButton.click();

        //Naics Code
        AccountPageObjects.naicsCode.sendKeys(accountpagedata.get("NAICSCode"));

        //Naics Description
        AccountPageObjects.naicsDescription.sendKeys(accountpagedata.get("NAICSDescription"));

        //IntelliScore
        AccountPageObjects.intelliscore.sendKeys(accountpagedata.get("IntelliScore"));

        //Financial Stability Score
        AccountPageObjects.financialStabilityScore.sendKeys(accountpagedata.get("FinancialStabilityScore"));

        //Agency Name
        waitToBeClickable(AccountPageObjects.agencyName);
        AccountPageObjects.agencyName.click();

        waitToBeClickable(AccountPageObjects.agencyNameSelect);
        AccountPageObjects.agencyNameSelect.click();

        //Agent Name
        waitToBeClickable(AccountPageObjects.agentName);
        AccountPageObjects.agentName.click();

        loaderValidation();
        waitToBeClickable(AccountPageObjects.agentNameSelect);
        AccountPageObjects.agentNameSelect.click();


        //Billing Method
        AccountPageObjects.billingMethod.click();


        //Create Submission Button
        loaderValidation();
        actions.moveToElement(AccountPageObjects.createSubmissionButton).click().build().perform();

         logger.info("submission number generated");
        //Submission Number
        waitToBeClickable(AccountPageObjects.subNumber);
       // String submissionNumber = AccountPageObjects.subNumber.getText();
        writeTestResultsinExcel();

       // Assert.assertEquals("True","false");


    }

}
