package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;

public class UserDeleteTest extends TestBase{

  @Test
  public void deleteUserTest() {
    app.getMoveManager().gotoUserModify();
    app.getUserHelper().deleteUserFromDetails();
    app.stop();
  }

}
