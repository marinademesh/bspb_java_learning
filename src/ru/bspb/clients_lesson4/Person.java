package ru.bspb.clients_lesson4;

import java.util.Comparator;
import java.util.Objects;

public class Person extends Client {
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        super(name, age);
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
   public String toString() {
        return getName()+ " " + getAge()+ " " + getGender();
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getName().equals(person.getName()) && getGender().equals(person.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender);
    }


}

