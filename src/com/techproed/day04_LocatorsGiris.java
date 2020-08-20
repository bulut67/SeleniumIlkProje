package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day04_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");
        WebElement signInLink=driver.findElement(By.id("sign-in"));
        signInLink.click();

        WebElement emailBox=driver.findElement(By.className("form-control"));
        emailBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordBox= driver.findElement(By.name("session[password]"));
        passwordBox.sendKeys("Test1234!");

        WebElement sigInBox=driver.findElement(By.name("commit"));
        sigInBox.click();


    }
}
