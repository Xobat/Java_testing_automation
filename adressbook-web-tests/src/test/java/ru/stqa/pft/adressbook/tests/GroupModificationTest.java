package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;

public class GroupModificationTest extends TestBase {

  @Test
  public void testGroupModification() {
    app.getMoveManager().gotoGroups();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupFields(new GroupFields("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupModified();
    app.getMoveManager().backtoGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before);
  }

}
