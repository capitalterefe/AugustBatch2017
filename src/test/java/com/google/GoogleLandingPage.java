package com.google;

import org.common.Utility;
import org.openqa.selenium.By;

public class GoogleLandingPage extends Utility{
 By searchInputBox=By.xpath("//input[@name='q']");
 By gmailLink=By.xpath("//a[text()='Gmail']");

public void searchForKeyword() {
	explicitWait(driver.findElement(searchInputBox));
	typeInto(searchInputBox, "Caroline");
}

public void clickGmailLinkText(){
	clickOn(gmailLink);
}

 
 
}
