package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Etsypractice {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.etsy.com");
        driver.findElement(By.id("search-query")).sendKeys("Hats" + Keys.ENTER);
        Thread.sleep(3000);

        WebElement FreeShipping  = driver.findElement(By.xpath("//a[contains(text(),'Free shipping')]"));
        FreeShipping.click();

        WebElement HolidayEaster  = driver.findElement(By.xpath("//a[contains(text(),'Easter')]"));
        HolidayEaster.click();

        WebElement ColorBlack  = driver.findElement(By.xpath("//a[contains(text(),'Black')]"));
        ColorBlack.click();
        WebElement ShopLocation  = driver.findElement(By.xpath("//a[contains(text(),'United States')]"));
        ShopLocation.click();

        WebElement HandMade  = driver.findElement(By.xpath("//a[contains(text(),'Handmade')]"));
        HandMade.click();
        WebElement Price  = driver.findElement(By.xpath("//a[contains(text(),'$25 to $50')] "));
        Price.click();
        WebElement OrderingOption  = driver.findElement(By.xpath("//a[contains(text(),'Accepts Etsy gift cards')]"));
        OrderingOption.click();
        WebElement myShiptoBox = driver.findElement(By.xpath("//select[@id='ship_to_select']"));
        Select CountrySelect = new Select(myShiptoBox);
        CountrySelect.selectByVisibleText("Afghanistan");

        WebElement picture = driver.findElement(By.xpath("//img[contains(@class,'no-bottom-radius')]"));
        picture.click();
        driver.quit();

        WebDriver mydriver= new ChromeDriver();
        mydriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        mydriver.get("https://www.etsy.com/listing/188297541/space-bunny-hat?ga_order=most_relevant&ga_search_type=handmade&ga_view_type=gallery&ga_search_query=hats&ref=sr_gallery-1-1&organic_search_click=1&frs=1&col=1");

        Assert.assertTrue(mydriver.getTitle().contains("Space Bunny Hat"));



        WebElement SelectAnOption = mydriver.findElement(By.xpath("//*[@id=\"inventory-variation-select-0\"]"));
        Select inchSize = new Select(SelectAnOption);
        inchSize.selectByIndex(10);
        Thread.sleep(2000);

        WebElement PrimaryColor = mydriver.findElement(By.xpath("//*[@id='inventory-variation-select-1']"));
        Select colorSelected = new Select(PrimaryColor);
        colorSelected.selectByIndex(1);
        Thread.sleep(2000);

        WebElement Quantity = mydriver.findElement(By.xpath("//*[@id='inventory-variation-select-quantity']"));
        Select QuantitySelected = new Select(Quantity);
        QuantitySelected.selectByVisibleText("2");          Thread.sleep(2000);

        WebElement AddToCart = mydriver.findElement(By.xpath("//div[@class='btn-text']"));
        AddToCart.click();


      //  Assert.assertTrue(mydriver.getTitle().contains("Shopping Cart"));


        WebElement Remove = mydriver.findElement(By.xpath("//a[contains(text(),'Remove')]"));
            Remove.click();

        WebElement message = mydriver.findElement(By.xpath("//h2[contains(text(),'Your cart is empty.')]"));

        System.out.println( message.getText() );










        // WebElement[] myarr={FreeShipping , HolidayEaster, ColorBlack, ShopLocation };





    }
}
