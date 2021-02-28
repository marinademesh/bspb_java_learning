package ru.bspb.clients_lesson4;
import ru.bspb.clients_lesson4.Gender;
import java.util.Objects;

import java.util.Comparator;

public class Person extends Clients {
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
        return getName()+ " " + getAge()+ " " + getGender()+'\n';
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

    @Override
    public int compare(Clients o1, Clients o2) {
        return 0;
    }
}

