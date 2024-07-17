package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSelectionPageObjects {

    @FindBy(xpath = "(//span[text() = 'Save'])[1]")
    public static WebElement saveButtonUnderPrimaryState;

    @FindBy(xpath = "(//span[text() = 'Save'])[2]")
    public static WebElement saveButtonUnderLocation;

    @FindBy(xpath = "//span[text() = 'Rate']")
    public static WebElement rateButton;

    @FindBy(xpath = "//h6[text() = 'General Liability - Insights']/following::span[1]")
    public static WebElement generalLiabilityInsightsExpand1;

    @FindBy(xpath = "//h6[text() = 'General Liability - Insights']/following::span[1]")
    public static WebElement generalLiabilityInsightsExpand2;

    @FindBy(xpath = "//p[text() = 'Due to the number of full time employees, in order to offer EPLI coverage a referral to HSB is required.']/following::input[1]")
    public static WebElement mandatoryRulesCheckBox1;

    @FindBy(xpath = "//p[text() = 'The insured has had at least one EPLI claim, this requires a referral to HSB.']/following::input[1]")
    public static WebElement mandatoryRulesCheckBox2;


   // @FindBy(xpath = "(//input[@name = 'Satisfied'])[1]")
   // public static WebElement mandatoryRulesCheckBox1;

   // @FindBy(xpath = "(//input[@name = 'Satisfied'])[2]")
    //public static WebElement mandatoryRulesCheckBox2;

    @FindBy(xpath = "(//span[text() = 'Save'])[4]")
    public static WebElement mandatoryRulesSave;

    @FindBy(xpath = "//span[text() = 'Create Quote']")
    public static WebElement createQuoteButton;


}
