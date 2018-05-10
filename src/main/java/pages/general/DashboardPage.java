package com.sample.frontdesk.pages.general;

import com.sample.frontdesk.pages.FrontDeskPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Dashboard Page.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 * Purpose: Houses elements and methods for the Dashboard.
 */
public class DashboardPage extends FrontDeskPage {

    /**
     * Constructor.
     *
     * @param webDriver driver
     */
    public DashboardPage(WebDriver webDriver) {
        super(webDriver);
    }

    //************************
    // Page Elements
    //************************

    /**
     * The Today's Visitor Breakdown widget.
     *
     * @return WebElement
     */
    private WebElement breakdownWidget() {
        return webDriver.findElement(By.cssSelector("div.piePanel"));
    }

    /**
     * The Denied Visitors widget.
     *
     * @return WebElement
     */
    private WebElement deniedWidget() {
        return webDriver.findElement(By.cssSelector("div.failed"));
    }

    /**
     * The Denied Visitors button.
     *
     * @return WebElement
     */
    private WebElement deniedVisitorButton() {
        return webDriver.findElement(By.cssSelector("li.iconDenied i"));
    }

    /**
     * The dashboard modal.
     *
     * @return WebElement
     */
    private WebElement homepageModal() {
        return webDriver.findElement(By.id("homePage"));
    }

    /**
     * The Notifications button.
     *
     * @return WebElement
     */
    private WebElement notificationsButton() {
        return webDriver.findElement(By.cssSelector("li.iconNotifications span"));
    }

    /**
     * The Notifications drop menu.
     *
     * @return WebElement
     */
    private WebElement notificationsDropMenu() {
        return webDriver.findElement(By.cssSelector("li.dropdown li.dropdown-menu-header"));
    }

    /**
     * The Bar Codes Link in the drop menu for Notifications.
     *
     * @return Web Element
     */
    private WebElement notificationsDropMenuBarCodesLink() {
        return webDriver.findElement(
                By.xpath("//li[contains(@class, 'iconNotifications')]//a[contains(@href, 'Visitor/Registered')]"));
    }

    /**
     * The Kiosks Link in the drop menu for Notifications.
     *
     * @return Web Element
     */
    private WebElement notificationsDropMenuKiosksLink() {
        return webDriver.findElement(
                By.xpath("//li[contains(@class, 'iconNotifications')]//a[contains(@href, 'AccountAdmin/Home')]"));
    }

    /**
     * The Users Link in the drop menu for Notifications.
     *
     * @return Web Element
     */
    private WebElement notificationsDropMenuUsersLink() {
        return webDriver.findElement(
                By.xpath("//li[contains(@class, 'iconNotifications')]//a[contains(@href, 'StationAdmin/Kiosk')]"));
    }

    /**
     * The sample Go! Link in the drop menu for Notifications.
     *
     * @return Web Element
     */
    private WebElement notificationsDropMenusampleGoLink() {
        return webDriver.findElement(
                By.xpath("//li[contains(@class, 'iconNotifications')]//a[contains(@href, 'MobileDevice/Home')]"));
    }

    /**
     * The Signed In widget.
     *
     * @return WebElement
     */
    private WebElement signedInWidget() {
        return webDriver.findElement(By.cssSelector("div.signedIn"));
    }

    /**
     * The Sign In Visitor button.
     *
     * @return WebElement
     */
    private WebElement signInVisitorButton(){
        return webDriver.findElement(By.cssSelector("li.iconSignIn > a"));
    }

    /**
     * The Visitor Trend widget.
     *
     * @return WebElement
     */
    private WebElement trendWidget() {
        return webDriver.findElement(By.cssSelector("div.graphPanel"));
    }

    /**
     * The Twitter widget.
     *
     * @return WebElement
     */
    private WebElement twitterWidget() {
        return webDriver.findElement(By.id("twitter"));
    }

    /**
     * The Visitor widget.
     *
     * @return WebElement
     */
    private WebElement visitorWidget() {
        return webDriver.findElement(By.cssSelector("div.visitors"));
    }

    //************************
    // Page Methods
    //************************

    /**
     * Confirms that the Dashboard Page has loaded.
     *
     * @return Boolean
     */
    public Boolean atPage() {
        return homepageModal().isDisplayed();
    }

    /**
     * Clicks the Denied Visitors button.
     */
    public void clickDeniedVisitorButton() {
        deniedVisitorButton().click();
    }

    /**
     * Clicks the Notifications button.
     */
    public void clickNotificationsButton() {
        notificationsButton().click();
    }

    /**
     * Clicks on the provided link for the notifications drop menu.
     *
     * @param linkText String
     */
    public void clickNotificationDropMenuLink(String linkText) {
        switch (linkText) {
            case "Users":
                notificationsDropMenuUsersLink().click();
                break;
            case "Bar Codes":
                notificationsDropMenuBarCodesLink().click();
                break;
            case "sample Go":
                notificationsDropMenusampleGoLink().click();
                break;
            case "Kiosks":
                notificationsDropMenuKiosksLink().click();
                break;
            default:
                notificationsDropMenuUsersLink().click();
                break;
        }
    }

    /**
     * Clicks the Sign In Visitor button.
     */
    public void clickSignInVisitorButton() {
        signInVisitorButton().click();
    }

    /**
     * Confirms that the Visitor Breakdown widget has loaded.
     *
     * @return Boolean
     */
    public Boolean isBreakdownWidgetDisplayed() {
        return breakdownWidget().isDisplayed();
    }

    /**
     * Confirms the Denied Visitors button is displayed.
     *
     * @return Boolean
     */
    public Boolean isDeniedButtonDisplayed() {
        return deniedVisitorButton().isDisplayed();
    }

    /**
     * Confirms that the Denied Visitor widget has loaded.
     *
     * @return Boolean
     */
    public Boolean isDeniedWidgetDisplayed() {
        return deniedWidget().isDisplayed();
    }

    /**
     * Confirms the Notifications button is displayed.
     *
     * @return Boolean
     */
    public Boolean isNotificationsButtonDisplayed() {
        return notificationsButton().isDisplayed();
    }

    /**
     * Confirms that the Notifications drop menu is displayed.
     *
     * @return Boolean
     */
    public Boolean isNotificationsDropMenuDisplayed() {
        return notificationsDropMenu().isDisplayed();
    }

    /**
     * Confirms the Bar Codes link is displayed in the notifications drop menu.
     *
     * @return Boolean
     */
    public Boolean isNotificationsDropMenuBarCodesLinkDisplayed() {
        return notificationsDropMenuBarCodesLink().isDisplayed();
    }

    /**
     * Confirms the sample Go! link is displayed in the notifications drop menu.
     *
     * @return Boolean
     */
    public Boolean isNotificationsDropMenusampleGoLinkDisplayed() {
        return notificationsDropMenusampleGoLink().isDisplayed();
    }

    /**
     * Confirms the Kiosks link is displayed in the notifications drop menu.
     *
     * @return Boolean
     */
    public Boolean isNotificationsDropMenuKiosksLinkDisplayed() {
        return notificationsDropMenuKiosksLink().isDisplayed();
    }

    /**
     * Confirms the Users link is displayed in the notifications drop menu.
     *
     * @return Boolean
     */
    public Boolean isNotificationsDropMenuUsersLinkDisplayed() {
        return notificationsDropMenuUsersLink().isDisplayed();
    }

    /**
     * Confirms that the Sign in Visitor button is displayed.
     *
     * @return Boolean
     */
    public Boolean isSignedInVisitorButtonDisplayed() {
        return signInVisitorButton().isDisplayed();
    }

    /**
     * Confirms that the Denied Visitor widget has loaded.
     *
     * @return Boolean
     */
    public Boolean isSignedInWidgetDisplayed() {
        return signedInWidget().isDisplayed();
    }

    /**
     * Confirms that the Visitor Trend widget has loaded.
     *
     * @return Boolean
     */
    public Boolean isTrendWidgetDisplayed() {
        return trendWidget().isDisplayed();
    }

    /**
     * Confirms that the Twitter Widget has loaded.
     *
     * @return Boolean
     */
    public Boolean isTwitterWidgetDisplayed() {
        return twitterWidget().isDisplayed();
    }

    /**
     * Confirms that the Denied Visitor widget has loaded.
     *
     * @return Boolean
     */
    public Boolean isVisitorWidgetDisplayed() {
        return visitorWidget().isDisplayed();
    }

}