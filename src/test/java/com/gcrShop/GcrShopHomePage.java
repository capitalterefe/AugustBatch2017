package com.gcrShop;

import org.common.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GcrShopHomePage extends Utility {
By logOffButton=By.xpath("//span[text()='Log Off']");

public void verifyHomePage(){
	Assert.assertEquals(getElementText(logOffButton), "Log Off");
	
	
	
}


}
