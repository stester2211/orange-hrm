package com.orangehrmlive.demo.pages;

/**- Store username, password, Login Button, HR for All logo, and LOGIN Panel text Locators
 *   and create appropriate methods for it.
 */

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility
{
    By username= By.xpath("//input[@placeholder='Username']");
    By password= By.xpath("//input[@placeholder='Password']");
    By clickLogin= By.xpath("//button[@type='submit']");

    //Login to Application
    public void enterUserName()
    {
        //Enter the Username
        sendTextToElement(username,"Admin");
    }
    public void enterPassword()
    {
        //Enter the password
        sendTextToElement(password,"admin123");
    }
    public void clickOnLoginButton()
    {
        //Click On Login Button
        clickOnElement(clickLogin);
    }
}
