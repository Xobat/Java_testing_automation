package ru.stqa.pft.adressbook.tests;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;

import java.util.List;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getMoveManager().gotoGroups();

        List<GroupFields> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().creationNewGroup();
        app.getGroupHelper().fillGroupFields(new GroupFields("testest1", "testest2", "testest3"));
        app.getGroupHelper().submitGroup();
        app.getGroupHelper().backtoGroupsPage();
        List<GroupFields> after = app.getGroupHelper().getGroupList();

        Assert.assertEquals(after.size(), before.size()-1);
    }

}
