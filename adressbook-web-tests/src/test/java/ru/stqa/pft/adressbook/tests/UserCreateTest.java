package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.UserFields;


public class UserCreateTest extends TestBase{

  @Test(enabled = true)
  public void testUserCreation() {
    UserFields user = new UserFields().withName("Name").withMiddleName("middleName").withLastName("lastName").withAddress2("adress2").
            withAdress("address").withAYear("2000").withBYear("1983").withCompany("google").withFax("8999129319").withHome("home-home").
            withGroupID(124).withNotes("strangeNotes").withHomepage("mySite2").withPhone2("283948182").withEmail1("sad@asd.ra").
            withEmail2("123@11.11").withEmail3("email3").withMobile("8999292929292").withNickName("nicko").withTitle("title1");
    int before = app.user().getUserCount();
    app.goTo().addUser();
    app.user().create(user);
    int after = app.user().getUserCount();
    Assert.assertEquals(after, before+1);
    app.stop();
  }



}
