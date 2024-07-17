package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindSubmissionPageObjects {
    @FindBy(xpath = "//a[text() = 'Submission']")
    public static WebElement findSubLink;

    @FindBy(name = "SubmissionNumber")
    public static WebElement submissionNumber;

    @FindBy(id = "Find")
    public static WebElement findSubmissionButton;

    @FindBy(xpath = "//a[text() = 'SN43582']")
    public static WebElement clickingSubNumberAfterFind;

    @FindBy(xpath = "//a[text() = 'SN43290-GL-END03']")
    public static WebElement clickingSubNumberAfterFindEndorsement;
}
