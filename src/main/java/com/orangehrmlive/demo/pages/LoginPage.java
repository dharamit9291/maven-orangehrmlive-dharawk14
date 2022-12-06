package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By headerTitleDashboard = By.xpath("//h6[text() = 'Dashboard']");

    public void enterUsername() {
        sendTextToElement(usernameField, "Admin");
    }

    public void enterPassword() {
        sendTextToElement(passwordField, "admin123");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getHeaterTitleDashboard() {
        return getTextFromElement(headerTitleDashboard);

    }
}
