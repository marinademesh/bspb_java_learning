package ru.bspb.clients_lesson4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        SelfEmployer[] selfEmployers = new SelfEmployer[]{
                new SelfEmployer("Козлов Андрей Иванович", 45, "123456789"),
                new SelfEmployer("Пончик Андрей Петрович", 55, "7777712345"),
                new SelfEmployer("Бубликов Петр Сергеевич", 32, "123456789"),
                new SelfEmployer("Мартышкина Анна Львовна", 27, "789632145"),
                new SelfEmployer("Козлов Андрей Иванович", 45, "1258963147"),
                new SelfEmployer("Советова Мария Петровна", 44, "1234567897"),
                new SelfEmployer("Львов Игорь Павлович", 33, "12345678978"),
                new SelfEmployer("Пончик Андрей Петрович", 55, "88845678978"),
                new SelfEmployer("Бубликов Петр Сергеевич", 32, "55545678978"),
                new SelfEmployer("Бубликов Петр Сергеевич", 32, "55545678978")
        };
        Person[] persons = new Person[]{
                new Person("Мартышкина Анна Львовна", 27, Gender.FEMALE),
                new Person("Шариков Шарик Шарикович", 27, Gender.MALE),
                new Person("Кусков Рафинад Сахарович", 88, Gender.MALE),
                new Person("Бубликов Петр Сергеевич", 32, Gender.MALE),
                new Person("Кусков Рафинад Сахарович", 51, Gender.MALE),
                new Person("Конфеткина Анна Львовна", 67, Gender.FEMALE),
                new Person("Львов Игорь Павлович", 33, Gender.MALE),
                new Person("Джава Джав Джавович", 44, Gender.MALE),
                new Person("Добрая Мария Павловна", 44, Gender.FEMALE),
                new Person("Кусков Рафинад Сахарович", 99, Gender.MALE),
                new Person("Шариков Шарик Шарикович", 27, Gender.MALE),
                new Person("Бубликов Петр Сергеевич", 32, Gender.MALE)

        };

        Comparator<Person> comparator = new SortByAge();

        Arrays.sort(persons, comparator);

        Function.DublleDel(persons);

    }
}


