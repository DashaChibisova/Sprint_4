package ru.qa.praktikum;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class AccountPositiveTest {
    private static BaseData baseData = new BaseData();

    @DisplayName("Можно напечатать строку на карте с верными данными")
    @Test
    public void checkNameToEmboss() {
        Account account = new Account(baseData.getNameToEmboss());
        Assert.assertTrue(account.checkNameToEmboss());
    }
}
