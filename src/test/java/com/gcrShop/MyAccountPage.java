package com.gcrShop;

import org.common.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;


public class MyAccountPage extends Utility{
	By ViewChangeaccountInformationLink=By.xpath("//a[text()='View or change my account information.']");
	By successfullyUpdated=By.xpath("//div[@id='bodyContent']/table/tbody/tr/td");



	public void viewOrChangeMyAccountInformation(){
		 clickOn(ViewChangeaccountInformationLink);
		
	}
	
	
	
	public void changeMyAccountAndInformation(){
		sleep(5000);
		Assert.assertEquals(" Your account has been successfully updated.",getElementText(successfullyUpdated));
	}

}
