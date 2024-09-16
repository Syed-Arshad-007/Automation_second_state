package CommonFunctions;

import PageObjects.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.reporters.TestHTMLReporter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {

    @DataProvider(name = "AccountPageData")
    public Object [][] getData() throws IOException {

        String path = "D:\\dataFromExcelfile.xlsx";
        XLUtility xlutil = new XLUtility(path);
        int totalrows = xlutil.getRowCount("AccountPage");
        int totalcols = xlutil.getCellCount("AccountPage",1);
        Object[][] accountPageData = new Object[totalrows][1];
        System.out.println(totalrows);
        System.out.println(totalcols);
        Map<String,String> map;
        for (int i=1;i<=totalrows;i++){
            map = new HashMap<>();
            for (int j=0;j<totalcols;j++){
             //   accountPageData[i-1][j] = xlutil.getCellData("AccountPage",i,j);
                String key = xlutil.getCellData("AccountPage",0,j);
                String value = xlutil.getCellData("AccountPage",i,j);
                map.put(key,value);
            }
            accountPageData[i-1][0] = map;
        }

        return accountPageData;
    }

    public static void writeTestResultsinExcel() throws IOException {
        String path = "D:\\testResultsFile1.xlsx";
        XLUtility xlutil = new XLUtility(path);

        //write headers into the Excel sheet
        xlutil.setCellData("Sheet1",0,0,"NewBusinessSubNumber");

        waitToBeClickable(AccountPageObjects.subNumber);
        String submissionNumber = AccountPageObjects.subNumber.getText();

        //Write data into excel
        xlutil.setCellData("Sheet1",1,0,submissionNumber);

    }
    public static void writeTestResultsinExcelQuote() throws IOException {
        String path = "D:\\testResultsFile1.xlsx";
        XLUtility xlutil = new XLUtility(path);

        //write headers into the Excel sheet
        xlutil.setCellData("Sheet1",0,1,"QuoteNumber");

        loaderValidation();
        actions.pause(Duration.ofSeconds(1));
        String quoteNumber = CreateQuotePageObjects.quoteNumber.getText();

        //Write data into excel
        xlutil.setCellData("Sheet1",1,1,quoteNumber);
    }

    public static void writeTestResultsinExcelPolicy() throws IOException {
        String path = "D:\\testResultsFile1.xlsx";
        XLUtility xlutil = new XLUtility(path);

        //write headers into the Excel sheet
        xlutil.setCellData("Sheet1",0,2,"PolicyNumber");

        loaderValidation();
        visiblityOfElement(IssuePolicyPageObjects.policyNumberAfterIssuePolicy);
        String policyNumber = IssuePolicyPageObjects.policyNumberAfterIssuePolicy.getText();

        //Write data into excel
        xlutil.setCellData("Sheet1",1,2,policyNumber);
    }

    public static void writeTestResultsinExcelEndosub() throws IOException {
        String path = "D:\\testResultsFile1.xlsx";
        XLUtility xlutil = new XLUtility(path);

        //write headers into the Excel sheet
        xlutil.setCellData("Sheet1",0,3,"EndorsementSubNumber");

        loaderValidation();
        waitToBeClickable(EndorsementPageObjects.subNumberEndorsement);
        String submissionNumberEndorsement = EndorsementPageObjects.subNumberEndorsement.getText();

        //Write data into excel
        xlutil.setCellData("Sheet1",1,3,submissionNumberEndorsement);
    }

    public static void writeTestResultsinExcelEndoquote() throws IOException {
        String path = "D:\\testResultsFile1.xlsx";
        XLUtility xlutil = new XLUtility(path);

        //write headers into the Excel sheet
        xlutil.setCellData("Sheet1",0,4,"EndorsementQuoteNumber");

        loaderValidation();
        actions.pause(Duration.ofSeconds(2));
        waitToBeClickable(EndorsementPageObjects.quoteNumberEndo);
        String quoteNumberEndo = EndorsementPageObjects.quoteNumberEndo.getText();

        //Write data into excel
        xlutil.setCellData("Sheet1",1,4,quoteNumberEndo);
    }

    public static void writeTestResultsinExcelEndopolicy() throws IOException {
        String path = "D:\\testResultsFile1.xlsx";
        XLUtility xlutil = new XLUtility(path);

        //write headers into the Excel sheet
        xlutil.setCellData("Sheet1",0,5,"EndorsementPolicyNumber");

        loaderValidation();
        visiblityOfElement(EndorsementPageObjects.policyNumberAfterIssuePolicy);
        String policynumberEndo = EndorsementPageObjects.policyNumberAfterIssuePolicy.getText();

        //Write data into excel
        xlutil.setCellData("Sheet1",1,5,policynumberEndo);
    }

    public static void writeTestResultsinExcelRensub() throws IOException {
        String path = "D:\\testResultsFile1.xlsx";
        XLUtility xlutil = new XLUtility(path);

        //write headers into the Excel sheet
        xlutil.setCellData("Sheet1",0,6,"RenewalSubNumber");

        loaderValidation();
        waitToBeClickable(RenewalPageObjects.subNumberRenewal);
        String submissionNumberRenewal = RenewalPageObjects.subNumberRenewal.getText();

        //Write data into excel
        xlutil.setCellData("Sheet1",1,6,submissionNumberRenewal);
    }

    public static void writeTestResultsinExcelRenquote() throws IOException {
        String path = "D:\\testResultsFile1.xlsx";
        XLUtility xlutil = new XLUtility(path);

        //write headers into the Excel sheet
        xlutil.setCellData("Sheet1",0,7,"RenewalQuoteNumber");

        loaderValidation();
        String quoteNumberRenewal = RenewalPageObjects.quoteNumberRenewal.getText();

        //Write data into excel
        xlutil.setCellData("Sheet1",1,7,quoteNumberRenewal);
    }

    public static void writeTestResultsinExcelRenpolicy() throws IOException {
        String path = "D:\\testResultsFile1.xlsx";
        XLUtility xlutil = new XLUtility(path);

        //write headers into the Excel sheet
        xlutil.setCellData("Sheet1",0,8,"RenewalPolicyNumber");
        loaderValidation();
        visiblityOfElement(RenewalPageObjects.policyNumberAfterIssuePolicy);
        String policynumberRenewal = RenewalPageObjects.policyNumberAfterIssuePolicy.getText();

        //Write data into excel
        xlutil.setCellData("Sheet1",1,8,policynumberRenewal);
    }


    public  static void  loaderValidation( ){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='custom-loader-container']")));
    }

    public  static void  loaderValidationLocationExpandAfterSave( ){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class = 'app-header navbar']")));
    }



    public  static void  waitToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public  static void  visiblityOfElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static  Properties properties = null;
    public static WebDriver driver = null;
    Logger logger = Logger.getLogger("CommonFunctions.class");
    public static Actions actions;
    public static ExtentReports extentReport;
    public static ExtentSparkReporter sparkReporter;
    public static ExtentTest testCase;
    public Properties  loadPropertyFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("config.properties");
        properties = new Properties();
        properties.load(fileInputStream);
        return properties;
    }


    @BeforeSuite
    public void launchBrowser() throws IOException {
        PropertyConfigurator.configure("target/log4j.properties");
        logger.info("GL Automation Endorsement and Renewal scenario started");
        logger.info("Loading the property file");
        loadPropertyFile();
        String browser = properties.getProperty("browser");
        String url = properties.getProperty("urlUat");

        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.navigate().to(url);
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/extentSparkReport.html");
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Extent Report GL");
        sparkReporter.config().setTimeStampFormat("dd.MM.yyyy, HH:mm:ss");
        extentReport = new ExtentReports();
        extentReport.attachReporter(sparkReporter);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

    }


    @AfterSuite
    public void tearDown() {
        if (extentReport != null) {
            extentReport.flush();
        }
        if (driver != null) {
            driver.quit();
        }
    }
}
