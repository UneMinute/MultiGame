package com.example.multi_game.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Player {
    @NonNull
    @PrimaryKey
    private String name;
    private String picture;
    private String firstName;
    private int age;
    private String localisation;
    public Player(String picture, String name, String firstName, int age, String localisation){
        setPicture(picture);
        setName(name);
        setFirstName(firstName);
        setAge(age);
        setLocalisation(localisation);
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLocalisation() {
        return localisation;
    }
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
