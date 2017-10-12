package ru.stqa.pft.adressbook.appmanager;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  public ApplicationManager (String browser) {
    this.browser = browser;
  }
  private String browser;
  private WebDriver wd;
  private MoveManager moveManager;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  private UserHelper userHelper;


  public void init() {

    if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    } else if (browser.equals(BrowserType.CHROME)) {
      wd = new ChromeDriver();
    } else if (browser.equals(BrowserType.IE)) {
      wd = new InternetExplorerDriver();
    }


    wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

