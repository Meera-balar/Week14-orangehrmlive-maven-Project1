package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[text()=' Login ']");

    By forgotPasswordLink = By.xpath("//p[text()='Forgot your password? ']");

    public void enterUserName(String username){
        sendTextToElement(userNameField,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public void clickOnForgotPasswordLink(){
        clickOnElement(forgotPasswordLink);
    }
}
