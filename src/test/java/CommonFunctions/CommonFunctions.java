package CommonFunctions;

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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {

    @DataProvider(name = "AccountPageData")
    public String [][] getData() throws IOException {

        String path = "D:\\dataFromExcelfile.xlsx";
        XLUtility xlutil = new XLUtility(path);
        int totalrows = xlutil.getRowCount("AccountPage");
        int totalcols = xlutil.getCellCount("AccountPage",1);
        String[][] accountPageData = new String[totalrows][totalcols];
        System.out.println(totalrows);
        System.out.println(totalcols);

        for (int i=0;i<totalrows;i++){
            for (int j=0;j<totalcols;j++){
                accountPageData[i][j] = xlutil.getCellData("AccountPage",i,j);
            }
        }

        return accountPageData;
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
    public static Actions actions;
    public Properties  loadPropertyFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("config.properties");
        properties = new Properties();
        properties.load(fileInputStream);
        return properties;
    }


    @BeforeSuite
    public void launchBrowser() throws IOException {
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
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

    }



    @AfterSuite
    public void tearDown(){

    }
}
