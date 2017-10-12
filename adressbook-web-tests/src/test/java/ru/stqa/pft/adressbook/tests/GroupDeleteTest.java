package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;

import java.util.List;


public class GroupDeleteTest extends TestBase {



    @Test
    public void groupDelete() {
        app.getMoveManager().gotoGroups();
        List<GroupFields> before = app.getGroupHelper().getGroupList();
        if (!app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupFields("test1","test2","test3"));
        }
        app.getGroupHelper().selectGroup(1);
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().backtoGroupsPage();
        List<GroupFields> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size()-1);
    }

}
