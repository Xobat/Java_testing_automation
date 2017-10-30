package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.UserFields;

import java.util.Set;

public class UserDeleteTest extends TestBase{

  @BeforeMethod
  public void ensurePrecondition() {
    app.goTo().main();
    if (app.user().all().size()==0) {
      app.user().create(new UserFields().withName("test1"));
    }
  }

  
  @Test(enabled = true)
  public void deleteUserTest() {
    Set<UserFields> before = app.user().all();
    UserFields deletedUser = before.iterator().next();
    app.user().delete(deletedUser);
    app.goTo().main();
    Set<UserFields> after = app.user().all();
    Assert.assertEquals(after.size(), before.size()-1);

  }

}
