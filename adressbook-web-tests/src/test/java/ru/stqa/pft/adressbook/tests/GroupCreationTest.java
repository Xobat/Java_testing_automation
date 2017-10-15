package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {

            app.getMoveManager().gotoGroups();

            List<GroupFields> before = app.getGroupHelper().getGroupList();
            app.getGroupHelper().creationNewGroup();
            GroupFields group = new GroupFields("testest2", "testest3", "testest4");
            app.getGroupHelper().fillGroupFields(group);
            app.getGroupHelper().submitGroup();
            app.getGroupHelper().backtoGroupsPage();
            List<GroupFields> after = app.getGroupHelper().getGroupList();
            Assert.assertEquals(after.size(), before.size() + 1);
            group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
            before.add(group);
            Comparator<? super GroupFields> byId = (g1,g2) -> Integer.compare(g1.getId(),g2.getId());
            before.sort(byId);
            after.sort(byId);
            Assert.assertEquals(new HashSet<Object>(after), new HashSet<Object>(before));
    }

}
