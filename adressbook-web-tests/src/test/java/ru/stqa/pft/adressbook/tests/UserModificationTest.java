package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.UserFields;

import java.util.HashSet;
import java.util.Set;


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
    Set<UserFields> before = app.user().all();
    UserFields modifiedUser = before.iterator().next();
    UserFields user = new UserFields().withName("Name2").withMiddleName("middleName2").withLastName("lastName").withAddress2("adress2").
            withAdress("address").withAYear("2000").withBYear("1983").withCompany("google").withFax("8999129319").withHome("home-home").
            withGroupID(124).withNotes("strangeNotes").withHomepage("mySite2").withPhone2("283948182").withEmail1("sad@asd.ra").
            withEmail2("123@11.11").withEmail3("email3").withMobile("8999292929292").withNickName("nicko").withTitle("title1").withId(modifiedUser.getId());

    app.user().update(user);
    Set<UserFields> after = app.user().all();
    Assert.assertEquals(after.size(), before.size());
    before.remove(modifiedUser);
    before.add(user);
    Assert.assertEquals(before, after);
  }

}