package com.qafox.ui.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatagoryNavigationBar extends BasePage{
	
	
	public CatagoryNavigationBar(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Tablets")
	private WebElement tablets;
	
	@FindBy
	private WebElement software;
	
	public void clickOnTabletsLink() {
		this.tablets.click();
	}
	
	public void clickOnSoftwareLink() {
		this.software.click();
	}

}
