package com.jqueryui;

import org.common.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class JqueryUiDroppablePage extends Utility{
 By dragMeBoxElement=By.xpath("//div[@id='draggable']");
 By dropMeHereBoxElement=By.xpath("//div[@id='droppable']");
 By droppablePageHeading=By.xpath("//h1[text()='Droppable']");
 By demoFrame=By.xpath("//iframe[@class='demo-frame']");
 By droppedText=By.xpath("//div[@id='droppable']/p");
 
 
 public void verifyDroppablePage(){
	 Assert.assertEquals(getElementText(droppablePageHeading), "Droppable");
 }
 
 public void dragAndDrop(){
	 switchToFrame(demoFrame);
	 dragElement(dragMeBoxElement, dropMeHereBoxElement);
	 
 }
 public void verifyDragAndDrop(){
	 Assert.assertEquals(getElementText(droppedText), "Dropped!");
 }
}
