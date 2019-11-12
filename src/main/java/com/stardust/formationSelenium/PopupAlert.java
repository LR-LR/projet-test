package com.stardust.formationSelenium;

// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * PopupAlert
 */
public class PopupAlert {
  public static void main(String[] args) throws InterruptedException {
    // Déclaration du navigateur
    // Chrome
    // System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
    // WebDriver driver = new ChromeDriver();

    // Firefox
    System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();

    // Ouverture du navigateur, accès à l'url de test et agrandissement de la
    // fenêtre du navigateur
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://demo.guru99.com/V4");
    driver.manage().window().maximize();

    // xPaths
    String xPathUserID = "//input[@name='uid']";
    String xPathPassword = "//input[@name='password']";
    String xPathLogin = "//input[@name='btnLogin']";

    // Actions
    driver.findElement(By.xpath(xPathUserID)).sendKeys("Username");
    Thread.sleep(1500);
    driver.findElement(By.xpath(xPathPassword)).sendKeys("Password");
    Thread.sleep(1500);
    driver.findElement(By.xpath(xPathLogin)).click();
    Thread.sleep(1500);
    Alert alert = driver.switchTo().alert();
    String alertMessage = driver.switchTo().alert().getText();
    System.out.println(alertMessage);
    alert.accept();
    Thread.sleep(3000);

    driver.quit();
  }
}
