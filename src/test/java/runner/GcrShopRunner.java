package runner;

import org.common.Utility;
import org.testng.annotations.Test;


import com.gcrShop.GcrShopHomePage;
import com.gcrShop.GcrShopLandingPage;
import com.gcrShop.MyAccountPage;
import com.gcrShop.MyAccountInformationPage;
import com.gcrShop.EditAccountPage;

public class GcrShopRunner extends Utility{
	
	GcrShopLandingPage gcrShopLandingPage=new GcrShopLandingPage();
	GcrShopHomePage gcrShopHomePage=new GcrShopHomePage();
	MyAccountInformationPage myAccountInformationPage=new MyAccountInformationPage();
	MyAccountPage myAccountPage=new MyAccountPage();
	EditAccountPage editAccountPage = new EditAccountPage();
	
	
	@Test
	public void signInTest() throws Exception{
		gcrShopLandingPage.signIn();
		gcrShopHomePage.verifyHomePage();
	}
	
	@Test
	public void viewOrChangeMyAccountInformation() {
		gcrShopLandingPage.signIn();
		gcrShopHomePage.verifyHomePage();
		gcrShopHomePage.OpenMyAccountInformationpage();
		myAccountPage.viewOrChangeMyAccountInformation();
		editAccountPage.EditMyAccount();
		myAccountPage.changeMyAccountAndInformation();
	}
	//@Test
	public void vegistrationTest(){
		gcrShopLandingPage.continueToRegistrationPage();
	}
}
