package com.sample.frontdesk.pages.visitors;

import com.sample.frontdesk.pages.FrontDeskPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Visitors > Signed In.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 */
public class SignedInVisitorsPage extends FrontDeskPage {

    /**
     * Constructor.
     *
     * @param webDriver driver
     */
    public SignedInVisitorsPage(WebDriver webDriver) {
        super(webDriver);
    }

    //************************
    // Page Elements
    //************************

    /**
     * Sign Out All Visitors button.
     *
     * @return Web Element
     */
    private WebElement signOutButton() {
        return webDriver.findElement(By.cssSelector("button.btnSignOut"));
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
        return signOutButton().isDisplayed();
    }

}
