package ru.stqa.pft.adressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;
import ru.stqa.pft.adressbook.model.Groups;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class GroupModificationTest extends TestBase {

  @BeforeMethod

  public void ensurePrecondition() {
    app.goTo().groups();
    if (app.group().all().size()==0) {
      app.group().create(new GroupFields().withName("test1"));
    }
  }

  @Test
  public void testGroupModification() {
    Groups before = app.group().all();
    GroupFields modifiedGroup = before.iterator().next();
    GroupFields group = new GroupFields().withId(modifiedGroup.getId()).withName("test1").withFooter("test2").withHeader("test3");
    app.group().modify(group);
    assertThat(app.group().count(), equalTo(before.size()));
    Groups after = app.group().all();
    assertThat(after, equalTo(before.without(modifiedGroup).withAdded(group)));


  }



}
