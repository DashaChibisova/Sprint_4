package ru.qa.praktikum;


public class Praktikum {

    public static void main(String[] args) {
        BaseData baseData = new BaseData();
        Account account = new Account(baseData.getNameToEmboss());
        account.checkNameToEmboss();
    }
}
