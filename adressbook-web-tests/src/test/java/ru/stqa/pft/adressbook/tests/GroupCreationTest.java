package ru.stqa.pft.adressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;
import ru.stqa.pft.adressbook.model.Groups;



import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class GroupCreationTest extends TestBase {

    @Test
    //Positive test on creation new group.
    public void testGroupCreation() {
            app.goTo().groups();
            Groups before = app.group().all();
            GroupFields group = new GroupFields().withName("test2");
            app.group().create(group);
            assertThat(app.group().count(),equalTo(before.size() + 1));
            Groups after = app.group().all();
            assertThat(after, equalTo(before.withAdded(group.withId
                    (after.stream().mapToInt((g)->g.getId()).max().getAsInt()))));/*Данная функция превращает множество after в поток
      типа GroupFields->after.stream, из него извлекаем множество целых чисел -> mapToInt; в качестве параметра функции мы передаём
      анонимную функцию, которая проходит по всему потоку и каждый элемент преобразует в число (g)->g.getId(); затем вызываем метод
      max, которая сравнивает числа, затем преобразуем результат сравнения в число getAsInt*/
    }

  @Test
  //Negative test on creation new group with unacceptable special character '
  public void groupCreationWithUnacceptableCharacter() {
            app.goTo().groups();
            Groups before = app.group().all();
            GroupFields group = new GroupFields().withName("test'");
            app.group().create(group);
            assertThat(app.group().count(),equalTo(before.size()));
            Groups after = app.group().all();
            assertThat(after, equalTo(before));
  }

}
