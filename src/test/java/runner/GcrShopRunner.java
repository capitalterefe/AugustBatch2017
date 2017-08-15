package runner;

import org.common.Utility;
import org.testng.annotations.Test;

import com.gcrShop.GcrShopHomePage;
import com.gcrShop.GcrShopLandingPage;

public class GcrShopRunner extends Utility{
	
	GcrShopLandingPage gcrShopLandingPage=new GcrShopLandingPage();
	GcrShopHomePage gcrShopHomePage=new GcrShopHomePage();
	
	@Test
	public void signInTest(){
		gcrShopLandingPage.signIn();
		gcrShopHomePage.verifyHomePage();
	}

}
