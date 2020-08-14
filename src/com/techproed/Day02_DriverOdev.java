package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.google.com");
        String sayfaTitle1= webDriver.getTitle();
        System.out.println(sayfaTitle1);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://www.youtube.com");

        webDriver.navigate().refresh();
        String sayfaTitle2= webDriver.getTitle();
        String sayfaUrl2=webDriver.getCurrentUrl();
        System.out.println(sayfaTitle2);
        System.out.println(sayfaUrl2);
        webDriver.navigate().back();
        String sayfaUrl1=webDriver.getCurrentUrl();
        System.out.println(sayfaUrl1);
        webDriver.quit();



    }
}
