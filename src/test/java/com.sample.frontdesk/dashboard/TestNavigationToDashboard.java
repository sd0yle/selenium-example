package com.sample.frontdesk.dashboard;

import com.sample.frontdesk.general.FrontDeskBase;
import com.sample.frontdesk.pages.general.DashboardPage;
import com.sample.frontdesk.pages.general.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Test Navigation to Dashboard.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 * Purpose: Tests navigation to the Dashboard page.
 */
public class TestNavigationToDashboard extends FrontDeskBase {

    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @BeforeClass
    public void testInit() {
        webDriver.get(websiteUrl);
        loginPage     = new LoginPage(webDriver);
        dashboardPage = new DashboardPage(webDriver);
    }

    @Test
    public void testPageElements() {
        loginPage.login();
        Assert.assertTrue(dashboardPage.atPage(), "Expected to be on the Dashboard.");

        dashboardPage.logOut();
    }

}
