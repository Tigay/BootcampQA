package com.wag.testDate;

import com.wag.BasePage;
import com.wag.BaseTest;
import com.wag.HomePage;
import com.wag.PromotionPage;
import org.junit.Assert;
import org.junit.Test;

public class ErrorPromotionTest extends BaseTest {
    private HomePage homePage;
    private PromotionPage promotionPage;
// negative test
    @Test

    public void  errorTest(){
        homePage = new HomePage(driver);
        promotionPage = homePage.clickWalkFreeButton();
        promotionPage.clickEmailField();
        promotionPage.clickFirstName();
        promotionPage.clickLastName();
        promotionPage.clickTel();
        promotionPage.clickEmailField();

         String error = promotionPage.getErrorForEmailField();
        System.out.println(error);
         Assert.assertEquals("required",error);

         String error1 = promotionPage.getErrorForFirstName();
        System.out.println(error1);
         Assert.assertEquals("required",error1);

         String error2 = promotionPage.getErrorForLastName();
        System.out.println(error2);
         Assert.assertEquals("required",error2);

         String error3 = promotionPage.getErrorForPhoneNumber();
        System.out.println(error3);
         Assert.assertEquals("required",error3);








    }
}
