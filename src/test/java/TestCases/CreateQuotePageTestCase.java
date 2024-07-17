package TestCases;

import CommonFunctions.CommonFunctions;
import PageObjects.CreateQuotePageObjects;
import PageObjects.FindQuotePageObjects;
import PageObjects.FindSubmissionPageObjects;
import PageObjects.RiskCoverageStatesLocationsPageObjects;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static TestCases.AccountPageTestcase.login;

public class CreateQuotePageTestCase extends CommonFunctions {


    @Test
    public static void createQuotePage() {

        //Create Quote page
        PageFactory.initElements(driver, CreateQuotePageObjects.class);

        //Quote Number
        loaderValidation();
        actions.pause(Duration.ofSeconds(1));
        String quoteNumber = CreateQuotePageObjects.quoteNumber.getText();
        System.out.println("Quote Number NB = " + quoteNumber);

        //Quote Proposal Button
        //CreateQuotePageObjects.quoteProposalButton.click();

        //Actions Button and Bind Quote
        loaderValidation();
        visiblityOfElement(CreateQuotePageObjects.actionsButton);
        CreateQuotePageObjects.actionsButton.click();

        //Bind Quote
        visiblityOfElement(CreateQuotePageObjects.bindQuote);
        CreateQuotePageObjects.bindQuote.click();

        //Bind Button
        visiblityOfElement(CreateQuotePageObjects.bindButton);
        CreateQuotePageObjects.bindButton.click();


    }
}
