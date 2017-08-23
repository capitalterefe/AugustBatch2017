package com.internetHerokuApp;

import org.common.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class InternetHerokuAppLandingPage extends Utility{
	By landingPageHeading=By.xpath("//h1[text()='Welcome to the-internet']");
	By javaScriptAlertsLink=By.xpath("//a[text()='JavaScript Alerts']");
	
	
	public void verifyLandingPage(){
		driver.get(config.getBaseUrl());
		Assert.assertEquals(getElementText(landingPageHeading), "Welcome to the-internet");
	}
	
	public void navigateToJavaScriptAlertPage(){
		clickOn(javaScriptAlertsLink);
	}
	
	
}
