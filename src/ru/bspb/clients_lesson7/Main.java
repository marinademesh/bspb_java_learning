package ru.bspb.clients_lesson7;

import ru.bspb.clients_lesson4.Gender;
import ru.bspb.clients_lesson4.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Мартышкина Анна Львовна", 27, Gender.FEMALE));
        persons.add(new Person("Шариков Шарик Шарикович", 27, Gender.MALE));
        persons.add(new Person("Кусков Рафинад Сахарович", 88, Gender.MALE));
        persons.add(new Person("Бубликов Петр Сергеевич", 32, Gender.MALE));
        persons.add(new Person("Кусков Рафинад Сахарович", 51, Gender.MALE));
        persons.add(new Person("Конфеткина Анна Львовна", 67, Gender.FEMALE));
        persons.add(new Person("Львов Игорь Павлович", 33, Gender.MALE));
        persons.add(new Person("Джава Джав Джавович", 44, Gender.MALE));
        persons.add(new Person("Конфеткина Анна Львовна", 67, Gender.FEMALE));
        persons.add(new Person("Кусков Рафинад Сахарович", 88, Gender.MALE));
        persons.add(new Person("Шариков Шарик Шарикович", 27, Gender.MALE));
        persons.add(new Person("Бубликов Петр Сергеевич", 32, Gender.MALE));

       List<Person> sortPersons = persons.stream()
                .filter(person -> person.getGender()==Gender.MALE)
                .sorted(Comparator.comparing(Person::getAge))
                .distinct()
                .collect(Collectors.toList());

      //  System.out.println(sortPersons);
        //** Для красивого вывода
        ArrayList<Person> result = new ArrayList<>();
        result.addAll(sortPersons);
        Iterator<Person> iterator1 = result.iterator();
        while (iterator1.hasNext()) {
            Person bmp = iterator1.next();
            System.out.println(bmp);
        }
    }
}
