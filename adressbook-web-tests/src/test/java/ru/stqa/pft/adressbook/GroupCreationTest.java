package ru.stqa.pft.adressbook;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroups();
        creationNewGroup();
        fillGroupFields(new GroupFields("testest1", "testest1", "testest2"));
        submitGroup();
        backtoGroupsPage();
    }

}
