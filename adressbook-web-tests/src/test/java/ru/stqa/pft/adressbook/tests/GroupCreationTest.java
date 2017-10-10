package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getMoveManager().gotoGroups();
        app.getGroupHelper().creationNewGroup();
        app.getGroupHelper().fillGroupFields(new GroupFields("testest1", "testest2", "testest3"));
        app.getGroupHelper().submitGroup();
        app.getGroupHelper().backtoGroupsPage();
    }

}
