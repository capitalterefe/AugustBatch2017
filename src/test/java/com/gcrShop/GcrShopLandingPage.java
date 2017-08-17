package com.gcrShop;

import org.common.Utility;
import org.openqa.selenium.By;

public class GcrShopLandingPage extends Utility {
	By emailAddress = By.xpath("//input[@name='email_address']");
	By password = By.xpath("//input[@name='password']");
	By signInButton = By.xpath("//span[text()='Sign In']");
	By continueButton = By.xpath("//a[@id='tdb4']");

	public void signIn() {
		driver.get(config.getBaseUrl());
		typeInto(emailAddress, "capital.terefe@gmail.com");
		typeInto(password, "selenium2017");
		clickOn(signInButton);

	}

	public void continueToRegistrationPage() {
		driver.get(config.getBaseUrl());
		clickOn(continueButton);
	}

}
