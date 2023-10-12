package org.example;

public class Team {
    private String name;
    private int age;
    private String gender;
    private int birthday;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public Team(String name, int age, String gender, int birthday) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;

    }
}


