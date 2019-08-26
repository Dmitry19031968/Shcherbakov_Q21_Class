package com.telran.selenium;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class LoginToEbay extends TestBase{

    @Test
    public void LogInTest(){
        openSite("https://ebay.com");
        //init login
        initLogin();

        //init fill login form
        initFillLoginForm("adfgkkdk@gdkdkkd.com", "123456789");
        //confirm login
        confirmLogin();

    }


}
