package com.internetHerokuApp;

import org.common.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class JavaScriptAlertsPage extends Utility{
 
	By javascriptAlertPageHeading=By.xpath("//h3[text()='JavaScript Alerts']");
	By clickForJsAlertElement=By.xpath("//button[text()='Click for JS Alert']");
	By clickForJsConfirmElement=By.xpath("//button[text()='Click for JS Confirm']");
	By clickForJsPromptElement=By.xpath("//button[text()='Click for JS Prompt']");
	By jsAlertResultText=By.xpath("//p[text()='You successfuly clicked an alert']");
	By jsConfirmCancelResultText=By.xpath("//p[text()='You clicked: Cancel']");
	
	public void verifyJsAlertPage(){
		Assert.assertEquals( getElementText(javascriptAlertPageHeading),"JavaScript Alerts");
	}
	
	public void clickOnJsAlert(){
		clickOn(clickForJsAlertElement);
	}
	public void clickOnJsConfirm(){
		clickOn(clickForJsConfirmElement);
	}
	
	public void handlAlertPopUp(){
		handlePopupTypeAndOk();
		Assert.assertEquals(getElementText(jsAlertResultText), "You successfuly clicked an alert");
	}
	public void cancelJsConfirm(){
		handlePopupHitCancel();
		Assert.assertEquals(getElementText(jsConfirmCancelResultText), "You clicked: Cancel");
	}
	
	
	
}
