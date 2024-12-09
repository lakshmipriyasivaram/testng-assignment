package smoke;

import org.testng.Assert;
import org.testng.annotations.Test;
import basepage.BasePage;
import org.testng.annotations.Test;

    public class LoginTest extends BasePage{
        @Test
        public void validLoginTest() {
            String loginname = "Lakshmi";
            String password = "RLakshmiP123";
            loginPage.enterLoginName(loginname);
            loginPage.enterPassword(password);
            loginPage.clickLogin();
            System.out.println(driver.getCurrentUrl());
            Assert.assertEquals(driver.getCurrentUrl(),"https://automationteststore.com/index.php?rt=account/account");
           }

    }

