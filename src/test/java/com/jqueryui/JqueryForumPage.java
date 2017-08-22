package com.jqueryui;

import org.common.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class JqueryForumPage extends Utility{
	By forumPageTitle=By.xpath("//a[text()='jQuery Forum']");
	
	
	public void verifyForumPage(){
		Assert.assertEquals(getElementText(forumPageTitle), "JQUERY FORUM");
	}

}
