package com.gcrShop;

import org.common.Utility;
import org.openqa.selenium.By;

public class EditAccountPage extends Utility{
	By gender= By.xpath("//input[@name='gender'][1]");
	By firstName= By.xpath("//input[@name='firstname']");
	By lastName= By.xpath("//input[@name='lastname']");
	
	By continueBttn= By.xpath("//span[text()='Continue']");
	
	public void EditMyAccount(){
		clickOn(gender);	
	 typeInto(firstName,"Tilhaun");
	 typeInto(lastName,"Gesesse");
	 clickOn(continueBttn);	
	}	
}
