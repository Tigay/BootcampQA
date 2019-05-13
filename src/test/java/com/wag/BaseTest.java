package com.wag;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;
    @Before
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver","C:/Users/didi1/Downloads/chromedriver_win32/chromedriver.exe");

        driver =  new ChromeDriver();
        driver.get("https://wagwalking.com/");
        System.out.println("Start");
    }
    @After
    public void close(){
        System.out.println("End");
       // driver.quit();
    }
}
