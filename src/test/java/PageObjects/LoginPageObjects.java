package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPageObjects
{
    @FindBy(id = "email")
    public static  WebElement username;

    @FindBy(id = "password")
    public static WebElement password;

    @FindBy(xpath = "//button[@type = 'submit']")
    public static WebElement submitButton;

    @FindBy(xpath = "//h3[text() = 'Welcome to Joyn Insure!']")
    public static WebElement welcomeMessage;



}

