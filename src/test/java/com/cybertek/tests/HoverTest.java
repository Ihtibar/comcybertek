package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends TestBase {

    @Test
    public void test1(){
        driver.get("https://www.amazon.com/");
        WebElement signIn = driver.findElement(By.xpath("//span[.=‘Hello. Sign in’]"));

        actions.moveToElement(signIn).perform();

        Assert.assertTrue(driver.getTitle().contains("Intersting"));

    }
    @Test
    public void test2(){
        driver.get("\"https://www.amazon.com/\"");
        WebElement help = driver.findElement(By.xpath("//a[.='Help'])[2]"));
        actions.moveToElement(help).perform();
    }
}
