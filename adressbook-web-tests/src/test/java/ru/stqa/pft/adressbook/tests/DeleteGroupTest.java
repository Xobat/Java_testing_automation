package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;


public class DeleteGroupTest extends TestBase {



    @Test
    public void groupDelete() {
        app.getMoveManager().gotoGroups();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().backtoGroupsPage();
    }

}
