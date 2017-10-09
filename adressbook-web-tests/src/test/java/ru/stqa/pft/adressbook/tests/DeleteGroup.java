package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;


public class DeleteGroup extends TestBase {



    @Test
    public void groupDelete() {
        app.getMoveManager().gotoGroups();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().backtoGroupsPage();
    }

}
