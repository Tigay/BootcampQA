package com.wag;

import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2RTFDTM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PromotionPage extends BasePage {
public PromotionPage(WebDriver driver){
    super(driver);

}
@FindBy(css = "input[type=\"email\"]")
private WebElement emailField;

@FindBy(css = "input[type = \"password\"]")
private  WebElement passwordField;

@FindBy(css = "input[name=\"firstName\"]")
private WebElement firstNameField;

@FindBy(css = "input[name=\"lastName\"]")
private WebElement lastNameField;

@FindBy(css = "input[type = \"tel\"]")
private WebElement telField;

    @FindBy(css = "p.sc-gzVnrw.htpxiB")
    private WebElement nextButton;

    @FindBy(css = "p.sc-gzVnrw.bMAZbm")
    private List<WebElement> confirmNotification;


    public void inputEmailField(String email) {
        emailField.sendKeys(email);
    }
    public void inputPasswordField(String password){
            passwordField.sendKeys(password);
 }

    public void inputFirstName(String firstName){
        firstNameField.sendKeys(firstName);
 }
 public void inputLastName(String lastName){
       lastNameField.sendKeys(lastName);
 }
 public void inputTel(String number){
        telField.sendKeys(number);
 }
 public  String clickButton(){
        nextButton.click();
       String res =  nextButton.getText();
     return res;

 }
 public String getEmailField(){
        String res =  emailField.getAttribute("value");
        return res;
    }
    public String getPasswordField(){
        String res1 = passwordField.getAttribute("value");
        return res1;
    }
    public String getFirstName(){
        String res2 = firstNameField.getAttribute("value");
        return res2;
    }
    public String getLastName(){
        String res3 = lastNameField.getAttribute("value");
        return res3;
    }
    public  String getTel(){
        String res4 = telField.getAttribute("value");
        return res4;
    }
    //next comment
    public  String getConfirmNotification(){
        String res6 = confirmNotification.get(1).getText();
        return res6;
    }


}
