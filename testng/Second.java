package com.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Second {
    @Test
    public void TestGoogle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("hyr tutorials", Keys.ENTER);
        System.out.println(driver.getTitle());
        driver.quit();
    }
    @Test
    public void TestFacebook(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("hyr tutorials", Keys.ENTER);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}