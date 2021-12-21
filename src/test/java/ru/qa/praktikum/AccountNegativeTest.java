package ru.qa.praktikum;

import io.qameta.allure.junit4.DisplayName;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountNegativeTest {

    private String firstname;
    private String lastname;
    private static BaseData baseData = new BaseData();


    public AccountNegativeTest(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Parameterized.Parameters
    public static Object[] getLoginData() {
        return new Object[][]{
                {baseData.getNameToEmbossLessThree(), ""},
                {"", baseData.getNameToEmbossMoreNineteen()},
                {baseData.getIncorrectFirstname(), baseData.getLastname()},
                {baseData.getFirstname(), baseData.getIncorrectLastname()}
        };
    }

    @DisplayName("Нельзя напечатать строку на карте с неверными данными")
    @Test
    public void checkNotMustNameToEmboss() {
        baseData.setFirstname(firstname);
        baseData.setLastname(lastname);
        Account account = new Account(baseData.getNameToEmboss());
        Assert.assertFalse(account.checkNameToEmboss());
    }
}