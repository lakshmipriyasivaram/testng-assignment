package pageobjects;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPage  {

        WebDriver ldriver;
        public DashboardPage(WebDriver rdriver) {
            ldriver = rdriver;
        }

        public void validateDashboard() {

            String login_url = "https://automationteststore.com/index.php?rt=account/login";
            String expected_url = "https://automationteststore.com/index.php?rt=account/account";
            String actual_url = ldriver.getCurrentUrl();
            Assert.assertEquals(actual_url, expected_url);
            Assert.assertNotEquals(actual_url, login_url);

        }

    }



