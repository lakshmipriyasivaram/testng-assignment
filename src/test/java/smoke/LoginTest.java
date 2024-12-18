package smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import basepage.BasePage;
import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import utils.MyUtils;

public class LoginTest extends BasePage {
    MyUtils commonaction = new MyUtils();

    @Test
    public void validLoginTest() {
        String loginname = "Lakshmi";
        String password = "RLakshmiP123";
        loginPage.enterLoginName(loginname);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        commonaction.waitFor(2);
        dashboardPage.validateDashboard();
        System.out.println(driver.getCurrentUrl());
        commonaction.waitFor(3);
    }

    @Test
    public void testProductSelection() {
        Actions actions = new Actions(driver);
        String loginname = "Lakshmi";
        String password = "RLakshmiP123";
        loginPage.enterLoginName(loginname);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        WebElement makeupMenu = driver.findElement(By.linkText("Makeup"));
        actions.moveToElement(makeupMenu).perform();
        commonaction.waitFor(2);
        WebElement cheeksLink = driver.findElement(By.xpath("//a[normalize-space()='Cheeks']"));
        cheeksLink.click();
        commonaction.waitFor(2);
        WebElement productLink = driver.findElement(By.xpath("//a[normalize-space()='BeneFit Girl Meets Pearl']"));
        productLink.click();
        commonaction.waitFor(2);

    }

}

