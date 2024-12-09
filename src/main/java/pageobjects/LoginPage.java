package pageobjects;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    By LOGINNAME = By.xpath("//input[@id='loginFrm_loginname']");
    By PASSWORD = By.xpath("//input[@id='loginFrm_password']");
    By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");

    public LoginPage(WebDriver rdriver) {
        driver = rdriver;
    }
    public void enterLoginName(String Loginname) {
        WebElement inputLoginname = driver.findElement(LOGINNAME);
        inputLoginname.click();
        inputLoginname.sendKeys(Loginname);
    }
    public  void enterPassword(String Password)
    {
        WebElement inputPassword =  driver.findElement(PASSWORD);
        inputPassword.click();
        inputPassword.sendKeys(Password);
    }
    public void clickLogin() {
        WebElement loginButton = driver.findElement(LOGIN_BUTTON);
        loginButton.click();
    }
}
