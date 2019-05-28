package com.wag.testDate;

import com.wag.BaseTest;
import com.wag.HomePage;
import com.wag.PromotionPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IncorrectEmailTest extends BaseTest {
    private HomePage homePage;
    private PromotionPage promotionPage;
// negative test email
    @Test
    public void  testIncorrectEmail(){
        homePage = new HomePage(driver);

        promotionPage = homePage.clickWalkFreeButton();

        promotionPage.clickEmailField();

        promotionPage.inputEmailField("765873427");

        promotionPage.clickFirstName();

        String error = promotionPage.getErrorForEmailField();
        System.out.println(error);
        Assert.assertEquals("please provide a valid email",error);

        }

    }
