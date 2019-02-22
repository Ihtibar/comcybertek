package com.cybertek.UEN_GROUPSELENIUM.POM_Etsy;

import org.testng.annotations.Test;

public class MainTest extends webUtility{
	
	@Test
	public void TestingLogIn()  {
		LogInPage.pf();
	}
	

}