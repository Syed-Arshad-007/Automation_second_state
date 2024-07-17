package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IssuePolicyPageObjects {

    @FindBy(xpath = "//h6[contains(text(),'(Issued)')]")
    public static WebElement policyNumberAfterIssuePolicy;

    @FindBy(xpath = "//button[text() = 'PolicyIssuance']")
    public static WebElement policyIssuanceButton;

    @FindBy(xpath = "//span[text() = 'Actions']")
    public static WebElement actionsButton;

    @FindBy(xpath = "//li[text() = 'ENDORSE POLICY']")
    public static WebElement endorsePolicy;

    @FindBy(id = "EndorsementEffectiveDate")
    public static WebElement endorsementEffectiveDate;

    @FindBy(xpath = "//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendarHeader-transitionContainer']/following-sibling::button")
    public static WebElement endorsementEffectiveDateNextButton1;

    @FindBy(xpath = "//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendarHeader-transitionContainer']/following-sibling::button")
    public static WebElement endorsementEffectiveDateNextButton2;

    @FindBy(xpath = "//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendarHeader-transitionContainer']/following-sibling::button")
    public static WebElement endorsementEffectiveDateNextButton3;

    @FindBy(xpath = "//p[text() = '1']")
    public static WebElement endorsementEffectiveDateToBeGiven;

    @FindBy(xpath = "//span[text() = 'OK']")
    public static WebElement endorsementEffectiveOkButton;

    @FindBy(xpath = "//div[@id = 'EndorsementType']")
    public static WebElement endorsementType;

    @FindBy(xpath = "//li[text() = 'Policy Changes']")
    public static WebElement endorsementTypeSelect;

    @FindBy(xpath = "//span[text() = 'Endorse']")
    public static WebElement endorseButton;

}
