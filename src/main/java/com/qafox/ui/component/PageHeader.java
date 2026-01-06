package com.qafox.ui.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHeader extends BasePage{

	public PageHeader(WebDriver driver) {
		super(driver);
	}
	
	@FindBy()
	private WebElement searchBox;
	
	@FindBy()
	private WebElement searchBtn;
	
	@FindBy()
	private WebElement logoImg;
	
	public void enterTextInSearch(String item) {
		this.searchBox.sendKeys(item);
	}
	
	public void clickOnSearchButton() {
		this.searchBtn.click();
	}
	
	public String getDomainText() {
		return this.logoImg.getText();
	}

}
