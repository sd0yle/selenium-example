package com.sample.frontdesk.general;

import com.sample.frontdesk.util.PropertyLoad;
import org.apache.log4j.Logger;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Front Desk Test Base.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 * Purpose: Common methods for front desk tests.
 */
public class FrontDeskBase {

    protected WebDriver webDriver;
    protected String    websiteUrl;

    private static final String BROWSER_CHROME  = "chrome";
    private static final String BROWSER_FIREFOX = "firefox";

    private static final Logger logger = Logger.getLogger(FrontDeskBase.class);

    @BeforeClass
    public void init() throws MalformedURLException {
        String    browserName;
        websiteUrl = PropertyLoad.loadProperty("site.url");
        browserName = PropertyLoad.loadProperty("browser.name");

        DesiredCapabilities desiredCapabilities;
        switch (browserName) {
            case BROWSER_CHROME:
                desiredCapabilities = DesiredCapabilities.chrome();
                desiredCapabilities.setJavascriptEnabled(true);
                desiredCapabilities.setCapability("takeScreenshot", true);
                desiredCapabilities.setBrowserName(browserName);
                webDriver = new RemoteWebDriver(new URL(websiteUrl), desiredCapabilities);
                break;
            case BROWSER_FIREFOX:
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\steph\\SeleniumFiles\\geckodriver.exe");
                FirefoxOptions firefoxOptions = new FirefoxOptions()
                        .addPreference("browser.startup.page", 1)
                        .addPreference("browser.startup.homepage", websiteUrl);
                webDriver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                throw new IllegalArgumentException("Could not find supported browser: " + browserName);
        }

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        if (webDriver != null) {
            try {
                webDriver.quit();
            } catch (SessionNotCreatedException e) {
                if (logger.isDebugEnabled()) {
                    logger.debug("Debug: " + e);
                }
                if (logger.isInfoEnabled()) {
                    logger.info("Info: " + e);
                }

                logger.warn("Warning: " + e);
            }
        }
    }

}
