package ru.stqa.pft.adressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.UserFields;
import ru.stqa.pft.adressbook.model.Users;

import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

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
    Users before = app.user().all();
    UserFields deletedUser = before.iterator().next();
    app.user().delete(deletedUser);
    assertThat(app.user().count(), equalTo(before.size()-1));
    Users after = app.user().all();
    assertThat(after,equalTo(before.without(deletedUser)));

  }

}
