package com.orangehrmlive.demo.pages;

/**
 * - System Users Text, Username Field, User Roll dropDown, Employee Name Field,
 *   Status Drop Down, Search Button, Reset Button, Add Button and Delete Button locators and
 *   it's actions
 */

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility
{
    By actualTextSystemUser= By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");
    By enterUserName= By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By selectUserRole = By.xpath("(//div[contains(text(),'-- Select --')])[1]");
    By selectUserAdmin = By.xpath("//span[contains(text(),'Admin')]");
    By selectStatus = By.xpath("(//i)[13]");
    By selectStatusDisable = By.xpath("//span[normalize-space()='Enabled']");
    By clickSearchButton= By.xpath("//button[normalize-space()='Search']");
    By actualTextUsernameInResult= By.xpath("(//div[contains(text(),'Admin')])[2]");
    By clickOnUserCheckBox= By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[3]");
    By clickOnDeleteButton= By.xpath("(//button[@type='button'])[8]");
    By clickOnOk= By.xpath("//button[normalize-space()='Yes, Delete']");
    By actualTextSuccessfullyDeleted= By.xpath("(//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text'])[1]");
    By actualTextNoUserFound= By.xpath("(//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text'])[1]");
    public void verifySystemUser()
    {
        //Verify "System Users" Text
        assertVerifyText(actualTextSystemUser,"System Users","System user text not found");
    }
    public void enterUsername()
    {
        //Enter Username
        sendTextToElement(enterUserName,"Admin");
    }
    public void selectUserRole()
    {
        //Select User Role
       clickOnElement(selectUserRole);
       clickOnElement(selectUserAdmin);
    }
    public void selectUserStatus()
    {
        //Select Status
        clickOnElement(selectStatus);
        clickOnElement(selectStatusDisable);
    }
    public void clickOnSearchButton()
    {
        //Click on "Search" Button
        clickOnElement(clickSearchButton);
    }
    public void verifyUserInResultList()
    {
        //Verify the User should be in Result list.
        boolean userList= driver.findElement(actualTextUsernameInResult).isDisplayed();
    }
    public void clickOnCheckBox()
    {
        //Click on Check box
        clickOnElement(clickOnUserCheckBox);
    }
    public void clickOnDeleteButton()
    {
        //Click on Delete Button
        clickOnElement(clickOnDeleteButton);
    }
    public void clickOnOkButton()
    {
        //Popup will display
        //Click on Ok Button on Popup
        clickOnElement(clickOnOk);
    }
    public void verifyTextDeleted()
    {
        //verify message "Successfully Deleted"
        assertVerifyText(actualTextSuccessfullyDeleted,"Successfully Deleted","User not deleted");
    }
    public void verifyNoUserFound()
    {
        //verify message "No Records Found"
        assertVerifyText(actualTextNoUserFound,"No Records Found","No user found");
    }
}
