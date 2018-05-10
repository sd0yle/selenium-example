package com.sample.frontdesk.pages.visitors;

import com.sample.frontdesk.pages.FrontDeskPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Visitors > Signed Out.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 */
public class SignedOutVisitorsPage extends FrontDeskPage {

    /**
     * Constructor.
     *
     * @param webDriver driver
     */
    public SignedOutVisitorsPage(WebDriver webDriver) {
        super(webDriver);
    }

    //************************
    // Page Elements
    //************************

    /**
     * Page module for signed out visitors.
     *
     * @return Web Element
     */
    private WebElement signedOutVisitorModule() {
        return webDriver.findElement(By.id("pageSignedOut"));
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
        return signedOutVisitorModule().isDisplayed();
    }

}
