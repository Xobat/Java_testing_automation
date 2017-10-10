package ru.stqa.pft.adressbook.appmanager;


import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  private FirefoxDriver wd;

  private MoveManager moveManager;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  private UserHelper userHelper;


  public void init() {
    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
    userHelper = new UserHelper(wd);
    moveManager = new MoveManager(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin","secret");

  }



  public void stop() {
    ApplicationManager.this.wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }
  public UserHelper getUserHelper() {
    return userHelper;
  }
  public void imitationEnter() {
    Actions builder = new Actions(wd);
    Action enter =
            builder .sendKeys(Keys.ENTER).build();
    enter.perform();
  }

  public MoveManager getMoveManager() {
    return moveManager;
  }
}

