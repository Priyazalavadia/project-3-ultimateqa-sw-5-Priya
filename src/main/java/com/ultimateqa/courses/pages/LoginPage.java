package com.ultimateqa.courses.pages;

import com.aventstack.extentreports.Status;
import com.ultimateqa.courses.customlisteners.CustomListeners;
import com.ultimateqa.courses.utility.Utility;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy (xpath = "//li[@class='header__nav-item header__nav-sign-in']/a[1]")
    WebElement navigateToSignInButton;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='page__heading']")
    WebElement welcomeBackMessage;
    @CacheLookup
    @FindBy (id = "user[email]")
    WebElement invalidUsername;
    @CacheLookup
    @FindBy (id = "user[password]")
    WebElement passcode;
    @CacheLookup
    @FindBy (xpath = "//button[@data-callback='onSubmit']")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath = "//li[@class='form-error__list-item']")
    WebElement errorMessage;



    public void navigatedToLoginPage(){
        CustomListeners.test.log(Status.PASS,"Enter navigatedToLoginPage " + navigateToSignInButton );
        clickOnElement(navigateToSignInButton);
    }

    public String Message(){
        CustomListeners.test.log(Status.PASS,"Enter Message " + welcomeBackMessage );
        return getTextFromElement(welcomeBackMessage);
    }
    public void userName(String email) {
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + invalidUsername );

        sendTextToElement(invalidUsername,email);
    }
    public void passwordField(String password){
        CustomListeners.test.log(Status.PASS,"Enter passwordField " + passcode );
        sendTextToElement(passcode,password);
    }

    public void setSignInButton(){
        CustomListeners.test.log(Status.PASS,"Enter  setSignInButton"+ signInButton );
        clickOnElement(signInButton);
    }
    public String getErrorMessage() {
        CustomListeners.test.log(Status.PASS,"Error message occurred " );

        return getTextFromElement(errorMessage);

    }
}




