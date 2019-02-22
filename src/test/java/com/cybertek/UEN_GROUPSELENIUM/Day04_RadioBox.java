package com.cybertek.UEN_GROUPSELENIUM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_RadioBox{

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver  mydriver = new ChromeDriver();

        mydriver.navigate().to("https://www.facebook.com/");

        Thread.sleep(1000);
        mydriver.manage().window().maximize();



        WebElement myElement = mydriver.findElement(By.xpath(".//input[@id='u_0_9']"));
        myElement.click();
        WebElement myElement2 = mydriver.findElement(By.xpath("//input[@id='u_0_a']"));
        myElement2.click();

        // check box



    }


}
