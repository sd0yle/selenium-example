package com.sample.frontdesk.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;

/**
 * Base FrontDesk Page.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 * Purpose: Houses common methods.
 */
public abstract class FrontDeskPage {

    protected WebDriver webDriver;
    private static final Logger logger = Logger.getLogger(FrontDeskPage.class);

    public FrontDeskPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //************************
    // Common Page Elements
    //************************

    private WebElement logOutButton() {
        return webDriver.findElement(By.id("logOut"));
    }

    //************************
    // Common Page Methods
    //************************

    /**
     * Log out of Front Desk.
     */
    public void logOut() {
        logOutButton().click();
    }

    /**
     * Click element with script.
     * @param element WebElement
     */
    public void clickWithScript(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor)webDriver;
        executor.executeScript("return arguments[0].click();", element);
    }

    /**
     * Click with Script with logging.
     * @param element WebElement
     * @throws Exception e
     */
    public void safeJavaScriptClick(WebElement element) throws Exception {
        try {
            if (element.isEnabled() && element.isDisplayed()) {
                if (logger.isInfoEnabled()) {
                    logger.info("Info: Clicking on element with using java script click");
                }

                ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", element);
            } else {
                if (logger.isDebugEnabled()) {
                    logger.debug("Debug: Unable to click on element");
                }
            }
        } catch (StaleElementReferenceException e) {
            if (logger.isDebugEnabled()) {
                logger.debug("Debug: Element is not attached to the page document " + e.getStackTrace());
            }
        } catch (NoSuchElementException e) {
            if (logger.isDebugEnabled()) {
                logger.debug("Debug: Element was not found in DOM " + e.getStackTrace());
            }
        } catch (Exception e) {
            if (logger.isDebugEnabled()) {
                logger.debug("Debug:Unable to click on element " + e.getStackTrace());
            }
        }
    }

}
