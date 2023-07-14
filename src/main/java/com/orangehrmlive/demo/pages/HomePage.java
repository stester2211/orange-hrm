package com.orangehrmlive.demo.pages;

/** Search, Admin, PIM, Leave, and Dashboard locators and create appropriate methods for it.*/

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility
{
    By clickAdminTab= By.xpath("//span[text()='Admin']");
    public void clickOnAdminTab()
    {
        //click On "Admin" Tab
        clickOnElement(clickAdminTab);
    }

}
