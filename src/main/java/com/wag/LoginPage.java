package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[type=\"password\"]")
    private WebElement passwordField;

    @FindBy(css =".btn.btn-secondary.btn-block")
    private WebElement loginButton;


    public void inputEmailField(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void inputPasswordField(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        emailField.sendKeys(password);
    }
    public void clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

}