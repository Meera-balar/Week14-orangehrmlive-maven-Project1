package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {
    //Verify the text ‘Reset Password’
    By resetPasswordText = By.xpath("//h6[text()='Reset Password']");
    public String getResetPasswordText(){
        return getTextFromElement(resetPasswordText);
    }
}
