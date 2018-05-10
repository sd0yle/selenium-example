package com.sample.frontdesk.util;

import com.sample.frontdesk.pages.FrontDeskPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Navigation Menu.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 * Purpose: Elements and methods for navigation in Front Desk.
 */
public class NavigationMenu extends FrontDeskPage {

    public NavigationMenu(WebDriver webDriver) {
        super(webDriver);
    }

    //************************
    // Elements
    //************************

    private WebElement administrationLink() {
        return webDriver.findElement(By.cssSelector(".menuAdmin>a>i"));
    }

    private WebElement administrationBackgroundChecksLink() {
        return webDriver.findElement(By.xpath("//*[@id='leftContent']//span[text()[contains(.,'Background Checks')]]"));
    }

    private WebElement administrationBackgroundChecksElectronicRecordSourcesLink() {
        return webDriver.findElement(By.cssSelector(".menuAdmin a[href='/StationAdmin/BackgroundCheckDataSource']"));
    }

    private WebElement administrationBackgroundChecksMatchAuditLink() {
        return webDriver.findElement(By.cssSelector(".menuAdmin a[href='/StationAdmin/MatchAudit']"));
    }

    private WebElement administrationBackgroundChecksVolunteerApplicantSourcesLink() {
        return webDriver.findElement(By.cssSelector(".menuAdmin a[href='/StationAdmin/VolunteerApplicantSources']"));
    }

    private WebElement administrationDirectoryLink() {
        return webDriver.findElement(By.cssSelector(".menuAdmin a[href='/StationAdmin/Directory']"));
    }

    private WebElement administrationLinkedAccountKiosksLink() {
        return webDriver.findElement(By.cssSelector(".menuAdmin a[href='/AccountAdmin/Kiosk/Kiosk']"));
    }

    private WebElement sideMenuAdministrationLinkedAccountsLink() {
        return webDriver.findElement(By.xpath("//*[@id='leftContent']//span[text()[contains(.,'Linked Accounts')]]"));
    }

    private WebElement administrationLinkedAccountBarCodesLink() {
        return webDriver.findElement(By.cssSelector(".menuAdmin a[href='/Visitor/Registered']"));
    }

    private WebElement administrationLinkedAccountsampleGoLink() {
        return webDriver.findElement(By.cssSelector(".menuAdmin a[href='/MobileDevice/Home']"));
    }

    private WebElement administrationLinkedAccountUsersLink() {
        return webDriver.findElement(By.cssSelector(".menuAdmin a[href='/AccountAdmin/Home']"));
    }

    private WebElement administrationManageCustomerAccountLink() {
        return webDriver.findElement(By.cssSelector(".menuAdmin a[href='/StationAdmin/ManageCustomerAccount']"));
    }

    private WebElement administrationRulesLink() {
        return webDriver.findElement(By.cssSelector(".menuAdmin a[href='/StationAdmin/Rules']"));
    }

    private WebElement administrationWorkflowsLink() {
        return webDriver.findElement(By.cssSelector(".menuAdmin a[href='/StationAdmin/Workflow/RFVWorkflow']"));
    }

    private WebElement dashboardLink(){
        return webDriver.findElement(By.xpath("//*[@id='leftContent']//span[text()[contains(.,'Dashboard')]]"));
    }

    private WebElement reportsLink(){
        return webDriver.findElement(By.xpath("//*[@id='leftContent']//span[text()[contains(., 'Reports')]]"));
    }

    private WebElement scheduledLink() {
        return webDriver.findElement(By.xpath("//*[@id='leftContent']//span[text()[contains(.,'Scheduled')]]"));
    }

    private WebElement scheduledEventLink() {
        return webDriver.findElement(By.cssSelector(
                ".menuScheduledVisitors a[href='/ScheduledActivities/ScheduledEvent']"));
    }

    private WebElement scheduledVisitorLink() {
        return webDriver.findElement(By.cssSelector(
                ".menuScheduledVisitors a[href='/ScheduledActivities/ScheduledVisitorParty']"));
    }

    private WebElement signInAVisitorButton() {
        return webDriver.findElement(By.cssSelector("a[href='/Visitor/Visitor/FDPlusWorkflow']"));
    }

    private WebElement visitorsLink() {
        return webDriver.findElement(By.xpath("//*[@id='leftContent']//span[text()[contains(.,'Visitors')]]"));
    }

    private WebElement visitorsDeniedLink() {
        return webDriver.findElement(By.cssSelector("div[id='leftContent'] a[href='/Visitor/FailedBackground']"));
    }

    private WebElement visitorsSignedInLink() {
        return webDriver.findElement(By.cssSelector("div[id='leftContent'] a[href='/Visitor/SignedIn']"));
    }

    private WebElement visitorsSignedOutLink() {
        return webDriver.findElement(By.cssSelector("div[id='leftContent'] a[href='/Visitor/SignedOut']"));
    }

    private WebElement volunteersLink() {
        return webDriver.findElement(By.xpath("//*[@id='leftContent']//span[text()[contains(.,'Volunteers')]]"));
    }

    private WebElement volunteersApplicantsLink() {
        return webDriver.findElement(By.cssSelector(".menuVolunteers a[href='/Volunteers/Applicants']"));
    }

    private WebElement volunteersApprovedLink() {
        return webDriver.findElement(By.cssSelector(".menuVolunteers a[href='/Volunteers/Approved']"));
    }


    //************************
    // Navigation Methods
    //************************

    public void clickAdministrationLink() throws InterruptedException {
        administrationLink().click();
        Thread.sleep(3000);
    }

    /**
     * Administration > Background Checks.
     */
    public void navToAdminBackgroundChecks() throws InterruptedException {
        administrationLink().click();
        Thread.sleep(3000);
        administrationBackgroundChecksLink().click();
    }

    /**
     * Administration > Background Checks > Electronic Record Sources.
     */
    public void navToAdminBackgroundChecksElectronicRecordSources() {
        administrationLink().click();
        administrationBackgroundChecksElectronicRecordSourcesLink().click();
    }

    /**
     * Administration > Background Checks > Match Audit.
     */
    public void navToAdminBackgroundChecksMatchAudit() {
        administrationLink().click();
        administrationBackgroundChecksMatchAuditLink().click();
    }

    /**
     * Administration > Background Checks > Volunteer Applicant Sources.
     */
    public void navToAdminBackgroundChecksVolunteerApplicantSources() {
        administrationLink().click();
        administrationBackgroundChecksVolunteerApplicantSourcesLink().click();
    }

    /**
     * Administration > Directory.
     */
    public void navToAdminDirectory() {
        administrationLink().click();
        administrationDirectoryLink().click();
    }

    /**
     * Administration > Linked Accounts > Bar Codes.
     */
    public void navToAdminLinkedAccountsBarCodes() {
        administrationLink().click();
        administrationLinkedAccountBarCodesLink().click();
    }

    /**
     * Administration > Linked Accounts > Kiosks.
     */
    public void navToAdminLinkedAccountsKiosks() {
        administrationLink().click();
        administrationLinkedAccountKiosksLink().click();
    }

    /**
     * Administration > Linked Accounts > sample Go.
     */
    public void navToAdminLinkedAccountssampleGo() {
        administrationLink().click();
        administrationLinkedAccountsampleGoLink().click();
    }

    /**
     * Administration > Linked Accounts > Users.
     */
    public void navToAdminLinkedAccountsUsers() {
        administrationLink().click();
        administrationLinkedAccountUsersLink().click();
    }

    /**
     * Administration > Manage Customer Account.
     */
    public void navToAdminManageCustomerAccount() {
        administrationLink().click();
        administrationManageCustomerAccountLink().click();
    }

    /**
     * Administration > Rules.
     */
    public void navToAdminRules() {
        administrationRulesLink().click();
    }

    /**
     * Administration > Workflows.
     */
    public void navToAdminWorkflows() {
        administrationLink().click();
        administrationWorkflowsLink().click();
    }

    /**
     * Dashboard.
     */
    public void navToDashboard() {
        dashboardLink().click();
    }

    /**
     * Linked Accounts > Bar Codes.
     */
    public void navToLinkedAccountsBarCodes() {
        sideMenuAdministrationLinkedAccountsLink().click();
        administrationLinkedAccountBarCodesLink().click();
    }

    /**
     * Linked Accounts > Kiosks.
     */
    public void navToLinkedAccountsKiosks() {
        sideMenuAdministrationLinkedAccountsLink().click();
        administrationLinkedAccountKiosksLink().click();
    }

    /**
     * Linked Accounts > sample Go.
     */
    public void navToLinkedAccountssampleGo() {
        sideMenuAdministrationLinkedAccountsLink().click();
        administrationLinkedAccountsampleGoLink().click();
    }

    /**
     * Linked Accounts > Users.
     */
    public void navToLinkedAccountsUsers() {
        sideMenuAdministrationLinkedAccountsLink().click();
        administrationLinkedAccountUsersLink().click();
    }

    /**
     * Reports.
     */
    public void navToReports(){
        reportsLink().click();
    }

    /**
     * Scheduled > Events.
     */
    public void navToScheduledEvents() {
        scheduledLink().click();
        scheduledEventLink().click();
    }

    /**
     * Scheduled > Visitors.
     */
    public void navToScheduledVisitors() {
        scheduledLink().click();
        scheduledVisitorLink().click();
    }

    /**
     * Sign in Visitor
     */
    public void clickSignInVisitorButton() {
        signInAVisitorButton().click();
    }

    /**
     * Visitors > Denied.
     */
    public void navToVisitorDeniedPage() {
        visitorsLink().click();
        visitorsDeniedLink().click();
    }

    /**
     * Visitors > Signed In.
     */
    public void navToVisitorSignedInPage() {
        visitorsLink().click();
        visitorsSignedInLink().click();
    }

    /**
     * Visitors > Signed Out.
     */
    public void navToVisitorSignedOutPage() {
        visitorsLink().click();
        visitorsSignedOutLink().click();
    }

    /**
     * Volunteers > Applicants.
     */
    public void navToVolunteersApplicantsPage() {
        volunteersLink().click();
        volunteersApplicantsLink().click();
    }

    /**
     * Volunteers > Approved.
     */
    public void navToVolunteersApprovedPage() {
        volunteersLink().click();
        volunteersApprovedLink().click();
    }

}
