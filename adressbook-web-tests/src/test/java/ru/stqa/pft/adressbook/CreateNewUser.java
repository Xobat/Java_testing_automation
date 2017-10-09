package ru.stqa.pft.adressbook;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CreateNewUser {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        login("admin", "secret");
        gotoMainPage();

    }

    private void gotoMainPage() {
        wd.findElement(By.id("logo")).click();
    }

    private void login(String username, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    @Test
    public void addNewUser() {
        gotoAddNew();
        fillUserFields("test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", "test9", "test10", "test12", "test11", "test13", "test14", "test15", "1999", "2000", "test16", "test17", "test18");
        confirmNewUser();
    }

    private void confirmNewUser() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    private void fillUserFields(String firstname, String middlename, String lastname, String nickname, String title, String company, String adress, String home, String mobile, String work, String email, String fax, String email2, String email3, String homepage, String byear, String ayear, String adress2, String phone2, String notes) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(firstname);
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(middlename);
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(lastname);
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(nickname);
        wd.findElement(By.name("title")).click();
        wd.findElement(By.name("title")).clear();
        wd.findElement(By.name("title")).sendKeys(title);
        wd.findElement(By.name("company")).click();
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys(company);
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(adress);
        wd.findElement(By.name("home")).click();
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(home);
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(mobile);
        wd.findElement(By.name("work")).click();
        wd.findElement(By.name("work")).clear();
        wd.findElement(By.name("work")).sendKeys(work);
        wd.findElement(By.name("fax")).click();
        wd.findElement(By.name("fax")).clear();
        wd.findElement(By.name("fax")).sendKeys(fax);
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(email);
        wd.findElement(By.name("email2")).click();
        wd.findElement(By.name("email2")).clear();
        wd.findElement(By.name("email2")).sendKeys(email2);
        wd.findElement(By.name("email3")).click();
        wd.findElement(By.name("email3")).clear();
        wd.findElement(By.name("email3")).sendKeys(email3);
        wd.findElement(By.name("homepage")).click();
        wd.findElement(By.name("homepage")).clear();
        wd.findElement(By.name("homepage")).sendKeys(homepage);
        //drop-down list
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).click();
        }
        //drop-down list
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[3]")).click();
        }
        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys(byear);
        //drop-down list
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[1]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[1]")).click();
        }
        //drop-down list
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[3]")).click();
        }
        //drop-down list
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[2]")).click();
        }
        wd.findElement(By.name("ayear")).click();
        wd.findElement(By.name("ayear")).clear();
        wd.findElement(By.name("ayear")).sendKeys(ayear);
        wd.findElement(By.name("address2")).click();
        wd.findElement(By.name("address2")).clear();
        wd.findElement(By.name("address2")).sendKeys(adress2);
        wd.findElement(By.name("phone2")).click();
        wd.findElement(By.name("phone2")).clear();
        wd.findElement(By.name("phone2")).sendKeys(phone2);
        wd.findElement(By.name("notes")).click();
        wd.findElement(By.name("notes")).clear();
        wd.findElement(By.name("notes")).sendKeys(notes);
    }

    private void gotoAddNew() {
        wd.findElement(By.linkText("add new")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
