package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.UserFields;


public class UserCreateTest extends TestBase{

  @Test
  public void testUserCreation() {
    app.getMoveManager().gotoUsers();
    app.getUserHelper().fillUserFields(new UserFields("testest1", "testest2", "testest3", "test4","test5","test6", "test7", "test4","test4","test4","test4","test4","test4","test4","test4","test4","test4","test4","test4","test4", "3"));
    app.getUserHelper().submitUser();
    app.stop();
  }

}
