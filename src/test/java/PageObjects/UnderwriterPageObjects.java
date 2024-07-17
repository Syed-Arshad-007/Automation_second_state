package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnderwriterPageObjects {

    @FindBy(id = "ApplyAdditionalPolicyFee")
    public static WebElement applyAdditionalPolicyFeeButton;

    @FindBy(xpath = "//li[@data-value = 'Yes']")
    public static WebElement applyAdditionalPolicyFeeSelect;

    @FindBy(name = "GLClaimsOver1k")
    public static WebElement claimsOver1K;

    @FindBy(name = "NoOfEmployees")
    public static WebElement noOfEmployees;

    @FindBy(name = "questioninstallationservicerepair")
    public static WebElement serviceRepair;

    @FindBy(xpath = "//span[text() = 'Next']")
    public static WebElement nextButton;
}
