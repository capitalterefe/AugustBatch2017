package com.gcrShop;

import org.common.Utility;
import org.openqa.selenium.By;


public class MyAccountInformationMainPage extends Utility{
	By ViewChangeaccountInformationLink=By.xpath("//a[text()='View or change my account information.']");



	public void ChangeaccountInformation(){
		 clickOn(ViewChangeaccountInformationLink);
		
	}
}
