package com.cybertek.tests;


import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.cybertek.tests.HelpMe.driver;

   public class EtsyWithSoftAssert extends TestBase {
        // for FORMAT we use Ctrl+ Alt+L keyboard


        @Test
        public void test() {
            driver.get("https://etsy.com");
            driver.findElement(By.id("search-query")).sendKeys("gift" + Keys.ENTER);
            softAssert.assertTrue(driver.getTitle().contains("gift"), "title did not match");
            Assert.assertTrue(driver.getTitle().contains("AAA"));
        }
    }





