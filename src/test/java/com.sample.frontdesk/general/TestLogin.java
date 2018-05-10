package com.sample.frontdesk.general;

import com.sample.frontdesk.pages.general.DashboardPage;
import com.sample.frontdesk.pages.general.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Login Test.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 * Purpose: Tests a successful login.
 */
public class TestLogin extends FrontDeskBase {

    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    // Test variables.
    final String userName = "automation@sample.com";
    final String password = "autoTest#2018";

    @BeforeClass
    public void testInit() {
        webDriver.get(websiteUrl);
        loginPage     = new LoginPage(webDriver);
        dashboardPage = new DashboardPage(webDriver);
    }

    @Test
    public void testLoginSuccess() {
        Assert.assertTrue(loginPage.atPage(), "Expected to be at the Login Page.");
        Assert.assertTrue(loginPage.enterUsername(userName), "Expected username to be " + userName);
        Assert.assertTrue(loginPage.enterPassword(password), "Expected password to be " + password);

        loginPage.login(userName, password);
        Assert.assertTrue(dashboardPage.atPage(), "Expected to be at the Dashboard Page.");

        dashboardPage.logOut();
        Assert.assertTrue(loginPage.atPage(), "Expected to be at the Login Page after logout.");
    }

}
