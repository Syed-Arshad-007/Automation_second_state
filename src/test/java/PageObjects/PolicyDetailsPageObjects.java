package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PolicyDetailsPageObjects {
    @FindBy(id = "State")
    public static WebElement stateDropdown;

    @FindBy(xpath = "//li[@data-value = 'CA']")
    public static WebElement stateSelect;

    @FindBy(xpath = "//ul[@role = 'listbox'][@aria-labelledby = 'State_label']/li[5]")
    public static List<WebElement> stateList;

    @FindBy(id = "Subline")
    public static WebElement sublineDropdown;

    @FindBy(xpath = "//li[@data-value = 'Premises/Operations and Products/Completed Operations']")
    public static WebElement sublineSelect;

    @FindBy(id = "CommercialPesticideApplicators")
    public static WebElement commercialPesticide;

    @FindBy(xpath = "//li[@data-value = 'No']")
    public static WebElement commercialPesticideSelect;

    @FindBy(id = "CyberCoverage")
    public static WebElement cyberCoverage;

    @FindBy(xpath = "//li[text() = 'Yes']")
    public static WebElement cyberCoverageSelect;

    @FindBy(name = "NumberOfFullTimeEmployees")
    public static WebElement noOfFullTimeEmployees;

    @FindBy(name = "NumberOfPartTimeEmployees")
    public static WebElement noOfPartTimeEmployees;

    @FindBy(xpath = "//input[@name= 'NumberOfStaffedLocations']")
    public static WebElement numberOfStaffedLocations;

    @FindBy(xpath = "//input[@name= 'NumberOfEPLIClaims']")
    public static WebElement numberOfEPLIClaims;

    @FindBy(xpath = "//span[text() = 'Save']")
    public static WebElement saveButton;

    @FindBy(xpath = "//*[@d = 'M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm5 11h-4v4h-2v-4H7v-2h4V7h2v4h4v2z']")
    public static WebElement additionalCoveragePlusIcon;

    @FindBy(id = "asynchronous-demo")
    public static WebElement additionalCoverageName;

    @FindBy(name = "FungiBacteriaLiabAggregateLimit")
    public static WebElement fungiOrBacteriaLimit;

    @FindBy(name = "ManualPremium")
    public static WebElement manualPremium;

    @FindBy(xpath = "//span[text() = 'Save Coverage']")
    public static WebElement saveCoverage;

    @FindBy(xpath = "//span[text() = 'Next']")
    public static WebElement nextButtonPolicyPage;
}
