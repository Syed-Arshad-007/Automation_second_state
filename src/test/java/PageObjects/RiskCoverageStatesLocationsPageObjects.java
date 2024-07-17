package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class RiskCoverageStatesLocationsPageObjects {
    @FindBy(xpath = "(//*[@d = 'M8.59 16.59L13.17 12 8.59 7.41 10 6l6 6-6 6-1.41-1.41z'])[2]")
    public static WebElement stateRiskScheduleExpand;

    @FindBy(xpath = "(//*[@d = 'M8.59 16.59L13.17 12 8.59 7.41 10 6l6 6-6 6-1.41-1.41z'])[2]")
    public static WebElement locationExpand;

    @FindBy(xpath = "//h6[text() = 'Location']/child::button")
    public static WebElement locationAddIcon;

    @FindBy(name = "LocationName")
    public static WebElement locationName;

    @FindBy(name = "AddressLine1")
    public static WebElement addressLine1;

    @FindBy(name = "City")
    public static WebElement city;

    @FindBy(name = "ISOCapindexScore")
    public static WebElement isoCapscore;

    @FindBy(id = "ProtectionClass")
    public static WebElement protectionClassDropdown;

    @FindBy(xpath = "//li[@data-value = '2']")
    public static WebElement protectionClassSelect;

    @FindBy(id = "LocationOperations")
    public static WebElement locationOperationsDropdown;

    @FindBy(xpath = "//li[text() = 'Manufacturing']")
    public static WebElement locationOperationsSelect;

    @FindBy(id = "PremisesOperationsTerr")
    public static WebElement premisesOperationsterr;

    @FindBy(xpath = "//li[@data-value = 'Marin County']")
    public static WebElement premisesOpTerrSelect;

    @FindBy(xpath = "//span[text() = 'Save']")
    public static WebElement saveLocation;

    @FindBy(xpath = "//td[@class='MuiTableCell-root MuiTableCell-body']/child::button")
    public static WebElement locationExpAfterSav;

    @FindBy(xpath = "//span[text() = 'Classification']/preceding-sibling::span")
    public static WebElement classificationExp;

    @FindBy(xpath = "//h6[text() = 'Classification']/child::button")
    public static WebElement classificationAddIcon;

    @FindBy(name = "ClassificationNumber")
    public static WebElement classificationNumber;

    @FindBy(id = "ClassCode")
    public static WebElement classCodeDropdown;

    @FindBy(xpath = "//li[@data-value = '10010']")
    public static WebElement classCodeSelect;

    @FindBy(name = "PremOpsExposure")
    public static WebElement premOpsExposure;

    @FindBy(name = "ProdsCompldOpsExposure")
    public static WebElement prodCopsExposure;

    @FindBy(xpath = "(//span[text() = 'Save'])[2]")
    public static WebElement classificationSaveButton;

    @FindBy(xpath = "//span[text() = 'Next']")
    public static WebElement nextButtonStatesAndLocations;




}
