package com.wag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BecomeWalkerPage extends BasePage{
    @FindBy(css = "#first_name")
    private WebElement firstNameField;

    @FindBy(css = "#last_name")
    private WebElement lastNameField;

    @FindBy(css = "#email")
    private WebElement emailField;

    @FindBy(css ="#phone")
    private  WebElement phoneField;

    @FindBy(css = "#address__line-one")
    private WebElement addressField;

    @FindBy(css = ".autocomp-result")
    private List<WebElement>listAddress;

    @FindBy(css = "#address__line-two")
    private WebElement apartmentField;

    @FindBy(css = "#city")
    private WebElement cityField;

    @FindBy(css = ".btn.common-dropdown.common-dropdown-item")
    private WebElement stateField;

    @FindBy(css = ".common-dropdown.common-item-text")
    private List<WebElement>stateList;

    @FindBy(css = "#zipcode")
    private WebElement zipcodeField;

    @FindBy(css = ".button-text-wrapper")
    private WebElement applyButton;



    public BecomeWalkerPage(WebDriver driver) {
        super(driver);
    }
    public void inputFirstNameField(String firstName){
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }
    public void inputLastNameField(String lastName){
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);
    }
    public void inputEmailField(String email){
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }
    public void inputPhoneField(String phone){
        wait.until(ExpectedConditions.elementToBeClickable(phoneField));
        phoneField.sendKeys(phone);
    }
    public  void inputAddressField(String address){
        wait.until(ExpectedConditions.elementToBeClickable(addressField));
        addressField.sendKeys(address);

        public void confirmAddress(){
            wait.until(ExpectedConditions.visibilityOfAllElements(listAddress));
            int size = listAddress.size();
            System.out.println(size);
            listAddress.get(1);
        }
    }
    public void inputAptField(String apartment){
        wait.until(ExpectedConditions.elementToBeClickable(apartmentField));
        apartmentField.sendKeys(apartment);
    }
    public void inputCityField(String city){
        wait.until(ExpectedConditions.elementToBeClickable(cityField));
        cityField.sendKeys(city);
    }
    public void inputStateField(String state){
        wait.until(ExpectedConditions.elementToBeClickable(stateField));
        stateField.sendKeys(state);
    }
    public void inputZipCodeField(String zipCode){
        wait.until(ExpectedConditions.elementToBeClickable(zipcodeField));
        zipcodeField.sendKeys(zipCode);
    }
    public void clickStateField(){
        wait.until(ExpectedConditions.elementToBeClickable(stateField));
        stateField.click();
    }
    public void selectState(){
        wait.until(ExpectedConditions.elementToBeClickable(stateList.get(2)));
        stateList.get(2).click();
    }


    public String clickBecomeWalkerButton(){
        wait.until(ExpectedConditions.elementToBeClickable(applyButton));
        applyButton.click();
        String res1 = applyButton.getText();
        return res1;
    }
    public void clickAptField(){
        wait.until(ExpectedConditions.elementToBeClickable(apartmentField));
        apartmentField.click();
    }

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPhoneField() {
        return phoneField;
    }

    public WebElement getAddressField() {
        return addressField;
    }

    public WebElement getAptField() {
        return apartmentField;
    }

    public WebElement getCityField() {
        return cityField;
    }

    public WebElement getStateField() {
        return stateField;
    }

    public WebElement getZipcodeField() {
        return zipcodeField;
    }
}
