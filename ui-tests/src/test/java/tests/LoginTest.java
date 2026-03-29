package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
    public void validLoginTest() {

        LoginPage lp = new LoginPage(driver, wait);

        lp.login("Admin", "admin123");

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),
                "User is not navigated to dashboard");
    }

    @Test
    public void invalidLoginTest() {

        LoginPage lp = new LoginPage(driver, wait);

        lp.login("Admin", "wrong1234");

        Assert.assertEquals(lp.getErrorMessage(), "Invalid credentials",
                "Error message mismatch");
    }
}
