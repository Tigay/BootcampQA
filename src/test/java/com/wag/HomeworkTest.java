package com.wag;

import com.wag.testDate.User;
import org.junit.Assert;
import org.junit.Test;

public class HomeworkTest extends BaseTest{
    private HomePage homePage;

    @Test
    public void testFirst() throws InterruptedException {

        homePage= new HomePage(driver);

        homePage.clickWalkFreeButton();

        PromotionPageDuplicat promotionPageDuplicat = new PromotionPageDuplicat(driver);
        User user = new User();
        promotionPageDuplicat.inputEmailField(user.getEmail());
        promotionPageDuplicat.inputPasswordField(user.getPassword());
        promotionPageDuplicat.inputFirstName(user.getFirstName());
        promotionPageDuplicat.inputLastName(user.getLastName());
        promotionPageDuplicat.inputTel(user.getPhone());
        String res = promotionPageDuplicat.clickButton();
        Assert.assertEquals("NEXT",res);

        String email =  promotionPageDuplicat.getEmailField();
        Assert.assertEquals(user.getEmail(),email);

        String password = promotionPageDuplicat.getPasswordField();
        Assert.assertEquals(user.getPassword(),password);

        String firstName = promotionPageDuplicat.getFirstName();
        Assert.assertEquals(user.getFirstName(),firstName);

        String lastName = promotionPageDuplicat.getLastName();
        Assert.assertEquals(user.getLastName(),lastName);

        String tel = promotionPageDuplicat.getTel();
        Assert.assertEquals(user.getPhone(),tel);

        String message = promotionPageDuplicat.getConfirmNotification();
        Assert.assertEquals("Let's start with the basics",message);

    }
}
