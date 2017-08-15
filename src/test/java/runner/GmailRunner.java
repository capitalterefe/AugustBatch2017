package runner;

import org.common.Utility;
import org.testng.annotations.Test;

import com.google.GoogleLandingPage;

public class GmailRunner extends Utility {
	GoogleLandingPage gmailApp = new GoogleLandingPage();

	@Test
	public void testRegistration() {
		gmailApp.clickGmailLinkText();
	}
}
