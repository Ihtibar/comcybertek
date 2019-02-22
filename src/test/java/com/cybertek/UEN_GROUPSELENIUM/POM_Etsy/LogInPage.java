package com.cybertek.UEN_GROUPSELENIUM.POM_Etsy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

//  World Preess Website
public class LogInPage extends webUtility{

	@FindBy (id="user_login")
	WebElement usernamebox;
	
			@FindBy (id="user_pass")
			WebElement PassWordBox;
	
					@FindBy (id ="wp-submit")
					WebElement LogInButton;
	
	public void LogInProcess(String username, String password) {
		usernamebox.sendKeys(username);    
		PassWordBox.sendKeys(password);
		        LogInButton.click();	
	}
	public static void pf() {
		driver.get("http://demosite.center/wordpress/wp-login.php");
		LogInPage mylogin = PageFactory.initElements(driver, LogInPage.class);
			mylogin.LogInProcess("admin", "12345");
	}
}