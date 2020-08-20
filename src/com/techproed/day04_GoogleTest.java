package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class day04_GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://Google.com/");
       WebElement searchBox=driver.findElement(By.name("q"));
       searchBox.sendKeys("city bike");
    searchBox.submit();
    WebElement sonuc=driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());
        driver.quit();



        }
    }

