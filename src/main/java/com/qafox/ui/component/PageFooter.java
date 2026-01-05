package com.qafox.ui.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFooter extends BasePage {
	
	public PageFooter(WebDriver driver){
		super(driver);
	}
	
	@FindBy()
	private WebElement footerLink;
	
	public void clickonFooterLink() {
		this.footerLink.click();
	}

}
