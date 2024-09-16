package PageObjects;

import CommonFunctions.CommonFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoundPageObjects extends CommonFunctions {
    WebDriver driver;

    static Logger logger = Logger.getLogger("BoundPageObjects.class");

    @FindBy(xpath = "//h6[contains(text(),'Policy')]")
    public static WebElement policyNumber;

    @FindBy(xpath = "//button[text() = 'QuoteProposal']")
    public static WebElement quoteProposalButton;

    @FindBy(xpath = "//span[text() = 'Actions']")
    public static WebElement actionsButton;

    @FindBy(xpath = "//li[text() = 'ISSUE POLICY']")
    public static WebElement issuePolicy;

    @FindBy(xpath = "//input[@name = 'InsuredBillingContactName']")
    public static WebElement insuredBillingContactName;

    @FindBy(xpath = "//input[@name = 'InsuredBillingContactEmail']")
    public static WebElement insuredBillingContactEmail;

    @FindBy(xpath = "//span[text() = 'Save']")
    public static WebElement saveButton;

    @FindBy(xpath = "//span[text() = 'Issue']")
    public static WebElement issueButton;

    public BoundPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void boundPage() {

        //Bound page
        PageFactory.initElements(driver, BoundPageObjects.class);

        logger.info("policy number generated");
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
