package com.stardust.formationSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

/**
 * Utility
 */
public class Utility {
	public WebDriver driver;

	static protected int PAUSE_TIME = 500;

	static protected String browser = "webdrivers\\chromedriver.exe";
	static protected String url = "https://stgstg:@@@aaa111@bt-stg.stardust-hosting.com/";
	static protected String login = "stg.stardust.testing+445@gmail.com";
	static protected String password = "#Jur4ssi!cP4rk";

	@BeforeClass
	public void connexionBrowser() {

		System.setProperty("webdriver.chrome.driver", browser);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		// driver.manage().window().maximize();
	}

	@AfterClass
	public void browserQuit() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
