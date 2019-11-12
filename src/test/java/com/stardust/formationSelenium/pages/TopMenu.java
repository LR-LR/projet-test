package com.stardust.formationSelenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * TopMenu
 */
public class TopMenu {
  /**
   * Syntaxe pour chercher un élément dans une page web :
   * 
   * @FindBy(how = How.<ID || NAME || XPATH || CLASS>, using = "<l'ID || le NAME
   *             || le XPATH || la CLASS>") public WebElement nomElement;
   */

  @FindBy(how = How.XPATH, using = "//li[@id='id_header_projects']")
  public WebElement projects;

  @FindBy(how = How.XPATH, using = "//a[@href='/projects']")
  public WebElement allProjects;

  @FindBy(how = How.XPATH, using = "//a[@href='/bugs']")
  public WebElement bugTracker;

  @FindBy(how = How.XPATH, using = "//*[@id='id_header_devices']/a")
  public WebElement devices;

  @FindBy(how = How.XPATH, using = "//*[@href='/devices']")
  public WebElement allDevices;

  @FindBy(how = How.XPATH, using = "//*[@href='/device/base-model/list']")
  public WebElement allModels;

  @FindBy(how = How.XPATH, using = "//*[@href='/devicelists/list']")
  public WebElement DeviceLists;

  @FindBy(how = How.XPATH, using = "//a[@href='/users']")
  public WebElement users;

  @FindBy(how = How.XPATH, using = "//a[@href='/help']")
  public WebElement help;
}
