package com.sample.frontdesk.general;

import com.sample.frontdesk.pages.general.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Login Page Test.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 * Purpose: Confirms elements on Login Page are displayed.
 */
public class TestLoginPage extends FrontDeskBase {

    private LoginPage loginPage;

    @BeforeClass
    public void testInit() {
        webDriver.get(websiteUrl);
        loginPage = new LoginPage(webDriver);
    }

    /**
     * Calls Login Page's atPage to confirm the logo is displayed.
     */
    @Test
    public void testLogo() {
        Assert.assertTrue(loginPage.atPage(), "Logo is not displayed.");
    }

    /**
     * Confirms username input field is displayed.
     */
    @Test
    public void testUsername() {
        Assert.assertTrue(loginPage.isUsernameInputDisplayed(), "Username input is not displayed.");
    }

    /**
     * Confirms password input field is displayed.
     */
    @Test
    public void testPassword() {
        Assert.assertTrue(loginPage.isPasswordInputDisplayed(), "Password input is not displayed.");
    }

    /**
     * Confirms the sign in button is displayed.
     */
    @Test
    public void testSignInButton() {
        Assert.assertTrue(loginPage.isSignInButtonDisplayed(), "Sign In button not displayed.");
    }

    /**
     * Confirms Sign Up button is displayed.
     */
    @Test
    public void testSignUpButton() {
        Assert.assertTrue(loginPage.isSignUpButtonDisplayed(), "Sign Up button not displayed.");
    }

    /**
     * Confirms About link is displayed.
     */
    @Test
    public void testAboutLink() {
        Assert.assertTrue(loginPage.isAboutLinkDisplayed(), "About link not displayed.");
    }

    /**
     * Confirms Support link is displayed.
     */
    @Test
    public void testSupportLink() {
        Assert.assertTrue(loginPage.isSupportLinkDisplayed(), "Support link not displayed.");
    }

    /**
     * Confirms Training link is displayed.
     */
    @Test
    public void testTrainingLink() {
        Assert.assertTrue(loginPage.isTrainingLinkDisplayed(), "Training link not displayed.");
    }

}
