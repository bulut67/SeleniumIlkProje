package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day03_LocatorGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

    driver.get("http://a.testaddressbook.com");

    WebElement  signInLink=driver.findElement(By.id("sign-in"));
    signInLink.click();


    WebElement emailBox=driver.findElement(By.id("session_email"));
    emailBox.sendKeys("testtechproed@gmail.com");

    WebElement passwordBox=driver.findElement(By.id("session_password"));
    passwordBox.sendKeys("Test1234!");

    WebElement sigInBox=driver.findElement(By.name("commit"));
    sigInBox.click();

    String baslik=driver.getTitle();
    if (baslik.equals("Address Book")){
        System.out.println("Giris Basarili ,WEll done");
    }else{
        System.out.println("Giris Basarili olamadi!!");
    }

    driver.quit();






    }
}
