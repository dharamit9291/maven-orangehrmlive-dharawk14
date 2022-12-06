package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordPageTest extends BaseTest {
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPasswordPage.clickOnForgotPasswordLink();
        String expectedMessage  = "Reset Password";
        Assert.assertEquals(forgotPasswordPage.getResetPasswordMessage(),expectedMessage,"Not matching message");
    }
}
