package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();



        driver.get("http://Faceebook.com");

        WebElement signInBox=driver.findElement(By.name("email"));
        signInBox.sendKeys("kurtmahir48@gmail.com");

        WebElement passwordBox=driver.findElement(By.name("pass"));
        passwordBox.sendKeys("258456e.!");//tabikide yanlis sifer :))

        WebElement loginBox=driver.findElement(By.name("login"));
        loginBox.click();

        String url=driver.getCurrentUrl();
        System.out.println(url);
        if (url.contains("http://Faceebook.com/login/")){
            System.out.println("Giris basarili");
        }else {
            System.out.println("Giris basarisiz");
        }

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


      driver.quit();






    }
}
