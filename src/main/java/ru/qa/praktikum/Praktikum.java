package ru.qa.praktikum;


import static ru.qa.praktikum.BaseData.nameEighteenChar;

public class Praktikum {

    public static void main(String[] args) {
        Account account = new Account(nameEighteenChar);
        account.checkNameToEmboss();
    }
}
