package com.example.a17010233.menutest;

/**
 * Created by 17010233 on 7/1/2019.
 */

public class FriendItem {

    private String name;
    private String number;
    private boolean isGender;

    public FriendItem(String name, String number, boolean isGender) {
        this.name = name;
        this.number = number;
        this.isGender = isGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isGender() {
        return isGender;
    }

    public void setGender(boolean gender) {
        isGender = gender;
    }

    @Override
    public String toString() {
        return "FriendItem{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", isGender=" + isGender +
                '}';
    }
}
