package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;

public class UserDeleteTest extends TestBase{

  @Test
  public void deleteUserTest() {
    app.getMoveManager().gotoMain();
    int before = app.getUserHelper().getUserCount();
    app.getUserHelper().selectUser();
    app.getUserHelper().deleteUser();
    app.imitationEnter();
    int after = app.getUserHelper().getUserCount();
    Assert.assertEquals(after, before-1);
  }

}
