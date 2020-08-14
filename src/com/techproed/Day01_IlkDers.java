package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Day01_IlkDers {

    public static void main(String[] args) {

        //webdriver nesnesini olusturup,chorme kullanilir hale getirdik
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();

        //driver'a google gitmesini soyledim
        webDriver.get("https://www.google.com");

        //web'i kapatir or close acik olan pencereyi
        webDriver.quit();//google tamamen kapatir



    }



}
