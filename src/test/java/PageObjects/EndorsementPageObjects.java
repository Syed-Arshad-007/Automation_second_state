package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EndorsementPageObjects {

    //Account Page
    @FindBy(xpath = "//h6[contains (text(),'Submission')]")
    public static WebElement subNumberEndorsement;

    @FindBy(xpath = "//div[contains(text(),'ENDO')]")
    public static WebElement submissionType;

    @FindBy(xpath = "//span[text() = 'Update Submission']")
    public static WebElement updateSubmissionButtonEndorsement;

    //UnderwriterPage
    @FindBy(xpath = "//input[@id = 'EndtRequestDate']")
    public static WebElement endoRequestDate;

    @FindBy(xpath = "//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendarHeader-transitionContainer']/following-sibling::button")
    public static WebElement endoRequestDateNextButton1;

    @FindBy(xpath = "//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendarHeader-transitionContainer']/following-sibling::button")
    public static WebElement endoRequestDateNextButton2;

    @FindBy(xpath = "//p[text() = '1']")
    public static WebElement endoRequestDateToBeGiven;

    @FindBy(xpath = "//span[text() = 'OK']")
    public static WebElement endoRequestDateOkButton;

    @FindBy(xpath = "//span[text() = 'Next']")
    public static WebElement nextButtonUnderwriterPageEndo;

   //Policy Page
    @FindBy(xpath = "//span[text() = 'Next']")
     public static WebElement nextButtonPolicyPageEndo;

    //Risk Coverage States and Locations Page
    @FindBy(xpath = "//span[text() = 'State']/following-sibling::span")
    public static WebElement stateAddIcon;

    @FindBy(id = "State")
    public static WebElement stateDropdown;

    @FindBy(xpath = "//li[@data-value = 'NY']")
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

    @FindBy(xpath = "//li[@data-value = 'NY-Premises/Operations and Products/Completed Operations']")
    public static WebElement sublineStateSelect;

    @FindBy(name = "ISOCapindexScore")
    public static WebElement isoCapscore;

    @FindBy(id = "County")
    public static WebElement county;

    @FindBy(xpath = "//li[@data-value = 'Albany']")
    public static WebElement countySelect;

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

    @FindBy(xpath = "(//td[@class='MuiTableCell-root MuiTableCell-body']/child::button)[2]")
    public static WebElement locationExpAfterSav;

    @FindBy(xpath = "//span[text() = 'Classification']/preceding-sibling::span")
    public static WebElement classificationExp;

    @FindBy(xpath = "//h6[text() = 'Classification']/child::button")
    public static WebElement classificationAddIcon;

    @FindBy(name = "ClassificationNumber")
    public static WebElement classificationNumber;

    @FindBy(id = "ClassCode")
    public static WebElement classCodeDropdown;

    @FindBy(xpath = "//li[@data-value = '10015']")
    public static WebElement classCodeSelect;

    @FindBy(name = "PremOpsExposure")
    public static WebElement premOpsExposure;

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

    @FindBy(xpath = "(//span[text() = 'Save'])[4]")
    public static WebElement mandatoryRulesSave;

    @FindBy(xpath = "//span[text() = 'Create Quote']")
    public static WebElement createQuoteButtonEndo;

    @FindBy(xpath = "//h6[contains(text(),'Quote')]")
    public static WebElement quoteNumberEndo;

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
    public static WebElement policyNumberEndo;

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

    @FindBy(xpath = "//li[text() = 'RENEW POLICY']")
    public static WebElement reNewPolicy;

    @FindBy(xpath = "//span[text() = 'Renew']")
    public static WebElement reNewPolicyButton;



}
