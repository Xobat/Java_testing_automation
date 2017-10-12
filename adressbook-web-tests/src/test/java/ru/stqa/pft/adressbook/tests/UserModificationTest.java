package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.UserFields;


public class UserModificationTest extends TestBase{

  @Test
  public void modificationUserTest() {
    int before = app.getUserHelper().getUserCount();
    app.getMoveManager().gotoUserModify();
    app.getUserHelper().fillUserFields(new UserFields("3", "124", "fwe", "123a","hfdh4","hhje", "r32r", "vxcsd","aaaa","fwqefq","    ","qwtqwt","gqegqeg "," qfqsf ","reg23 qw","ddwq","r21r","fwa wa ","wfwqfw1 ","qwf f1", 1));
    app.getUserHelper().submitUserModified();
    app.getMoveManager().gotoMain();
    int after = app.getUserHelper().getUserCount();
    Assert.assertEquals(after, before);
    app.stop();
  }

}