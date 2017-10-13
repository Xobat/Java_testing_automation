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
        if (!app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupFields("test1","test2","test3"));
        }
        List<GroupFields> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size()-1);
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().backtoGroupsPage();
        List<GroupFields> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() - 1);
        if (after.size()>0) {
            before.remove(before.size() - 1);
            Assert.assertEquals(after, before);
        }
    }

}
