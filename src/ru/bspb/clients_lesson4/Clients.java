package ru.bspb.clients_lesson4;

import java.util.Comparator;

public abstract class Clients implements Comparator<Clients>{
    private String name;
    private int age;

    public Clients (String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }





}
