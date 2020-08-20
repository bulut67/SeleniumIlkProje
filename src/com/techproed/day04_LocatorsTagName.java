package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day04_LocatorsTagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");
    //id,name,className,linkText,partialLinkText,tagName
        WebElement sign= driver.findElement(By.linkText("Sign in"));
        sign.click();

        WebElement homeTagName=driver.findElement(By.tagName("a"));
        System.out.println( homeTagName.getText());//webelementin yazisini bulur getText()





    }
}
