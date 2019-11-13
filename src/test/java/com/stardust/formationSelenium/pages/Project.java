package com.stardust.formationSelenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Project
 */
public class Project {
  /**
   * Syntaxe pour chercher un élément dans une page web :
   * 
   * @FindBy(how = How.<ID || NAME || XPATH || CLASS>, using = "<l'ID || le NAME
   *             || le XPATH || la CLASS>") public WebElement nomElement;
   */
  @FindBy(how = How.ID, using = "project_create_button")
  public WebElement newProject;

  @FindBy(how = How.ID, using = "project_form_name")
  public WebElement projectName;

  @FindBy(how = How.XPATH, using = "//span[text()='Select value']")
  public WebElement productType;

  @FindBy(how = How.XPATH, using = "//li[text()='WEBSITE']")
  public WebElement chooseProductType;

  @FindBy(how = How.XPATH, using = "//div[@id='project_form_operatingSystems_chosen']//ul[@class='chosen-choices']")
  public WebElement targetOS;

  @FindBy(how = How.XPATH, using = "//li[text()='iOS']")
  public WebElement iOSOS;

  @FindBy(how = How.XPATH, using = "//li[text()='Android']")
  public WebElement androidOS;

  @FindBy(how = How.XPATH, using = "//div[@id='project_form_languages_chosen']//input[@class='default']")
  public WebElement languages;

  @FindBy(how = How.XPATH, using = "//li[text()='French']")
  public WebElement languageFrench;

  @FindBy(how = How.XPATH, using = "//*[@href='#commercial']")
  public WebElement tabCommercial;

  @FindBy(how = How.XPATH, using = "//span[text()='Select a client']")
  public WebElement company;

  @FindBy(how = How.XPATH, using = "//li[text()='QA BugTrapp']")
  public WebElement selectCompany;

  @FindBy(how = How.ID, using = "project_form_opNumber")
  public WebElement opNumber;

  @FindBy(how = How.XPATH, using = "//*[@href='#product']")
  public WebElement productTab;

  @FindBy(how = How.ID, using = "project_form_button")
  public WebElement createBtn;

  // Pour perdre le focus sur certains inputs
  @FindBy(how = How.CLASS_NAME, using = "modal-title")
  public WebElement modalTitle;
}
