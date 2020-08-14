package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TittleUrlTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://youtube.com");
        String youtubeTittle=driver.getTitle();
       if (youtubeTittle.toLowerCase().contains("video")){
           System.out.println("Video kelimesini iceriyor:"+youtubeTittle);
       }else{
           System.out.println("Video kelimesini icermiyor:"+youtubeTittle);
       }
        driver.navigate().to("http://facebook.com");
       driver.navigate().refresh();
       driver.navigate().back();
       driver.navigate().to("http://apple.com");


        driver.quit();

    }
}
