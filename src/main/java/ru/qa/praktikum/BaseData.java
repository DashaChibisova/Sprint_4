package ru.qa.praktikum;

import org.apache.commons.lang3.RandomStringUtils;

public class BaseData {

    public static String nameTwentyChar = getRandomString(9) + " " + getRandomString(10);
    public static String nameTwoChar = getRandomString(2);
    public static String nameTwoSpacesInMiddle = getRandomString(5) + "  " + getRandomString(6);
    public static String nameSpacesInBegin = " " + getRandomString(5) + " " + getRandomString(6);
    public static String nameSpacesInEnd = getRandomString(5) + " " + getRandomString(6) + " ";
    public static String nameWithoutSpaces = getRandomString(5) + getRandomString(6);
    public static String nameIsEmpty = "              ";
    public static String nameNineteenChar = getRandomString(9) + " " + getRandomString(9);
    public static String nameEighteenChar = getRandomString(9) + " " + getRandomString(8);
    public static String nameFourChar = getRandomString(1) + " " + getRandomString(2);
    public static String nameThreeChar = getRandomString(1) + " " + getRandomString(1);

    public static String getRandomString(int count) {
        return RandomStringUtils.randomAlphabetic(count);
    }

}
