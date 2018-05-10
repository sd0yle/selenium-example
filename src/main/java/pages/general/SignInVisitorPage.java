package com.sample.frontdesk.pages.general;

import com.sample.frontdesk.pages.FrontDeskPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Sign In Visitor Page.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 */
public class SignInVisitorPage extends FrontDeskPage {

    /**
     * Constructor.
     *
     * @param webDriver driver
     */
    public SignInVisitorPage(WebDriver webDriver) {
        super(webDriver);
    }

    //************************
    // Page Elements
    //************************

    /**
     * Sign in a Visitor header.
     *
     * @return Web Element
     */
    private WebElement header() {
        return webDriver.findElement(By.cssSelector(".panel-heading > h2"));
    }

    //************************
    // Page Methods
    //************************

    /**
     * Confirms the page has loaded.
     *
     * @return Boolean
     */
    public Boolean atPage() {
        return header().isDisplayed();
    }
}
