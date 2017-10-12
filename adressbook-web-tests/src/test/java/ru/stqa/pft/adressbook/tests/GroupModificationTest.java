package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;

import java.util.List;

public class GroupModificationTest extends TestBase {

  @Test
  public void testGroupModification() {
    app.getMoveManager().gotoGroups();
    List<GroupFields> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(0);
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupFields(new GroupFields("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupModified();
    app.getMoveManager().backtoGroupPage();
    List<GroupFields> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());
  }

}
