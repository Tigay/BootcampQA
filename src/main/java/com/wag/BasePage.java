package com.wag;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;



    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;


        }
    }

