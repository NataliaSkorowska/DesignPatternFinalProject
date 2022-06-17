package com.company;

import java.sql.SQLOutput;
import java.text.MessageFormat;

public class Pet {
    public String name;
    public int age;

    public String getPetType() {
        return null;
    }
    public String getPetName(String name) {
        this.name = name;
        return(name);
    }
    public int getPetAge(int age) {
        this.age = age;
        return(age);
    }
    public String getPetSize() {
        return("średni");
    }
    public String getPetFeeding() {
        return("mięsożerny");
    }

    public String getPetInfo(String name, int age){
        return MessageFormat.format("{0} {1} {2} ma {3} lat, jest {4} i szuka nowego domu", getPetSize(), getPetType(), getPetName(name), getPetAge(age), getPetFeeding());
    }
}
