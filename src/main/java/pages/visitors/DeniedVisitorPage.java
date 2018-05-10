package com.sample.frontdesk.pages.visitors;

import com.sample.frontdesk.pages.FrontDeskPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Visitors > Denied.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 */
public class DeniedVisitorPage extends FrontDeskPage {

    /**
     * Constructor.
     *
     * @param webDriver driver
     */
    public DeniedVisitorPage(WebDriver webDriver) {
        super(webDriver);
    }

    //************************
    // Page Elements
    //************************

    /**
     * Page module for denied visitors.
     *
     * @return Web Element
     */
    private WebElement deniedVisitorModule() {
        return webDriver.findElement(By.id("pageFailedBackground"));
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
        return deniedVisitorModule().isDisplayed();
    }

}
