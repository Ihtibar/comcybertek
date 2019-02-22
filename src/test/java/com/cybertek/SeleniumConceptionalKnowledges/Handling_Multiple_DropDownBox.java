package com.cybertek.SeleniumConceptionalKnowledges;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Handling_Multiple_DropDownBox {
    // how to handle multiple dropdown box
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //=====================================================================
        //	WebElement monthbox = driver.findElement(By.xpath(".//*[@id='month']"));
        //	Select monthselect=new Select(monthbox);    // select will allow us to select from drop down box
        //  monthselect.selectByIndex(6);
        //	monthselect.selectByVisibleText("Sep");
        //
        // 	monthselect.selectByValue("8");
        //=======================================

        List<WebElement> dropboxes = driver.findElements(By.tagName("select"));

        for(int i=0; i<dropboxes.size(); i++) {
            Select boxes =new Select(dropboxes.get(i));
            String nameofele = dropboxes.get(i).getAttribute("name");

            if(nameofele.equals("birthday_month"))
                boxes.selectByVisibleText("May");

            if(nameofele.equals("birthday_day"))
                boxes.selectByValue("19");

            if(nameofele.equals("birthday_year"))
                boxes.selectByVisibleText("1995");
        }
        //web elemeny
        // select => web elemeny
        // eather select index, visibletext, or by vlue

        // how to refresh
        driver.navigate().refresh();
        // how to go back
        driver.navigate().back();
        //    How to go forward:
               driver.navigate().forward();

    }
}
