package ru.qa.praktikum;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;


import java.util.Locale;

public class BaseData {
    private Faker faker = new Faker(Locale.forLanguageTag("ru"));
    private String firstname = faker.name().firstName();
    private String lastname = faker.name().lastName();

    private  String nameToEmbossMoreNineteen = RandomStringUtils.randomAlphabetic(20);
    private  String nameToEmbossLessThree  = RandomStringUtils.randomAlphabetic(2);;
    private  String incorrectFirstname = " " + getFirstname();
    private  String incorrectLastname = getLastname() + " ";


    public String getNameToEmbossLessThree() {
        return nameToEmbossLessThree;
    }

    public String getNameToEmbossMoreNineteen() {
        return nameToEmbossMoreNineteen;
    }

    public String getIncorrectFirstname() {
        return incorrectFirstname;
    }

    public String getIncorrectLastname() {
        return incorrectLastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname ;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public  String getNameToEmboss() {
        if(getFirstname().length() == 0 || getLastname().length() == 0){
            return getFirstname() + getLastname();
        }
        return getFirstname() + " " + getLastname();
    }
}
