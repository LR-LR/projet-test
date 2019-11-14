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

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void connexionBrowser(String browser, String url) {

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
