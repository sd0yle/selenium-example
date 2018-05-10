package com.sample.frontdesk.reports;

import com.sample.frontdesk.general.FrontDeskBase;
import com.sample.frontdesk.pages.general.DashboardPage;
import com.sample.frontdesk.pages.general.LoginPage;
import com.sample.frontdesk.pages.reports.ReportsPage;
import com.sample.frontdesk.util.NavigationMenu;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Test navigation to Reports.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 */
public class TestNavigateToReports extends FrontDeskBase {

    private LoginPage loginPage;
    private DashboardPage  dashboardPage;
    private NavigationMenu navigationMenu;
    private ReportsPage    reportsPage;

    @BeforeClass
    public void testInit() {
        webDriver.get(websiteUrl);
        loginPage      = new LoginPage(webDriver);
        dashboardPage  = new DashboardPage(webDriver);
        navigationMenu = new NavigationMenu(webDriver);
        reportsPage    = new ReportsPage(webDriver);
    }

    @Test
    public void testPageElements() throws InterruptedException {
        loginPage.login();
        Assert.assertTrue(dashboardPage.atPage(), "Expected to be on the Dashboard.");
        navigationMenu.clickAdministrationLink();
        navigationMenu.navToReports();
        Assert.assertTrue(reportsPage.atPage(), "Expected to be on the Reports page.");

        reportsPage.logOut();
    }

}
