package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice extends HelpMe {




    @Test
    public void amazonHomePageDropDown() throws InterruptedException{

        driver.get("https://www.amazon.com/");

        WebElement dropDownWebElement = driver.findElement(By.id("searchDropdownBox"));

        Select homePageDropdown = new Select(dropDownWebElement);


        homePageDropdown.selectByIndex(5);
        Thread.sleep(3000);

        List<WebElement> dropDown =driver.findElements(By.id("searchDropdownBox"));

        for (int i = 0 ; i <dropDown.size(); i++) {

            homePageDropdown.selectByIndex(i);

            System.out.println(dropDown.get(i).getText());


            Thread.sleep(2000);
        }
    }


    }
