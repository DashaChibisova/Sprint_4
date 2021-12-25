package ru.qa.praktikum;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static ru.qa.praktikum.BaseData.*;

@RunWith(Parameterized.class)
public class AccountPositiveTest {
    private String name;

    public AccountPositiveTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[] getNameData() {
        return new Object[][]{
                {nameNineteenChar},
                {nameEighteenChar},
                {nameFourChar},
                {nameThreeChar}
        };
    }

    @DisplayName("Можно напечатать строку на карте с верными данными")
    @Test
    public void checkNameToEmboss() {
        Account account = new Account(name);
        Assert.assertTrue(account.checkNameToEmboss());
    }
}
