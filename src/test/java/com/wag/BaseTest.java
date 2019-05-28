package com.wag;

import com.wag.testDate.User;
import com.wag.testDate.UserBecomeWalker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    public WebDriver driver;
    protected User user;
    protected HomePage homePage;
    protected WebDriverWait wait;
    protected UserBecomeWalker userBecomeWalker;


    @Before
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver","C:/Users/didi1/Downloads/chromedriver_win32/chromedriver.exe");

        driver =  new ChromeDriver();
        driver.get("https://wagwalking.com/");
        String titleExpected = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

        String title = driver.getTitle();

        Assert.assertEquals(titleExpected, title);

        System.out.println("Start");
        user = new User();
        userBecomeWalker = new UserBecomeWalker();
        wait = new WebDriverWait(driver,10);
    }
//    @After
//    public void close(){
//        System.out.println("End");
       // driver.quit();
        //ssecond
    }

