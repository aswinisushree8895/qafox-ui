package com.qafox.ui.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qafox.ui.pages.HomePage;

public class HomePageTests extends BaseTest{
	HomePage homePage;
	@BeforeClass
	public void init() {
		homePage=new HomePage(driver);
	}

	@Test
	public void TC001() {
		System.out.println("welcome to test");
		homePage.getCatagoryNavigationBar().clickOnTabletsLink();
	}
}
