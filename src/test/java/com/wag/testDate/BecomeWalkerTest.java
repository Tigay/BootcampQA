package com.wag.testDate;

import com.wag.BasePage;
import com.wag.BaseTest;
import com.wag.BecomeWalkerPage;
import com.wag.HomePage;
import org.junit.Test;

public class BecomeWalkerTest extends BaseTest {
private BecomeWalkerPage becomeWalkerPage;
private HomePage homePage;

@Test
   public void testBecomeWalker() throws InterruptedException {
    homePage = new HomePage(driver);
    becomeWalkerPage = homePage.clickBecomeWalkerButton();
    becomeWalkerPage.inputFirstNameField(userBecomeWalker.getFirstName());
    becomeWalkerPage.inputLastNameField(userBecomeWalker.getLastName());
    becomeWalkerPage.inputEmailField(userBecomeWalker.getEmail());
    becomeWalkerPage.inputPhoneField(userBecomeWalker.getPhone());
    becomeWalkerPage.inputAddressField(userBecomeWalker.getAddress());
    //becomeWalkerPage.confirmAddress();


    Thread.sleep(2000);
    becomeWalkerPage.inputAptField(userBecomeWalker.getApartment());
    becomeWalkerPage.inputCityField(userBecomeWalker.getCity());
    becomeWalkerPage.clickStateField();
    becomeWalkerPage.selectState();
    becomeWalkerPage.inputZipCodeField(userBecomeWalker.getZipcode());
    becomeWalkerPage.clickBecomeWalkerButton();

}

}
