package com.example.recyclerviewcontact;

import androidx.annotation.Nullable;

public class Contacts {
    private String name, age, address, gender;
    private Integer imageId;

    public Contacts(String name, String age, String address, String gender, @Nullable Integer imageId){
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public Integer getImageId() {
        return imageId;
    }
}
