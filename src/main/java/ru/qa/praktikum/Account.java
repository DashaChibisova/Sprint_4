package ru.qa.praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return this.name.length() >= 3 && this.name.length() <= 19 && this.name.matches("\\S+\\s\\S+");
    }
}
