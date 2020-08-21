package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/sign_in");

        //cssSelector kullanirken class value kullaniyorsak .value
        //                         id kullaniyorsak  #value
        WebElement emailBox=driver.findElement(By.cssSelector("input#session_email"));
        emailBox.sendKeys("testtechproed@gmail.com");

       WebElement passWordBox=driver.findElement(By.cssSelector("#session_password"));
       passWordBox.sendKeys("Test1234!");









    }
}
