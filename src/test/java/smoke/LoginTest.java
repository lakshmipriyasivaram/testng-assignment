package smoke;

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
           }

        @Test
        public void invalidLoginTest ()
        {
            String loginname= "admin";
            String password = "admin@123";
            loginPage.enterLoginName(loginname);
            loginPage.enterPassword(password);
            loginPage.clickLogin();
            System.out.println(driver.getCurrentUrl());

        }
    }

