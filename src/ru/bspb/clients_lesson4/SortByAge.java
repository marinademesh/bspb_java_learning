package ru.bspb.clients_lesson4;

import java.util.Comparator;

public class SortByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }
}
