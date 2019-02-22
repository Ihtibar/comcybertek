package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestCasesTestNG {

    WebDriver driver;

    @BeforeClass

    public void setupDriver(){

        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod

    public void setUpTMethod(){


        driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().fullscreen();
    }

    @Test
    public void testOne(){

        driver.findElement(By.id("session_email")).sendKeys("kexesobepu@zsero.com");

        driver.findElement(By.id("session_password")).sendKeys("password" + Keys.ENTER);


        String actual = "kexesobepu@zsero.com";
        String expected = "kexesobepu@zsero.com";
        Assert.assertEquals(actual,expected);

    }

    @AfterMethod
    public void afterMethod(){

        System.out.println("logout");
        System.out.println("closing browser");
        driver.quit();

    }

    @AfterClass

    public void afterClass(){

        System.out.println("report everything");

    }


    @Test
    public void testTwo(){
        System.out.println("Testing testing testing: payment");

    }






//        @BeforeMethod
//
//        public void setup(){
//
//            WebDriverManager.chromedriver().setup();
//
//            WebDriver driver = new ChromeDriver();
//
//            driver.get("http://a.testaddressbook.com/sign_in");
//
//
//
//  //          driver.get("http://zero.webappsecurity.com/login.html");
////            driver.get(" https://amazon.com");
////            driver.get("https://the-internet.herokuapp.com/forgot_password");
////            driver.get("https://the-internet.herokuapp.com/");
//
//
//
//
//            driver.findElement(By.id("session_email")).sendKeys("kexesobepu@zsero.com");
//
//            driver.findElement(By.id("session_password")).sendKeys("password" + Keys.ENTER);
//
//
//
////            driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword"+ Keys.ENTER);
////            driver.findElement(By.linkText("Login")).click();
//
//
//
//        }
//
//
//      @Test
//    public void verifyDisplayedUserName(){
//
//
//            String actual = "kexesobepu@zsero.com";
//            String expected = "kexesobepu@zsero.com";
//            Assert.assertEquals(actual,expected);
//    }
//
//
//    @Test
//    public  void verfyTitle(){
//
//        //driver();
//
//            Assert.assertTrue(driver.getTitle().contains("ign"));
//
//

    }



