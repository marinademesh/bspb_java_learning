package ru.bspb.clients_lesson3;

import java.util.Objects;

public class ClientFL {
    private String name;
    private int age;
    private String gender;

    public ClientFL(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    Object object = new Object();

    @Override
    public String toString() {
        return getName()+" "+getAge()+" "+getGender();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientFL clientFL = (ClientFL) o;
        return age == clientFL.age && gender == clientFL.gender && name.equals(clientFL.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}