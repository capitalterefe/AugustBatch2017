package com.jqueryui;

import org.common.Utility;
import org.openqa.selenium.By;

public class JqueryUiLandingPage extends Utility {
	By droppableLink = By.xpath("//a[text()='Droppable']");
	By supportLink = By.xpath("(//a[text()='Support'])[1]");
	By forumLink = By.xpath("//a[text()='Forums']");
	
	
	public void openJqueryUiPage(){
		driver.get(config.getBaseUrl());
		
	}
	
	public void navigateToDroppablePage(){
		clickOn(droppableLink);
	}
	
	public void navigateToForumPage(){
		moveMouseAndClick(supportLink, forumLink);
	}
}
