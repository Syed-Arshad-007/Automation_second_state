package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindQuotePageObjects {

    @FindBy(xpath = "//a[text() = 'Quote']")
    public static WebElement findQuoteLink;

    @FindBy(name = "QuoteNumber")
    public static WebElement quoteNumber;

    @FindBy(id = "Find")
    public static WebElement findQuoteButton;

    @FindBy(xpath = "//a[text() = 'Q01-0010800-00']")
    public static WebElement clickingQuoteNumberAfterFind;

    @FindBy(xpath = "//a[text() = 'Q01-0010826-00']")
    public static WebElement clickingQuoteNumberAfterFindEndo;
}
