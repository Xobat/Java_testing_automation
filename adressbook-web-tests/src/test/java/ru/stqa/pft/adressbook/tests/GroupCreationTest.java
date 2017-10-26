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

            app.goTo().groups();

            List<GroupFields> before = app.group().list();
            GroupFields group = new GroupFields().withName("test2");
            app.group().create(group);
            List<GroupFields> after = app.group().list();
            Assert.assertEquals(after.size(), before.size() + 1);
            group.withId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
            before.add(group);
            Comparator<? super GroupFields> byId = (g1,g2) -> Integer.compare(g1.getId(),g2.getId());
            before.sort(byId);
            after.sort(byId);
            Assert.assertEquals(new HashSet<Object>(after), new HashSet<Object>(before));
    }

}
