package com.cybertek.UEN_GROUPSELENIUM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Day01_firstProjects {


    public static void main(String[] args) {

        // Searching ChroPath from google

        WebDriverManager.chromedriver().setup();    // it will automatically set up the driver environemnt

        WebDriver mydriver= new ChromeDriver();

        // two ways to get access to website:
        // 1.   get(): variablename.get(Address)     .     get method will directly access to web without wwaiting or loading

        //	mydriver.get("https://www.google.com/");

        // 2.   navigate(). :   variablename.nevigate().to(Address).     nevigate method will wait and load then access to the web
        mydriver.navigate().to("https://www.google.com/");

        // findelemnt():     variablename.findelemt( )              it will return any elemnt's position  as Webelemnt.
        String searchboxXpath="//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input";
        String keywords ="chropath for google chrome" ;

        mydriver.findElement(By.xpath(searchboxXpath)).sendKeys(keywords+ Keys.ENTER);     // in order to use the "Enter" from the keyboard	we need  Keys.Enter

        String ChropathWebXpath = "//*[@id='rso']/div[1]/div/div/div/div[1]/a/h3 ";

        mydriver.findElement(By.xpath(ChropathWebXpath)).click();


        // getTitle() :    variablename.getTitle() ==> retuns as String   .    this method will give us the title of the page.

        // Verifying The tile of the page
        String titleOfThePage = mydriver.getTitle();
        Assert.assertTrue( titleOfThePage.contains("Chrome Web Store") );

        System.out.println(titleOfThePage);

        try{
            Thread.sleep(5000);              // thread.sleep will make the system to wait a for specific time
        } catch(Exception e) {
            e.getStackTrace();
        }

        mydriver.quit();



    }




}
