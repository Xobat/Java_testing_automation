package ru.stqa.pft.adressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.UserFields;
import ru.stqa.pft.adressbook.model.Users;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.*;
import static org.testng.Assert.*;


public class UserModificationTest extends TestBase{

  @BeforeMethod
  public void ensurePrecondition() {
    app.goTo().main();
    if (app.group().all().size()==0) {
      app.user().create(new UserFields().withName("newuser"));
    }
  }


  @Test(enabled = true)
  public void modificationUserTest() {
    Users before = app.user().all();
    UserFields modifiedUser = before.iterator().next();
    UserFields user = new UserFields().withName("Name2").withMiddleName("middleName2").withLastName("lastName").withAddress2("adress2").
            withAdress("address").withAYear("2000").withBYear("1983").withCompany("google").withFax("8999129319").withHome("home-home").
            withGroupID(124).withNotes("strangeNotes").withHomepage("mySite2").withPhone2("283948182").withEmail1("sad@asd.ra").
            withEmail2("123@11.11").withEmail3("email3").withMobile("8999292929292").withNickName("nicko").withTitle("title1").withId(modifiedUser.getId());

    app.user().update(user);
    Users after = app.user().all();
    assertEquals(after.size(), before.size());
    assertThat(after, CoreMatchers.equalTo(before.without(modifiedUser).withAdded(user)));
  }

}