package com.orangehrmlive.demo.pages;

/** UserManagement, Job, Organization Tabs Locators and it's actions */

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility
{
    By clickOnUserManagement= By.xpath("(//li[@class='oxd-topbar-body-nav-tab --parent --visited'])[1]");
    By clickOnJob= By.xpath("//header[@class='oxd-topbar']//li[2]");
    By clickOnOrganization= By.xpath("//span[normalize-space()='Organization']");

    public void clickOnUserManagementTab()
    {
        //Click On user management tab
        clickOnElement(clickOnUserManagement);
    }
    public void clickOnJobTab()
    {
        //Click On Job tab
        clickOnElement(clickOnJob);
    }
    public void clickOnOrganizationTab()
    {
        //Click on organization
        clickOnElement(clickOnOrganization);
    }
}
