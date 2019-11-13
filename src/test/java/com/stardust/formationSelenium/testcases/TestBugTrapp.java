package com.stardust.formationSelenium.testcases;

import java.util.concurrent.TimeUnit;

import com.stardust.formationSelenium.pages.Login;
import com.stardust.formationSelenium.pages.TopMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

/**
 * TestBugTrapp
 */
public class TestBugTrapp {
  public WebDriver driver;

  @BeforeClass
  public void connexionBrowser() {
    System.setProperty("webdriver.chrome.driver", "webdrivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://stgstg:@@@aaa111@bt-stg.stardust-hosting.com/");
    driver.manage().window().maximize();
  }

  @Test(priority = 1, description = "Connexion à BugTrapp")
  public void loginToBugTrapp() throws InterruptedException {
    Login loginBugTrapp = PageFactory.initElements(driver, Login.class);

    loginBugTrapp.username.sendKeys("stg.stardust.testing+445@gmail.com");
    loginBugTrapp.password.sendKeys("#Jur4ssi!cP4rk!");
    loginBugTrapp.submit.click();
    Thread.sleep(7000);
  }

  @Test(priority = 2, description = "Navigation Top Menu")
  public void navigation() throws InterruptedException {
    TopMenu topMenuBugTrapp = PageFactory.initElements(driver, TopMenu.class);

    topMenuBugTrapp.projects.click();
    Thread.sleep(1000);
    topMenuBugTrapp.allProjects.click();
    Thread.sleep(1000);
    topMenuBugTrapp.bugTracker.click();
    Thread.sleep(1000);
    topMenuBugTrapp.devices.click();
    Thread.sleep(1000);
    topMenuBugTrapp.allDevices.click();
    Thread.sleep(1000);
    topMenuBugTrapp.devices.click();
    Thread.sleep(1000);
    topMenuBugTrapp.allModels.click();
    Thread.sleep(1000);
    topMenuBugTrapp.devices.click();
    Thread.sleep(1000);
    topMenuBugTrapp.DeviceLists.click();
    Thread.sleep(1000);
    topMenuBugTrapp.users.click();
    Thread.sleep(7000);
  }

  @AfterClass
  public void browserQuit() {
    driver.quit();
  }
}
