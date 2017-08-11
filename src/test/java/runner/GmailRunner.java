package runner;

import org.common.Utility;
import org.testng.annotations.Test;

import com.google.GmailApp;

public class GmailRunner extends Utility {
	GmailApp gmailApp = new GmailApp();

	@Test
	public void testRegistration() {
		gmailApp.searchForKeyword();
	}
}
