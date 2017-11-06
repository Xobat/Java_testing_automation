package ru.stqa.pft.adressbook.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;
import ru.stqa.pft.adressbook.model.Groups;



import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


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
       Groups before = app.group().all();
        GroupFields deletedGroup = before.iterator().next();
        app.group().delete(deletedGroup);
      assertThat(app.group().count(), equalTo(before.size() - 1));
        Groups after = app.group().all();
        assertThat(after, equalTo(before.without(deletedGroup)));

    }



}
