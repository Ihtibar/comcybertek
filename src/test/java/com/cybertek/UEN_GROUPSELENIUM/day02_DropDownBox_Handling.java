package com.cybertek.UEN_GROUPSELENIUM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day02_DropDownBox_Handling {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();   // maximize the browzer window

        driver.get("https://www.facebook.com/");


        WebElement myMonthElement = driver.findElement(By.xpath("//select[@id='month']"));
        WebElement myDayElement = driver.findElement(By.xpath("//select[@id='day']"));
        WebElement myYearElemnt = driver.findElement(By.xpath("//select[@id='year']"));

        Select monthselect = new Select(myMonthElement);

        // select by index num:   sometime index num position might get change
        //	monthselect.selectByIndex(5);   //  May

        // select by value: it could change over times , not very secure either
        //	monthselect.selectByValue("5");   // May

        // Select by visible text: most secure one!!!!!!   (Stick with this one!!)
        Thread.sleep(3000);
        monthselect.selectByVisibleText("May");    //May

        Select Dayselect = new Select(myDayElement);
        Thread.sleep(3000);
        Dayselect.selectByVisibleText("19");


        Select YearSelect = new Select(myYearElemnt);
        Thread.sleep(3000);
        YearSelect.selectByVisibleText("1999");


        Thread.sleep(5000);
        driver.quit();


    }

}







