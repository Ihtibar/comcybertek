package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ScrollTest extends TestBase {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.youtube.com/");

        Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_UP ).perform();
        Thread.sleep(5000);


        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }
}
