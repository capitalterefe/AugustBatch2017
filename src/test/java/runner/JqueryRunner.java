package runner;

import org.common.Utility;
import org.testng.annotations.Test;

import com.jqueryui.JqueryForumPage;
import com.jqueryui.JqueryUiDroppablePage;
import com.jqueryui.JqueryUiLandingPage;

public class JqueryRunner extends Utility{
	JqueryUiLandingPage jqueryUiLandingPage =new JqueryUiLandingPage();
	JqueryUiDroppablePage jqueryUiDroppablePage=new JqueryUiDroppablePage();
	JqueryForumPage jqueryForumPage=new JqueryForumPage();
	
	
	@Test
	public void dragAndDropTest(){
		jqueryUiLandingPage.openJqueryUiPage();
		jqueryUiLandingPage.navigateToDroppablePage();
		jqueryUiDroppablePage.verifyDroppablePage();
		jqueryUiDroppablePage.dragAndDrop();
		jqueryUiDroppablePage.verifyDragAndDrop();
		
		
	}
	
	@Test
	public void mouseOverTest(){
		jqueryUiLandingPage.openJqueryUiPage();
		jqueryUiLandingPage.navigateToForumPage();
		jqueryForumPage.verifyForumPage();
	}
	
}
