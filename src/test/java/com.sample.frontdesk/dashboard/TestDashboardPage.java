package com.sample.frontdesk.dashboard;

import com.sample.frontdesk.general.FrontDeskBase;
import com.sample.frontdesk.pages.general.DashboardPage;
import com.sample.frontdesk.pages.general.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Dashboard Tests.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 * Purpose: Tests elements on the Dashboard Page.
 */
public class TestDashboardPage extends FrontDeskBase {

    private LoginPage     loginPage;
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

        // Check widgets.
        Assert.assertTrue(dashboardPage.isVisitorWidgetDisplayed(),
                "Expected Visitor widget to be displayed.");
        Assert.assertTrue(dashboardPage.isSignedInWidgetDisplayed(),
                "Expected Currently Signed In widget to be displayed.");
        Assert.assertTrue(dashboardPage.isDeniedWidgetDisplayed(),
                "Expected Visitors Denied widget to be displayed.");
        Assert.assertTrue(dashboardPage.isBreakdownWidgetDisplayed(),
                "Expected Today's Visitor Breakdown to be displayed.");
        Assert.assertTrue(dashboardPage.isTrendWidgetDisplayed(),
                "Expected Visitor Trend widget to be displayed.");
        Assert.assertTrue(dashboardPage.isTwitterWidgetDisplayed(),
                "Expected Twitter widget to be displayed.");

        // Check buttons.
        Assert.assertTrue(dashboardPage.isSignedInVisitorButtonDisplayed(),
                "Expected Sign In Visitor button to be displayed.");
        Assert.assertTrue(dashboardPage.isDeniedButtonDisplayed(),
                "Expected Denied Visitors button to be displayed.");
        Assert.assertTrue(dashboardPage.isNotificationsButtonDisplayed(),
                "Expected Notifications button to be displayed.");

        // Test Notification drop menu.
        dashboardPage.clickNotificationsButton();
        Assert.assertTrue(dashboardPage.isNotificationsDropMenuDisplayed(),
                "Expected Notifications drop menu to be displayed.");
        Assert.assertTrue(dashboardPage.isNotificationsDropMenuUsersLinkDisplayed(),
                "Expected Users link to be displayed.");
        Assert.assertTrue(dashboardPage.isNotificationsDropMenuBarCodesLinkDisplayed(),
                "Expected Bar Codes link to be displayed.");
        Assert.assertTrue(dashboardPage.isNotificationsDropMenusampleGoLinkDisplayed(),
                "Expected sample Go link to be displayed.");
        Assert.assertTrue(dashboardPage.isNotificationsDropMenuKiosksLinkDisplayed(),
                "Expected Kiosks link to be displayed.");
        dashboardPage.clickNotificationsButton();
        Assert.assertFalse(dashboardPage.isNotificationsDropMenuDisplayed(),
                "Expected Notifications drop menu to not be displayed.");

        dashboardPage.logOut();
        Assert.assertTrue(loginPage.atPage(), "Expected to be at the Login Page after logout.");
    }

}
