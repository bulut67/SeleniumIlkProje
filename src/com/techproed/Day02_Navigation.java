package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Navigation {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver() ;

        webDriver.manage().window().maximize();

        webDriver.get("https://www.google.com");


        webDriver.navigate().to("https://www.apple.com");

        webDriver.navigate().back();
        webDriver.navigate().forward();

        webDriver.navigate().to("https://www.youtube.com");
        webDriver.navigate().refresh();



        webDriver.quit();

    }
}
