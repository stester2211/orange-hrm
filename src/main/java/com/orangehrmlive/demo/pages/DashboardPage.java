package com.orangehrmlive.demo.pages;

/** Dashboard text Locator and create appropriate methods for it.*/

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility
{
    By actualTextDashboard= By.xpath("//h6[normalize-space()='Dashboard']");
    By logoDisplayed= By.xpath("//img[@alt='company-branding']");
    String launchUrl="https://opensource-demo.orangehrmlive.com/";
    By clickOnUserProfileLogo= By.xpath("//img[@class='oxd-userdropdown-img']");
    By clickOnLogout= By.xpath("//a[normalize-space()='Logout']");
    By actualTextLogin= By.xpath("//h5[normalize-space()='Login']");
    public void actualTextDashboard()
    {
        //Verify "Dashboard" Message
        assertVerifyText(actualTextDashboard,"Dashboard","Dashboard text not verify");
    }
    //Launch the application
    public void launchApplication()
    {
        driver.get(launchUrl);
    }
    public void verifyLogoIsDisplayed()
    {
        //Verify Logo is Displayed
        boolean logoDisplay= driver.findElement(logoDisplayed).isDisplayed();
    }
    public void clickOnUserLogo()
    {
        //Click on User Profile logo
        clickOnElement(clickOnUserProfileLogo);
    }
    public void clickOnLogout()
    {
        //Mouse hover on "Logout" and click
        clickOnElement(clickOnLogout);
    }
    public void verifyTextLogin()
    {
        //Verify the text "Login Panel" is displayed
        assertVerifyText(actualTextLogin,"Login","Login panel not displayed");
    }
}
