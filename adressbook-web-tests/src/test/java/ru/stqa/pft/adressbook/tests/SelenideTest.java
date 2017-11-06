package ru.stqa.pft.adressbook.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

@Test(enabled = false)
public class SelenideTest {
  public void userCanLoginByUsername() {
    open("http://localhost/addressbook/");
    $(By.name("user")).setValue("admin");
    $(By.name("pass")).setValue("secret");
    $(By.xpath("//*[@id=\"LoginForm\"]/input[3]")).click();

  }
}
