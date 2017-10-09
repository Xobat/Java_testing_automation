package ru.stqa.pft.adressbook.appmanager;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  private FirefoxDriver wd;

  private MoveManager moveManager;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;


  public void init() {
    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
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


  public MoveManager getMoveManager() {
    return moveManager;
  }
}

