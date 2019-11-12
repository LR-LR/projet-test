package com.stardust.formationSelenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Login
 */
public class Login {
  /**
   * Syntaxe pour chercher un élément dans une page web :
   * 
   * @FindBy(how = How.<ID || NAME || XPATH || CLASS>, using = "<l'ID || le NAME
   *             || le XPATH || la CLASS>") public WebElement nomElement;
   */

  @FindBy(how = How.ID, using = "username")
  public WebElement username;

  @FindBy(how = How.ID, using = "password")
  public WebElement password;

  @FindBy(how = How.ID, using = "remember_me")
  public WebElement remember_me;

  @FindBy(how = How.NAME, using = "_submit")
  public WebElement submit;

  @FindBy(how = How.XPATH, using = "//*[@href='/password_reset/request']")
  public WebElement passwordforgotten;
}
