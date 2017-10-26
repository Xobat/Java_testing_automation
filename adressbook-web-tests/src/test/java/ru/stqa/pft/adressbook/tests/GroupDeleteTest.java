package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;

import java.util.List;


public class GroupDeleteTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        app.goTo().groups();
        if (app.group().list().size()==0) {
            app.group().create(new GroupFields().withName("test1"));
        }
    }

    @Test
    public void groupDelete() {
        List<GroupFields> before = app.group().list();
        int index = before.size()-1;
        app.group().delete(index);
        List<GroupFields> after = app.group().list();
        Assert.assertEquals(after.size(), before.size() - 1);
        if (after.size()>0) {
            before.remove(index);
            Assert.assertEquals(after, before);
        }
    }



}
