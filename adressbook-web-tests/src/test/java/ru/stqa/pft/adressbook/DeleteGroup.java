package ru.stqa.pft.adressbook;

import org.testng.annotations.Test;


public class DeleteGroup extends TestBase {



    @Test
    public void groupDelete() {
       gotoGroups();
        selectGroup();
        deleteSelectedGroup();
       backtoGroupsPage();
    }

}
