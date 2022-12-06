package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //Verify the ‘Dashboard’ text is display
    By dashboardText = By.xpath("//h6[text()='Dashboard']");
    public String getDashboardText(){
        return getTextFromElement(dashboardText);
    }
}
