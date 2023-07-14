package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class UserTest extends BaseTest
{
    LoginPage loginPage= new LoginPage();
    HomePage homePage= new HomePage();
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage= new AdminPage();
    ViewSystemUsersPage viewSystemUsersPage= new ViewSystemUsersPage();

    //1.adminShouldAddUserSuccessFully().
    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException
    {
        //Login to Application
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);

        //click On "Admin" Tab
        homePage.clickOnAdminTab();

        //Verify "System Users" Text
        viewSystemUsersPage.verifySystemUser();

        //click On "Add" button
        addUserPage.clickOnAddButton();

        //Verify "Add User" Text
        addUserPage.verifyAddUserText();

        //Select User Role "Admin"
        addUserPage.selectUserOptions("Admin");

        //enter Employee Name "Ananya Dash"
        addUserPage.enterEmployeeName();
        Thread.sleep(2000);

        //Select status "Disable"
        addUserPage.selectStatus();
        Thread.sleep(1000);

        //enter Username
        addUserPage.enterUserName();
        Thread.sleep(1000);

        //enter password
        addUserPage.enterPassword();

        //enter Confirm Password
        addUserPage.enterConfirmPassword();

        //click On "Save" Button
        addUserPage.clickOnSaveButton();

        //verify message "Successfully Saved"
        addUserPage.verifySuccessfulMessage();
        Thread.sleep(1000);
    }

    //2. searchTheUserCreatedAndVerifyIt().
    @Test
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        //Login to Application
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);

        //click On "Admin" Tab
        homePage.clickOnAdminTab();

        //Verify "System Users" Text
        viewSystemUsersPage.verifySystemUser();

        //Enter Username
        viewSystemUsersPage.enterUsername();

        //Select User Role
        viewSystemUsersPage.selectUserRole();
        Thread.sleep(1000);

        //Select Status
        viewSystemUsersPage.selectUserStatus();

        //Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();

        //Verify the User should be in Result list.
        viewSystemUsersPage.verifyUserInResultList();
        Thread.sleep(1000);
    }

    //3. verifyThatAdminShouldDeleteTheUserSuccessFully.
    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException
    {
        //Login to Application
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);

        //click On "Admin" Tab
        homePage.clickOnAdminTab();

        //Verify "System Users" Text
        viewSystemUsersPage.verifySystemUser();

        //Enter Username
        viewSystemUsersPage.enterUsername();

        //Select User Role
        viewSystemUsersPage.selectUserRole();
        Thread.sleep(1000);

        //Select Status
        viewSystemUsersPage.selectUserStatus();

        //Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();

        //Verify the User should be in Result list.
        viewSystemUsersPage.verifyUserInResultList();
        Thread.sleep(1000);

        //Click on Check box
        viewSystemUsersPage.clickOnCheckBox();

        //Click on Delete Button
        viewSystemUsersPage.clickOnDeleteButton();

        //Popup will display
        //Click on Ok Button on Popup
        viewSystemUsersPage.clickOnOkButton();

        //verify message "Successfully Deleted"
        viewSystemUsersPage.verifyTextDeleted();
    }

    //4. searchTheDeletedUserAndVerifyTheMessageNoRecordFound.
    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        //Login to Application
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);

        //click On "Admin" Tab
        homePage.clickOnAdminTab();

        //Verify "System Users" Text
        viewSystemUsersPage.verifySystemUser();

        //Enter Username
        viewSystemUsersPage.enterUsername();

        //Select User Role
        viewSystemUsersPage.selectUserRole();

        //Select Status
        viewSystemUsersPage.selectUserStatus();

        //Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();

        //verify message "No Records Found"
        viewSystemUsersPage.verifyNoUserFound();
    }
}
