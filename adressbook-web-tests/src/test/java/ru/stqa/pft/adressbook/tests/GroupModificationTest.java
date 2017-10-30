package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class GroupModificationTest extends TestBase {

  @BeforeMethod

  public void ensurePrecondition() {
    app.goTo().groups();
    if (app.group().all().size()==0) {
      app.group().create(new GroupFields().withName("test1"));
    }
  }

  @Test
  public void testGroupModification() {
    Set<GroupFields> before = app.group().all();
    GroupFields modifiedGroup = before.iterator().next();
    GroupFields group = new GroupFields().withId(modifiedGroup.getId()).withName("test1").withFooter("test2").withHeader("test3");
    app.group().modify(group);
    Set<GroupFields> after = app.group().all();
    Assert.assertEquals(after.size(), before.size());
    before.remove(modifiedGroup);
    before.add(group);
    Assert.assertEquals(before, after);


  }



}
