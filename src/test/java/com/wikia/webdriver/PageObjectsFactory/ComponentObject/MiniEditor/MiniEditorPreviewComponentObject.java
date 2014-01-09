package com.wikia.webdriver.PageObjectsFactory.ComponentObject.MiniEditor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wikia.webdriver.Common.Core.Assertion;
import com.wikia.webdriver.Common.Logging.PageObjectLogging;
import com.wikia.webdriver.PageObjectsFactory.PageObject.WikiBasePageObject;

public class MiniEditorPreviewComponentObject extends WikiBasePageObject {

	public MiniEditorPreviewComponentObject(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="#WallPreviewModal")
	private WebElement previewModal;

	By publishButton = By.cssSelector(".buttons .primary");
	By contentWrapper = By.cssSelector("#mw-content-text");

	public void verifyTextContent(String desiredText) {
		Assertion.assertEquals(desiredText, previewModal.findElement(contentWrapper).getText());
	}

	public void publish() {
		previewModal.findElement(publishButton).click();
		PageObjectLogging.log("publish", "publish button clicked", true);
	}

}