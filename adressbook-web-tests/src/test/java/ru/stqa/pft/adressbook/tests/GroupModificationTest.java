package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;

public class GroupModificationTest extends TestBase {

  @Test
  public void testGroupModification() {
    app.getMoveManager().gotoGroups();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupFields(new GroupFields("test2", "test3", "tes4"));
    app.getGroupHelper().submitGroupModified();
  }

}
