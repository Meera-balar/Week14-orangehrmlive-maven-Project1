package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        loginPage.clickOnForgotPasswordLink();
        String expectedText = "Reset Password";
        Assert.assertEquals(forgotPasswordPage.getResetPasswordText(),expectedText,"Reset password text not displayed");
    }
}
