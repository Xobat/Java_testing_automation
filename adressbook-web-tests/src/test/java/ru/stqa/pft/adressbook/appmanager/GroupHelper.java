package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.adressbook.model.GroupFields;

import java.util.ArrayList;
import java.util.List;

public class GroupHelper extends HelperBase{

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void backtoGroupsPage() {
    click(By.linkText("group page"));
  }

  public void submitGroup() {
      click(By.name("submit"));
  }

  public void fillGroupFields(GroupFields groupFields) {
    type(By.name("group_name"), groupFields.getGroupName());
    type(By.name("group_header"), groupFields.getGroupHeader());
    type(By.name("group_footer"), groupFields.getGroupFooter());
  }

  public void creationNewGroup() {
    click(By.name("new"));
    click(By.id("content"));
  }

  public void delete() {
    click(By.xpath("//div[@id='content']/form/input[5]"));
  }

  public void select(int index) {
      wd.findElements(By.name("selected[]")).get(index).click();
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModified() {
    click(By.name("update"));
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }

  public void create(GroupFields group) {
    creationNewGroup();
    fillGroupFields(group);
    submitGroup();
    backtoGroupsPage();
  }

  public int getGroupCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public List<GroupFields> list() {
    List <GroupFields> groups = new ArrayList<GroupFields>();
    List <WebElement> elements = wd.findElements(By.cssSelector("span.group"));
    for (WebElement element: elements) {
      String name = element.getText();
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));

      groups.add(new GroupFields().withId(id).withName(name));
    }
    return groups;
  }
  public void modify(int index, GroupFields group) {
    select(index);
    initGroupModification();
    fillGroupFields(group);
    submitGroupModified();
    backtoGroupsPage();
  }
  public void delete(int index) {
    select(index);
    delete();
    backtoGroupsPage();
  }
}
