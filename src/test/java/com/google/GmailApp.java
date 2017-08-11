package com.google;

import org.common.Utility;
import org.openqa.selenium.By;

public class GmailApp extends Utility{
 By searchInputBox=By.xpath("//input[@name='q']");

public void searchForKeyword() {
	explicitWait(driver.findElement(searchInputBox));
	  typeInto(searchInputBox, "Caroline");
}

 
 
}
