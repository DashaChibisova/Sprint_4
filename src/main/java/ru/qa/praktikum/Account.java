package ru.qa.praktikum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private final String name;

    private static final String USERNAME_PATTERN ="^(?=.{3,19}$)(\\S+\\s\\S+)$";
    private static final Pattern pattern = Pattern.compile(USERNAME_PATTERN);

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
           if(this.name == null) return false;
            Matcher matcher = pattern.matcher(this.name);
            return matcher.matches();
        }
}
