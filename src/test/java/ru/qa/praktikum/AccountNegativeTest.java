package ru.qa.praktikum;

import io.qameta.allure.junit4.DisplayName;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static ru.qa.praktikum.BaseData.*;

@RunWith(Parameterized.class)
public class AccountNegativeTest {

    private String name;

    public AccountNegativeTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[] getNameData() {
        return new Object[][]{
                {nameTwentyChar},
                {nameTwoChar},
                {nameTwoSpacesInMiddle},
                {nameSpacesInBegin},
                {nameSpacesInEnd},
                {nameWithoutSpaces},
                {nameIsEmpty}

        };
    }

    @DisplayName("Нельзя напечатать строку на карте с неверными данными")
    @Test
    public void checkNotMustNameToEmboss() {
        Account account = new Account(name);
        Assert.assertFalse(account.checkNameToEmboss());
    }
}