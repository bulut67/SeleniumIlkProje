package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");

       // WebElement WelcomeBox=driver.findElement(By.tagName("h1"));

        WebElement Welyazisi=driver.findElement(By.xpath("//h1"));
        System.out.println(Welyazisi.getText());

        WebElement signInBox=driver.findElement(By.id("sign-in"));
        signInBox.click();

        WebElement signIn2=driver.findElement(By.xpath("//h2"));
        System.out.println(signIn2.getText());


    }
}
