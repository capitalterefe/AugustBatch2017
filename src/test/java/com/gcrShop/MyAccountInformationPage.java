package com.gcrShop;

import org.common.Utility;
import org.openqa.selenium.By;

public class MyAccountInformationPage extends Utility {

	By gender = By.xpath("//input[@name='gender'][1]");
	By firstName = By.xpath("//input[@name='firstname']");
	By lastName = By.xpath("//input[@name='lastname']");

	By dateOfBirth = By.xpath("//input[@id='dob']");
	By emailAdress = By.xpath("//input[@name='email_address']");
	By companyName = By.xpath("//input[@name='company']");

	By streetAddress = By.xpath("//input[@name='street_address']");
	By postcode = By.xpath("//input[@name='postcode']");
	By city = By.xpath("//input[@name='city']");

	By state = By.xpath("//input[@name='state']");
	By country = By.xpath("//select[@name='country']");
	By telephone = By.xpath("//input[@name='telephone']");

	By fax = By.xpath("//input[@name='fax']");
	By newsletter = By.xpath("//input[@name='newsletter']");
	By password = By.xpath("//input[@name='password']");
	By passwordConfirmation = By.xpath("//input[@name='confirmation']");
	By continue1 = By.xpath("//span[text()='Continue']");

	public void Registration() {
		clickOn(gender);
		typeInto(firstName, "Million");
		typeInto(lastName, "Selenium");
		typeInto(dateOfBirth, "12/12/2012");
		typeInto(emailAdress, "Selenium2012@gmail.com");
		typeInto(companyName, "HagereNafakegn plc");

		typeInto(streetAddress, "999 New fox street");
		typeInto(postcode, "20904");
		typeInto(city, "Silver spring");
		typeInto(state, "Maryland");
		selectDropDownByVisibleTxt(country, "United States");
		

		typeInto(telephone, "222-222-2223");
		typeInto(fax, "333-333-3332");
		clickOn(newsletter);
		typeInto(password, "Password@@");
		typeInto(passwordConfirmation, "Password@@");
		clickOn(continue1);
	}
}

