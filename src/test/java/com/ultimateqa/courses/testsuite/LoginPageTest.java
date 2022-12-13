package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.customlisteners.CustomListeners;
import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    HomePage  homePage;

    @BeforeMethod (alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
    @Test(groups = {"sanity", "regression"})
    public void verifyTheErrorMessage() {
        loginPage.navigatedToLoginPage();
        loginPage.userName("happy@gmail.com");
        loginPage.passwordField("happy123");
        loginPage.setSignInButton();
        String expectedErrorMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.getErrorMessage(), expectedErrorMessage, "Error message not displayed");

    }
}