package com.ultimateqa.courses.pages;

import com.aventstack.extentreports.Status;
import com.ultimateqa.courses.customlisteners.CustomListeners;
import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
   // @FindBy(xpath = "//li[@class='header__nav-item header__nav-sign-in']/a[1]")
            @FindBy(xpath = "//a[contains(text(),'Sign In')]")

    WebElement navigateToLoginPage;

    public void navigatedToLoginPageWithClick(){
        CustomListeners.test.log(Status.PASS,"navigate To Login Page With Click ");
        clickOnElement(navigateToLoginPage);

    }}


