package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://amazon.com");
        String sayfaBasligi=driver.getTitle();

        //contains methodu bir yazinin icerisnde bir kelime grubunu gecip gecmedigini kontrol edr
        if (sayfaBasligi.toLowerCase().contains("books")){
            System.out.println("books kelimesi geciyor :"+sayfaBasligi);
        }else{
            System.out.println("books kelimesi gecmiyor:"+sayfaBasligi);
        }

        driver.quit();




    }
}
