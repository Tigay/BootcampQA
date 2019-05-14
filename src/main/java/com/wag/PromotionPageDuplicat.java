package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PromotionPageDuplicat extends BasePage {
    public PromotionPageDuplicat(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> formElements;

    @FindBy(css = "p.sc-gzVnrw.htpxiB")
    private WebElement nextButton;

    @FindBy(css = "p.sc-gzVnrw.bMAZbm")
    private List<WebElement> confirmNotification;


    public void inputEmailField(String email) {
        wait.until(ExpectedConditions.visibilityOfAllElements(formElements));
        formElements.get(0).sendKeys(email);
    }

    public void inputPasswordField(String password){
        formElements.get(1).sendKeys(password);
    }

   public void inputFirstName(String firstName){
       formElements.get(2).sendKeys(firstName);
   }
    public void inputLastName(String lastName){
        formElements.get(3).sendKeys(lastName);
   }
    public void inputTel(String number){
        formElements.get(4).sendKeys(number);
    }
    public  String clickButton(){
        nextButton.click();
        String res =  nextButton.getText();
        return res;

    }
    public String getEmailField(){
        String res =  formElements.get(0).getAttribute("value");
        return res;
    }
    public String getPasswordField(){
        String res1 = formElements.get(1).getAttribute("value");
        return res1;
    }

    public String getFirstName(){
        String res2 = formElements.get(2).getAttribute("value");
        return res2;
    }
    public String getLastName(){
        String res3 = formElements.get(3).getAttribute("value");
        return res3;
    }
    public  String getTel(){
        String res4 = formElements.get(4).getAttribute("value");
        return res4;
    }
    public  String getConfirmNotification(){
        String res6 = confirmNotification.get(1).getText();
        return res6;
    }
}