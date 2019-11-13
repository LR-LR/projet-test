package com.stardust.formationSelenium.testcases;

import java.util.concurrent.TimeUnit;

import com.stardust.formationSelenium.pages.Login;
import com.stardust.formationSelenium.pages.Project;
import com.stardust.formationSelenium.pages.TopMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

/**
 * TestBugTrapp
 */
public class TestBugTrapp {
  public WebDriver driver;

  static private int PAUSE_TIME = 500;

  @BeforeClass
  public void connexionBrowser() {
    System.setProperty("webdriver.chrome.driver", "webdrivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://stgstg:@@@aaa111@bt-stg.stardust-hosting.com/");
    // driver.manage().window().maximize();
  }

  @Test(priority = 1, description = "Connexion à BugTrapp")
  public void loginToBugTrapp() throws InterruptedException {
    Login loginBugTrapp = PageFactory.initElements(driver, Login.class);

    loginBugTrapp.username.sendKeys("stg.stardust.testing+445@gmail.com");
    loginBugTrapp.password.sendKeys("#Jur4ssi!cP4rk!");
    loginBugTrapp.submit.click();
    Thread.sleep(2000);
  }

  @Test(priority = 2, description = "Navigation Top Menu")
  public void navigation() throws InterruptedException {
    TopMenu topMenuBugTrapp = PageFactory.initElements(driver, TopMenu.class);

    topMenuBugTrapp.projects.click();
    Thread.sleep(PAUSE_TIME);
    topMenuBugTrapp.allProjects.click();
    Thread.sleep(PAUSE_TIME);
    topMenuBugTrapp.bugTracker.click();
    Thread.sleep(PAUSE_TIME);
    topMenuBugTrapp.devices.click();
    Thread.sleep(PAUSE_TIME);
    topMenuBugTrapp.allDevices.click();
    Thread.sleep(PAUSE_TIME);
    topMenuBugTrapp.devices.click();
    Thread.sleep(PAUSE_TIME);
    topMenuBugTrapp.allModels.click();
    Thread.sleep(PAUSE_TIME);
    topMenuBugTrapp.devices.click();
    Thread.sleep(PAUSE_TIME);
    topMenuBugTrapp.DeviceLists.click();
    Thread.sleep(PAUSE_TIME);
    topMenuBugTrapp.users.click();
    Thread.sleep(5000);
  }

  @Test(priority = 3, description = "Create new project")
  public void createNewProject() throws InterruptedException {
    TopMenu topMenuBugTrapp = PageFactory.initElements(driver, TopMenu.class);
    Project projectBugTrapp = PageFactory.initElements(driver, Project.class);

    topMenuBugTrapp.projects.click();
    Thread.sleep(PAUSE_TIME);
    topMenuBugTrapp.allProjects.click();
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.newProject.click();
    Thread.sleep(PAUSE_TIME);

    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-content']")));

    projectBugTrapp.projectName.sendKeys("New Project");
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.productType.click();
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.chooseProductType.click();
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.targetOS.click();
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.iOSOS.click();
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.androidOS.click();
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.modalTitle.click();
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.languages.click();
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.languageFrench.click();
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.tabCommercial.click();
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.company.click();
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.selectCompany.click();
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.opNumber.sendKeys("123456");
    Thread.sleep(PAUSE_TIME);
    projectBugTrapp.productTab.click();
  }

  @AfterClass
  public void browserQuit() throws InterruptedException {
    Thread.sleep(5000);
    driver.quit();
  }
}
