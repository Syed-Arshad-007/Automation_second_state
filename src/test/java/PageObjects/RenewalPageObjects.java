package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RenewalPageObjects {

    //Account Page
    @FindBy(xpath = "//h6[contains (text(),'Submission')]")
    public static WebElement subNumberRenewal;

    @FindBy(xpath = "//div[contains(text(),'RENE')]")
    public static WebElement submissionType;

    @FindBy(xpath = "//span[text() = 'Update Submission']")
    public static WebElement updateSubmissionButtonRenewal;

    //UnderwriterPage
    @FindBy(xpath = "//span[text() = 'Next']")
    public static WebElement nextButtonUnderwriterPageRenewal;

    //Policy Page
    @FindBy(xpath = "//span[text() = 'Next']")
    public static WebElement nextButtonPolicyPageRenewal;

    //Risk Coverage States and Locations Page
    @FindBy(xpath = "//span[text() = 'State']/following-sibling::span")
    public static WebElement stateAddIcon;

    @FindBy(id = "State")
    public static WebElement stateDropdown;

    @FindBy(xpath = "//li[@data-value = 'CO']")
    public static WebElement stateSelect;

    @FindBy(xpath = "//ul[@role = 'listbox'][@aria-labelledby = 'State_label']/li[33]")
    public static List<WebElement> stateList;

    @FindBy(xpath = "//span[text() = 'Save']")
    public static WebElement saveButtonState;

    @FindBy(xpath = "//span[text() = 'Risk Schedule']/preceding-sibling::span")
    public static WebElement stateRiskScheduleExpand;

    @FindBy(xpath = "//span[text() = 'Location and Classification Information']/preceding-sibling::span")
    public static WebElement locationExpand;

    @FindBy(xpath = "//h6[text() = 'Location']/child::button")
    public static WebElement locationAddIcon;

    @FindBy(name = "LocationName")
    public static WebElement locationName;

    @FindBy(name = "AddressLine1")
    public static WebElement addressLine1;

    @FindBy(name = "City")
    public static WebElement city;

    @FindBy(id = "SublineState")
    public static WebElement sublineState;

    @FindBy(xpath = "//li[@data-value = 'CO-Premises/Operations and Products/Completed Operations']")
    public static WebElement sublineStateSelect;

    @FindBy(id = "ZipCode")
    public static WebElement zipcode;

    @FindBy(xpath = "//li[@data-value = '80001']")
    public static WebElement zipcodeSelect;

    @FindBy(name = "ISOCapindexScore")
    public static WebElement isoCapscore;

    @FindBy(id = "LocationOperations")
    public static WebElement locationOperationsDropdown;

    @FindBy(xpath = "//li[text() = 'Manufacturing']")
    public static WebElement locationOperationsSelect;

    @FindBy(id = "PremisesOperationsTerr")
    public static WebElement premisesOperationsterr;

    @FindBy(xpath = "//li[@data-value = 'Albany']")
    public static WebElement premisesOpTerrSelect;

    @FindBy(xpath = "(//span[text() = 'Save'])[2]")
    public static WebElement saveLocation;

    @FindBy(xpath = "(//td[@class='MuiTableCell-root MuiTableCell-body']/child::button)[3]")
    public static WebElement locationExpAfterSav;

    @FindBy(xpath = "//span[text() = 'Classification']/preceding-sibling::span")
    public static WebElement classificationExp;

    @FindBy(xpath = "//h6[text() = 'Classification']/child::button")
    public static WebElement classificationAddIcon;

    @FindBy(name = "ClassificationNumber")
    public static WebElement classificationNumber;

    @FindBy(id = "ClassCode")
    public static WebElement classCodeDropdown;

    @FindBy(xpath = "//li[@data-value = '10020']")
    public static WebElement classCodeSelect;

    @FindBy(name = "PremOpsExposure")
    public static WebElement premOpsExposure;

    @FindBy(xpath = "//input[@name = 'ProdsCompldOpsELPOverride']")
    public static WebElement estimatedLossPotentialOverride;

    @FindBy(xpath = "(//span[text() = 'Save'])[3]")
    public static WebElement classificationSaveButton;

    @FindBy(xpath = "//span[text() = 'Next']")
    public static WebElement nextButtonStatesAndLocations;

    //Product Selection Page
    @FindBy(xpath = "(//span[text() = 'Save'])[1]")
    public static WebElement saveButtonUnderPrimaryState;

    @FindBy(xpath = "(//span[text() = 'Save'])[2]")
    public static WebElement saveButtonUnderLocation;

    @FindBy(xpath = "//span[text() = 'Rate']")
    public static WebElement rateButton;

    @FindBy(xpath = "//h6[text() = 'General Liability - Insights']/following::span[1]")
    public static WebElement generalLiabilityInsightsExpand;

    @FindBy(xpath = "//h6[text() = 'General Liability - Insights']/following::span[1]")
    public static WebElement generalLiabilityInsightsExpand1;

    @FindBy(xpath = "(//input[@name = 'Satisfied'])[1]")
    public static WebElement mandatoryRulesCheckBox1;

    @FindBy(xpath = "(//input[@name = 'Satisfied'])[2]")
    public static WebElement mandatoryRulesCheckBox2;

    @FindBy(xpath = "(//input[@name = 'Satisfied'])[3]")
    public static WebElement mandatoryRulesCheckBox3;

    @FindBy(xpath = "(//input[@name = 'Satisfied'])[4]")
    public static WebElement mandatoryRulesCheckBox4;

    @FindBy(xpath = "(//input[@name = 'Satisfied'])[5]")
    public static WebElement mandatoryRulesCheckBox5;

    @FindBy(xpath = "(//div[text() = '5'])[8]")
    public static WebElement rowsPerPage;

    @FindBy(xpath = "//li[@data-value = '10']")
    public static WebElement rowsPerPageSelect;

    @FindBy(xpath = "(//input[@name = 'Satisfied'])[6]")
    public static WebElement mandatoryRulesCheckBox6;

    @FindBy(xpath = "(//span[text() = 'Save'])[6]")
    public static WebElement mandatoryRulesSave;

    @FindBy(xpath = "//span[text() = 'Create Quote']")
    public static WebElement createQuoteButtonRenewal;

    @FindBy(xpath = "//h6[contains(text(),'Quote')]")
    public static WebElement quoteNumberRenewal;

    //Create Quote Page
    @FindBy(xpath = "//button[text() = 'QuoteProposal']")
    public static WebElement quoteProposalButton;

    @FindBy(xpath = "//span[text() = 'Actions']")
    public static WebElement actionsButtonQuotePage;

    @FindBy(xpath = "//li[text() ='BIND QUOTE']")
    public static WebElement bindQuote;

    @FindBy(xpath = "//span[text() = 'Bind']")
    public static WebElement bindButton;

    //Bind Quote Page
    @FindBy(xpath = "//h6[contains(text(),'Policy')]")
    public static WebElement policyNumberRenewal;

    @FindBy(xpath = "//span[text() = 'Actions']")
    public static WebElement actionsButtonBoundPage;

    @FindBy(xpath = "//li[text() = 'ISSUE POLICY']")
    public static WebElement issuePolicy;

    @FindBy(xpath = "//input[@name = 'InsuredBillingContactName']")
    public static WebElement insuredBillingContactName;

    @FindBy(xpath = "//input[@name = 'InsuredBillingContactEmail']")
    public static WebElement insuredBillingContactEmail;

    @FindBy(xpath = "//span[text() = 'Save']")
    public static WebElement saveButtonBoundPage;

    @FindBy(xpath = "//span[text() = 'Issue']")
    public static WebElement issueButton;

    //Issue Policy Page
    @FindBy(xpath = "//h6[contains(text(),'(Issued)')]")
    public static WebElement policyNumberAfterIssuePolicy;

    @FindBy(xpath = "//button[text() = 'PolicyIssuance']")
    public static WebElement policyIssuanceButton;

    @FindBy(xpath = "//span[text() = 'Actions']")
    public static WebElement actionsButtonIssuePage;


}
