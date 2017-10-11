package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MoveManager extends HelperBase {


  public MoveManager(WebDriver wd) {
    super(wd);
  }

  public void gotoGroups() {
      click(By.linkText("groups"));
  }
  public void gotoUsers() {
    click(By.linkText("add new"));
  }
  public void gotoMain() {
    click(By.linkText("logo"));
  }

  public void gotoUserModify (){
    click(By.name("modifiy"));
  }
}
