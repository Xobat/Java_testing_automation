package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;

public class UserDeleteTest extends TestBase{

  @Test(enabled = false)
  public void deleteUserTest() {
    app.goTo().main();
    int before = app.user().getUserCount();
    app.user().selectUser();
    app.user().deleteUser();
    app.imitationEnter();
    int after = app.user().getUserCount();
    Assert.assertEquals(after, before-1);
  }

}
