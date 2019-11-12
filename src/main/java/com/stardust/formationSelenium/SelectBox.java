package com.stardust.formationSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * SelectBox
 */
public class SelectBox {
  public static void main(String[] args) throws InterruptedException {
    // Déclaration du navigateur
    // Chrome
    System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    // Firefox
    // System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver.exe");
    // WebDriver driver = new FirefoxDriver();

    // Ouverture du navigateur, accès à l'url de test et agrandissement de la
    // fenêtre du navigateur
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://toolsqa.com/automation-practice-form/");
    driver.manage().window().maximize();

    // xPaths
    String xPathCookieActionCloseHeader = "//*[@id='cookie_action_close_header']";
    String xPathFirstName = "//input[@name='firstname']";
    String xPathLastName = "//input[@id='lastname']";
    String xPathContinents = "//select[@id='continents']";
    String xPathEurope = "//select[@id='continents']//option[text()='Europe']";

    // Actions
    driver.findElement(By.xpath(xPathCookieActionCloseHeader)).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(xPathFirstName)).sendKeys("Janis");
    Thread.sleep(1000);
    driver.findElement(By.xpath(xPathLastName)).sendKeys("Lobry");
    Thread.sleep(1000);
    driver.findElement(By.xpath(xPathContinents)).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(xPathEurope)).click();
    Thread.sleep(5000);
    driver.quit();
  }
}
