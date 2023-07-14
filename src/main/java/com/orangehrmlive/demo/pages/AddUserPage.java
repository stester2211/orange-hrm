package com.orangehrmlive.demo.pages;

/**  - User Role Drop Down, Employee Name, Username, Status Drop Down, Password, Confirm Password,
 Save and Cancle Button Locators and it's actions */

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility
{
    By clickAddButton= By.xpath("//button[normalize-space()='Add']");
    By actualAddUserText= By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']");
    By selectUserRole=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
    By selectAdmin= By.xpath("//span[contains(text(),'Admin')]");
    By enterEmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By employeeHint= By.xpath("//span[contains(text(),'Paul')]");
    By enterUsername= By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By selectStatus= By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
    By selectStatusDisable= By.xpath("//span[normalize-space()='Disabled']");
    By enterPassword= By.xpath("(//input[@type='password'])[1]");
    By enterConfirmPassword= By.xpath("(//input[@type='password'])[2]");
    By clickOnSaveButton = By.xpath("//button[@type='submit']");
    By actualMessageSaved= By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");

    public void clickOnAddButton()
    {
        //click On "Add" button
        clickOnElement(clickAddButton);
    }
    public void verifyAddUserText()
    {
        //Verify "Add User" Text
        assertVerifyText(actualAddUserText,"Add User","Add user text not found");
    }
    public void selectUserOptions(String option)
    {
        //Select User Role "Admin"
        clickOnElement(selectUserRole);
        clickOnElement(selectAdmin);
    }
    public void enterEmployeeName()
    {
        //enter Employee Name "Paul Collings"
        sendTextToElement(enterEmployeeName,"Paul");
        clickOnElement(employeeHint);
    }
    public void enterUserName()
    {
        //enter Username
        sendTextToElement(enterUsername,"Vishwaap");
    }
    public void selectStatus()
    {
        //Select status "Disable"
        clickOnElement(selectStatus);
        clickOnElement(selectStatusDisable);
    }
    public void enterPassword()
    {
        //enter password
        sendTextToElement(enterPassword,"V123456789v");
    }
    public void enterConfirmPassword()
    {
        //enter Confirm Password
        sendTextToElement(enterConfirmPassword,"V123456789v");
    }
    public void clickOnSaveButton()
    {
        //click On "Save" Button
        clickOnElement(clickOnSaveButton);
    }
    public void verifySuccessfulMessage()
    {
        //verify message "Successfully Saved"
        assertVerifyText(actualMessageSaved,"Successfully Saved","User not added successfully");
    }
}
