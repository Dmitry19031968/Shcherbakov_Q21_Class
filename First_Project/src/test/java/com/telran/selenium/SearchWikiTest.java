package com.telran.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchWikiTest {
    WebDriver wiki;

    @Test
    public void setUp1() throws InterruptedException {
        wiki = new ChromeDriver();
        wiki.get("https://en.wikipedia.org");
        wiki.findElement(By.name("search")).sendKeys("Java");
        Thread.sleep(5000);
        wiki.quit();
    }
}
