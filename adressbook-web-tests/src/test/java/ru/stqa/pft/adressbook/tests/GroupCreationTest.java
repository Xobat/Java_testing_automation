package ru.stqa.pft.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.appmanager.TestBase;
import ru.stqa.pft.adressbook.model.GroupFields;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {

            app.goTo().groups();

            Set<GroupFields> before = app.group().all();
            GroupFields group = new GroupFields().withName("test2");
            app.group().create(group);
            Set<GroupFields> after = app.group().all();
            Assert.assertEquals(after.size(), before.size() + 1);
            group.withId(after.stream().mapToInt((g)->g.getId()).max().getAsInt()); /*Данная функция превращает множество after в поток
      типа GroupFields->after.stream, из него извлекаем множество целых чисел -> mapToInt; в качестве параметра функции мы передаём
      анонимную функцию, которая проходит по всему потоку и каждый элемент преобразует в число (g)->g.getId(); затем вызываем метод
      max, которая сравнивает числа, затем преобразуем результат сравнения в число getAsInt*/
            before.add(group);
            Assert.assertEquals(new HashSet<Object>(after), new HashSet<Object>(before));
    }

}
