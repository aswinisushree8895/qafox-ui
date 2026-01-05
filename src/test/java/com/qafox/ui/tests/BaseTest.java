package com.qafox.ui.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.util.concurrent.Uninterruptibles;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeTest
	public void setup() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
        option.addArguments("--start-maximized");
		driver=new ChromeDriver(option);
		driver.get("https://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void teardown() {
		Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
		driver.quit();
	}

}
