package runner;

import org.common.Utility;
import org.testng.annotations.Test;


import com.gcrShop.GcrShopHomePage;
import com.gcrShop.GcrShopLandingPage;
import com.gcrShop.MyAccountInformationMainPage;
import com.gcrShop.MyAccountInformationPage;
import com.gcrShop.MyAccountMainpage;
import com.gcrShop.MyAccountpage;

public class GcrShopRunner extends Utility{
	
	GcrShopLandingPage gcrShopLandingPage=new GcrShopLandingPage();
	GcrShopHomePage gcrShopHomePage=new GcrShopHomePage();
	MyAccountInformationPage myAccountInformationPage=new MyAccountInformationPage();
	MyAccountInformationMainPage myAccountInformationMainPage=new MyAccountInformationMainPage();
	MyAccountpage myAccountpage = new MyAccountpage();
	MyAccountMainpage myAccountMainpage=new MyAccountMainpage();
	
	
	//@Test
	public void signInTest() throws Exception{
		gcrShopLandingPage.signIn();
		gcrShopHomePage.verifyHomePage();
	}//
	
//	//@Test
//	public void reg(){
//		gcrShopLandingPage.Continue();
//	myAccountInformationPage.Registration();
//	}//
//	//@Test
//	public void OpenMyAccountInformationpageTest(){
//		gcrShopHomePage.OpenMyAccountInformationpage();
//	}//
	
	@Test
	
	public void MyAccountInformationMainPageTest() throws InterruptedException{
		gcrShopLandingPage.signIn();
		gcrShopHomePage.OpenMyAccountInformationpage();
	myAccountInformationMainPage.ChangeaccountInformation();
	myAccountpage.EditMyAccount();
	myAccountMainpage.changeMyAccountAndInformation();
	}
	}
	
	
	

