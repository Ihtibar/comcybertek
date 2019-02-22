package com.cybertek.UEN_GROUPSELENIUM.POM_Etsy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webUtility {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.quit();
		
	}
	
}