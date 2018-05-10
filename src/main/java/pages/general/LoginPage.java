package com.sample.frontdesk.pages.general;

import com.sample.frontdesk.pages.FrontDeskPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Login Page.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 * Purpose: Houses elements and methods for the Login Page.
 */
public class LoginPage extends FrontDeskPage {

    /**
     * Constructor.
     *
     * @param webDriver driver
     */
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    //************************
    // Page Elements
    //************************

    /**
     * The About link.
     *
     * @return WebElement
     */
    private WebElement aboutLink() {
        return webDriver.findElement(By.id("about"));
    }

    /**
     * The Logo in the top left corner.
     *
     * @return WebElement
     */
    private WebElement logo() {
        return webDriver.findElement(By.id("logo"));
    }

    /**
     * Password input.
     *
     * @return WebElement
     */
    private WebElement passwordInput() {
        return webDriver.findElement(By.id("Password"));
    }

    /**
     * The Sign In button.
     *
     * @return WebElement
     */
    private WebElement signInButton() {
        return webDriver.findElement(By.id("signInButton"));
    }

    /**
     * The Sign Up button.
     *
     * @return WebElement
     */
    private WebElement signUpButton() {
        return webDriver.findElement(By.id("signUpButton"));
    }

    /**
     * The Support link.
     *
     * @return WebElement
     */
    private WebElement supportLink() {
        return webDriver.findElement(By.xpath("//a[text()='Support']"));
    }

    /**
     * The Training link.
     *
     * @return WebElement
     */
    private WebElement trainingLink() {
        return webDriver.findElement(By.xpath("//a[text()='Training']"));
    }

    /**
     * Username input.
     *
     * @return WebElement
     */
    private WebElement usernameInput() {
        return webDriver.findElement(By.id("UserIdentifier"));
    }

    //************************
    // Page Methods
    //************************

    /**
     * Confirms the Login Page has loaded.
     *
     * @return Boolean
     */
    public Boolean atPage() {
        return logo().isDisplayed();
    }

    /**
     * Clicks the Sign In button.
     */
    public void clickSignIn() {
        signInButton().click();
    }

    /**
     * Enters provided text into the password field.
     *
     * @param text String - username
     * @return Boolean
     */
    public Boolean enterPassword(String text) {
        passwordInput().sendKeys(text);
        return text.equalsIgnoreCase(passwordInput().getText());
    }

    /**
     * Enters provided text into the username field.
     *
     * @param text String - username
     * @return Boolean
     */
    public Boolean enterUsername(String text) {
        usernameInput().sendKeys(text);
        return usernameInput().getText().equalsIgnoreCase(text);
    }

    /**
     * Confirms the About link is displayed.
     *
     * @return Boolean
     */
    public Boolean isAboutLinkDisplayed() {
        return aboutLink().isDisplayed();
    }

    /**
     * Confirms the password input is displayed.
     *
     * @return Boolean
     */
    public Boolean isPasswordInputDisplayed() {
        return passwordInput().isDisplayed();
    }

    /**
     * Confirms the sign in button is displayed.
     *
     * @return Boolean
     */
    public Boolean isSignInButtonDisplayed() {
        return signInButton().isDisplayed();
    }

    /**
     * Confirms the sign up button is displayed.
     *
     * @return Boolean
     */
    public Boolean isSignUpButtonDisplayed() {
        return signUpButton().isDisplayed();
    }

    /**
     * Confirms the Support link is displayed.
     *
     * @return Boolean
     */
    public Boolean isSupportLinkDisplayed() {
        return supportLink().isDisplayed();
    }

    /**
     * Confirms the Training link is displayed.
     *
     * @return Boolean
     */
    public Boolean isTrainingLinkDisplayed() {
        return trainingLink().isDisplayed();
    }

    /**
     * Confirms the username input is displayed.
     *
     * @return Boolean
     */
    public Boolean isUsernameInputDisplayed() {
        return usernameInput().isDisplayed();
    }

    /**
     * Standard login method.
     */
    public void login() {
        usernameInput().clear();
        passwordInput().clear();
        usernameInput().sendKeys("automation@sample.com");
        passwordInput().sendKeys("autoTest#2018");
        clickSignIn();
    }

    /**
     * Overridden login method.
     *
     * @param userName - String
     * @param password - String
     */
    public void login(String userName, String password) {
        usernameInput().clear();
        passwordInput().clear();
        usernameInput().sendKeys(userName);
        passwordInput().sendKeys(password);
        clickSignIn();
    }

}
