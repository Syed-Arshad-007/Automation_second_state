package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoundPageObjects {
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





}
