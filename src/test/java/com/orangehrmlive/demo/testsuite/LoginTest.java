package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{
   LoginPage loginPage= new LoginPage();
   DashboardPage dashboardPage= new DashboardPage();

    //1. verifyUserShouldLoginSuccessFully()
    @Test
    public void verifyUserShouldLoginSuccessFully()
    {
        //Enter username
        loginPage.enterUserName();

        //Enter password
        loginPage.enterPassword();

        //Click on Login Button
        loginPage.clickOnLoginButton();

        //Verify "Dashboard" Message
        dashboardPage.actualTextDashboard();
    }

    //2. VerifyThatTheLogoDisplayOnLoginPage()
    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage() throws InterruptedException
    {
        //Launch the application
        dashboardPage.launchApplication();

        //Verify Logo is Displayed
        dashboardPage.verifyLogoIsDisplayed();
        Thread.sleep(1000);
    }

    //3. VerifyUserShouldLogOutSuccessFully()
    @Test
    public void VerifyUserShouldLogOutSuccessFully()
    {
        //Login To The application
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();

        //Click on User Profile logo
        dashboardPage.clickOnUserLogo();

        //Mouse hover on "Logout" and click
        dashboardPage.clickOnLogout();

        //Verify the text "Login Panel" is displayed
        dashboardPage.verifyTextLogin();
    }
}
