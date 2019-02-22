package com.cybertek.UEN_GROUPSELENIUM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class bootstraps_handling {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver mydriver = new ChromeDriver();

        mydriver.get("https://www.bankrate.com/");

        Thread.sleep(3000);

        mydriver.manage().window();
        Thread.sleep(3000);

        List<WebElement> myList = mydriver.findElements(By.xpath("//ul[contains(@class,'global-navigation__horizontal-nav')]//li[1]//div[1]//div[1]//div//div[1]/ul/li"));
        System.out.println(myList.size());

       // mydriver.quit();


        for (int i = 0; i<myList.size(); i++){
            WebElement myele = myList.get(i);




        }


    }
}
