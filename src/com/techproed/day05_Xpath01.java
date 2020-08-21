package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day05_Xpath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");
        WebElement signInbox=driver.findElement(By.id("sign-in"));
        signInbox.click();

        WebElement emailBox=driver.findElement(By.xpath("//input[@type='email']"));
        emailBox.sendKeys("testtechproed@gmail.com");
        WebElement sifreKutusu = driver.findElement(By.xpath("//input[@type='password']"));
        sifreKutusu.sendKeys("Test1234!");

        WebElement signInBox=driver.findElement(By.xpath("//input[@name='commit']"));
        signInBox.click();

    }
}
