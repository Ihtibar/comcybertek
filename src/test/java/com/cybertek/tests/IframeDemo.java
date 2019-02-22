package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeDemo {


    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tinymce");

        //locatte the iframe
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
       //switch to iframe

        driver.switchTo().frame(iframe);

        driver.findElement(By.tagName("body")).sendKeys("ddeee dddedd dd");

        driver.switchTo().parentFrame();


        //Elemental selenium
        driver.findElement(By.linkText("Elemental selenium")).click();

    }
}
