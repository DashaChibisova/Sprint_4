package ru.qa.praktikum;

import io.qameta.allure.junit4.DisplayName;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class AccountTest {

    private String name;
    private boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getNameData() {
        return new Object[][]{
                {"Хмедеввап Фбдухрамов", false},
                {"Фф", false},
                {"Арама  Зугута", false},
                {" Фанелеева Ирина", false},
                {"Смирнова Александра ", false},
                {"ЧапаевПетр", false},
                {"         ", false},
                {null, false},
                {"Завгодний Максимили", true},
                {"Завгодний Максимил", true},
                {"А Пра", true},
                {"А о", true}
        };
    }

    @DisplayName("Проверяет можно ли напечатать строку")
    @Test
    public void checkNameToEmboss() {
        Account account = new Account(name);
        Assert.assertEquals(expected, account.checkNameToEmboss());
    }
}