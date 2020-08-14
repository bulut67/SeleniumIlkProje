package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class   Day02_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.google.com");
        webDriver.navigate().to("https://www.amazon.com");
        String sayfaTitle= webDriver.getTitle();
        String sayfaUrl=webDriver.getCurrentUrl();
        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);






    }


}
