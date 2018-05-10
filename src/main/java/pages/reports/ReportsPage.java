package com.sample.frontdesk.pages.reports;

import com.sample.frontdesk.pages.FrontDeskPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Reports.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 */
public class ReportsPage extends FrontDeskPage {

    /**
     * Constructor.
     *
     * @param webDriver driver
     */
    public ReportsPage(WebDriver webDriver) {
        super(webDriver);
    }

    //************************
    // Page Elements
    //************************

    /**
     * Visitor Log run report button.
     *
     * @return Web Element
     */
    private WebElement visitorLogReportButton() {
        return webDriver.findElement(By.cssSelector("a[href='/Reports/Home/VisitorLogReport']"));
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
        return visitorLogReportButton().isDisplayed();
    }

}