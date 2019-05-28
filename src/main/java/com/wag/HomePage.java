package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);

    }
    @FindBy(css = ".sc-bdVaJa.sc-bwzfXH.jUXfpw button p")
    private WebElement walkFreeButton;

    @FindBy(css = ".sc-EHOje.hjXGpR")
    private WebElement loginButton;

    @FindBy(css = ".sc-EHOje.cWxJHM")
    private WebElement becomeWalkerButton;


    public PromotionPage clickWalkFreeButton(){
        wait.until(ExpectedConditions.elementToBeClickable(walkFreeButton));
        walkFreeButton.click();
        return new PromotionPage(driver);
    }
    public LoginPage clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
        return new LoginPage(driver);
    }
    public BecomeWalkerPage clickBecomeWalkerButton(){
        wait.until(ExpectedConditions.elementToBeClickable(becomeWalkerButton));
        becomeWalkerButton.click();
        return new BecomeWalkerPage(driver);

    }



}
