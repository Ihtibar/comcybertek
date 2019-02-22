package com.cybertek.UEN_GROUPSELENIUM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05_Checkbox {
    public static void main(String[] args) {


        WebDriverManager .chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/c/jewelry_and_accessories?explicit=1&free_shipping=true");

        WebElement FreeShipping = driver.findElement(By.xpath("//*[@id=\"search-filter-reset-form\"]/div[3]/fieldset/div/label/a"));
        FreeShipping.click();

        WebElement OnedayElement = driver.findElement(By.xpath("//*[@id=\"search-filter-reset-form\"]/div[3]/fieldset/div/div/label[1]/a"));
        OnedayElement.click();

        WebElement TreedayEmement = driver.findElement(By.xpath("//*[@id=\"search-filter-reset-form\"]/div[3]/fieldset/div/div/label[2]/a"));
        TreedayEmement.click();
    }
}
