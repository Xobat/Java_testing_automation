package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MoveManager extends HelperBase {


  public MoveManager(WebDriver wd) {
    super(wd);
  }

  public void groups() {
      click(By.linkText("groups"));
  }
  public void addUser() {
    click(By.linkText("add new"));
  }
  public void main() {
    click(By.id("logo"));
  }
  public void selectUserDetails(){
    click(By.xpath("//div/div[4]/form[2]/table/tbody/tr[2]/td[8]/a/img"));
  }

  public void backtoGroupPage() {
    click(By.linkText("group page"));
  }
}
