package com.wag;

;
import com.wag.testDate.User;
import org.junit.Assert;
import org.junit.Test;

public class TestPromotionAction extends BaseTest {
    private HomePage homePage;
    private PromotionPage promotionPage;

   @Test
    public void testFirst() throws InterruptedException {

        homePage= new HomePage(driver);

        promotionPage = homePage.clickWalkFreeButton();

       //PromotionPage promotionPage = new PromotionPage(driver);
        User user =new User();
       promotionPage.inputEmailField(user.getEmail());
       promotionPage.inputPasswordField(user.getPassword());
       promotionPage.inputFirstName(user.getFirstName());
       promotionPage.inputLastName(user.getLastName());
       promotionPage.inputTel(user.getPhone());
       String res = promotionPage.clickButton();
       Assert.assertEquals("NEXT",res);

       String email =  promotionPage.getEmailField();
       System.out.println(email);
       Assert.assertEquals(user.getEmail(),email);

       String password = promotionPage.getPasswordField();
       Assert.assertEquals(user.getPassword(),password);

       String firstName = promotionPage.getFirstName();
       Assert.assertEquals(user.getFirstName(),firstName);

       String lastName = promotionPage.getLastName();
       Assert.assertEquals(user.getLastName(),lastName);

       String tel = promotionPage.getTel();
       Assert.assertEquals(user.getPhone(),tel);

       String message = promotionPage.getConfirmNotification();
       Assert.assertEquals("Let's start with the basics",message);






    }


}
