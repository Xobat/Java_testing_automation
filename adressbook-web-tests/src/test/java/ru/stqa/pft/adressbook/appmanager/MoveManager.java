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
    click(By.id("logo"));
  }
  public void gotoUserModify (){
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void backtoGroupPage() {
    click(By.linkText("group page"));
  }
}
