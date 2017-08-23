package runner;

import org.common.Utility;
import org.testng.annotations.Test;

import com.internetHerokuApp.InternetHerokuAppLandingPage;
import com.internetHerokuApp.JavaScriptAlertsPage;

public class InternetHerokuAppRunner extends Utility {
	InternetHerokuAppLandingPage internetHerokuAppLandingPage=new InternetHerokuAppLandingPage();
	JavaScriptAlertsPage javaScriptAlertsPage=new JavaScriptAlertsPage();
	
	
	@Test
	public void handlingJsAlertTest(){
		internetHerokuAppLandingPage.verifyLandingPage();
		internetHerokuAppLandingPage.navigateToJavaScriptAlertPage();
		javaScriptAlertsPage.verifyJsAlertPage();
		javaScriptAlertsPage.clickOnJsAlert();
		javaScriptAlertsPage.handlAlertPopUp();
	}
	
	@Test 
	public void handleJsconfirmTest(){
		internetHerokuAppLandingPage.verifyLandingPage();
		internetHerokuAppLandingPage.navigateToJavaScriptAlertPage();
		javaScriptAlertsPage.verifyJsAlertPage();
		javaScriptAlertsPage.clickOnJsConfirm();
		javaScriptAlertsPage.cancelJsConfirm();
	}
	
}
