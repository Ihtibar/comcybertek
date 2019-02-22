package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Days {

    @Test
    public void daysTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        int fridayCount = 0;

        while (fridayCount < 3) {

            Random randomObject = new Random(); // class used to created random stuff
            int random = randomObject.nextInt(8);  // nextInt  actually creates a random number

            switch (random) {
                case 1:
                    // locate monday
                    WebElement monday = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
                    // click on monday
                    monday.click();
                    // print name
                    System.out.println("Monday");
                    // click again to unselect
                    monday.click();
                    Thread.sleep(500);
                    break;
                case 2:
                    // click on tue
                    WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
                    tuesday.click();
                    System.out.println("Tuesday");
                    tuesday.click();
                    Thread.sleep(500);
                    break;
                case 3:
                    // click on we
                    WebElement wednesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Wednesday-input"));
                    wednesday.click();
                    System.out.println("Wednesday");
                    wednesday.click();
                    Thread.sleep(500);
                    break;
                case 4:
                    // click on thu
                    WebElement thursday = driver.findElement(By.id("gwt-debug-cwCheckBox-Thursday-input"));
                    thursday.click();
                    System.out.println("Thursday");
                    thursday.click();
                    Thread.sleep(500);
                    break;
                case 5:
                    // click on fri
                    // increase count
                    WebElement friday = driver.findElement(By.id("gwt-debug-cwCheckBox-Friday-input"));
                    friday.click();
                    System.out.println("Friday");
                    friday.click();
                    fridayCount++;
                    Thread.sleep(500);
                    break;

                case 6:
                    // click on sat
                    // click on fri
                    // increase count
                    WebElement saturday = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
                    saturday.click();
                    System.out.println("Saturday ");
                    saturday.click();
                    Thread.sleep(500);
                    break;
                case 7:
                    // click on sun
                    // click on fri
                    // increase count
                    WebElement sunday = driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
                    sunday.click();
                    System.out.println("Sunday");
                    sunday.click();
                    Thread.sleep(500);
                    break;


            }
        }


        driver.quit();

    } // CTRL+ALT+L
} /// CMD+OPTION+L
