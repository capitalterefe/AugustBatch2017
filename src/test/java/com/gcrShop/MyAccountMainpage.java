package com.gcrShop;

import org.common.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MyAccountMainpage extends Utility{
	By successfullyUpdated=By.xpath("//div[@id='bodyContent']/table/tbody/tr/td");
	
	
public void changeMyAccountAndInformation(){
	sleep(5000);
	Assert.assertEquals(" Your account has been successfully updated.",getElementText(successfullyUpdated));
}


}
