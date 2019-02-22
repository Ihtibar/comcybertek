package com.cybertek.tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {




 /*   open browser
goto amazon
    eneter search term and submit

    verify search box still contains the same search term
*/

    public static void main(String[] args) {

        System.setProperty("sdsd","dgf");

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("charger" + Keys.ENTER);

       String searchterm = "charger";

        String actual = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");

       if(searchterm.equals(actual)){
           System.out.println("PASS");
       }else{

           System.out.println("FAIL");
           System.out.println("actual " + actual);
           System.out.println("expected " + searchterm);


       }
    }





}
