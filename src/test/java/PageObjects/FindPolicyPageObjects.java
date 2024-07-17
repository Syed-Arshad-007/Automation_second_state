package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindPolicyPageObjects {

    @FindBy(xpath = "//a[text() = 'Policy']")
    public static WebElement findPolicyLink;

    @FindBy(name = "PolicyNumber")
    public static WebElement policyNumber;

    @FindBy(name = "PolicyNumber")
    public static WebElement policyNumberEndo;

    @FindBy(id = "Find")
    public static WebElement findPolicyButton;

    @FindBy(xpath = "//a[text() = 'SSIC-GLN02-0011430-24']")
    public static WebElement clickingPolicyNumberAfterFind;

    @FindBy(xpath = "(//a[text() = 'SSIC-GLN02-0011430-24'])[2]")
    public static WebElement clickingPolicyNumberAfterFindEndo;


}
