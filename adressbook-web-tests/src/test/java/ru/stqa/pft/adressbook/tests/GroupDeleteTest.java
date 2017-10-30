package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;

import java.util.List;
import java.util.Set;


public class GroupDeleteTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        app.goTo().groups();
        if (app.group().all().size()==0) {
            app.group().create(new GroupFields().withName("test1"));
        }
    }

    @Test
    public void groupDelete() {
        Set<GroupFields> before = app.group().all();
        GroupFields deletedGroup = before.iterator().next();
        app.group().delete(deletedGroup);
        Set<GroupFields> after = app.group().all();
        Assert.assertEquals(after.size(), before.size() - 1);
        if (after.size()>0) {
            before.remove(deletedGroup);
            Assert.assertEquals(after, before);
        }
    }



}
