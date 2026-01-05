package com.qafox.ui.pages;

import org.openqa.selenium.WebDriver;

import com.qafox.ui.component.CatagoryNavigationBar;
import com.qafox.ui.component.PageFooter;
import com.qafox.ui.component.PageHeader;

public class HomePage {
	private WebDriver driver;
	private PageHeader pageHeader;
	private CatagoryNavigationBar catagoryNavigationBar;
	private PageFooter pageFooter;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		pageHeader=new PageHeader(driver);
		pageFooter=new PageFooter(driver);
		catagoryNavigationBar=new CatagoryNavigationBar(driver);		
	}
	public PageHeader getPageHeader() {
		return pageHeader;
	}
	public CatagoryNavigationBar getCatagoryNavigationBar() {
		return catagoryNavigationBar;
	}
	public PageFooter getPageFooter() {
		return pageFooter;
	}
	
	
	
	

}
