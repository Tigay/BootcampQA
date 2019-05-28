package com.wag.testDate;

import com.wag.*;
import org.junit.Test;

public class LoginInvalidDateTest extends BaseTest {
    private HomePage homePage;
    private LoginPage loginPage;

    // negative test login
    @Test
    public void testLoginInvalidData() {
        homePage = new HomePage(driver);
        loginPage = homePage.clickLoginButton();

        loginPage.inputEmailField("tigay02@gmail.com");

        loginPage.inputPasswordField("123");

        loginPage.clickLoginButton();


    }
}