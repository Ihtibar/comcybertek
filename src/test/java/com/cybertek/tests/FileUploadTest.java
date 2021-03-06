package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {
    //go to https://the-internet.herokuapp.com/upload
    //go to https://the-internet.herokuapp.com/upload
    //upload file
    //click upload
    //verify text uploaded
    @Test
    public void test(){
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        String path = "/Users/ihtibaryasen/Downloads/test.txt";
        chooseFile.sendKeys(path);

        driver.findElement(By.id("file-submit")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//*[.='File Uploaded!']")).isDisplayed());


    }



}
