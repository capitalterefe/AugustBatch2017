package com.gcrShop;

import org.common.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;


public class GcrShopHomePage extends Utility {
By logOffButton=By.xpath("//span[text()='Log Off']");
By myAccounButton=By.xpath("//a[@id='tdb3']/span[2]");



public void verifyHomePage(){
	Assert.assertEquals(getElementText(logOffButton), "Log Off");
	
	
	
}

public void OpenMyAccountInformationpage(){ 
	clickOn(myAccounButton);
}
}
