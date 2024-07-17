package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateQuotePageObjects {

    @FindBy(xpath = "//h6[contains(text(),'Quote')]")
    public static WebElement quoteNumber;

    @FindBy(xpath = "//button[text() = 'QuoteProposal']")
    public static WebElement quoteProposalButton;

    @FindBy(xpath = "//span[text() = 'Actions']")
    public static WebElement actionsButton;

    @FindBy(xpath = "//li[text() ='BIND QUOTE']")
    public static WebElement bindQuote;

    @FindBy(xpath = "//span[text() = 'Bind']")
    public static WebElement bindButton;



}
