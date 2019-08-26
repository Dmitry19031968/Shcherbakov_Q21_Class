package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//        driver.findElement(By.name("q")).sendKeys("java");
//        //driver.navigate().to();
//        Thread.sleep(3000);
//        driver.quit();
    }

    @AfterMethod
    public void tearDown(){
    driver.quit();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void openSite(String url) {
        driver.get(url);
    }

    public void confirmLogin() {
        click(By.id("sgnBt"));
    }

    public void initFillLoginForm(String login, String pwd) {
        type(By.id("userid"), login);
        type(By.id("pass"), pwd);
    }

    public void initLogin() {
        click(By.id("gh-ug"));
    }
}