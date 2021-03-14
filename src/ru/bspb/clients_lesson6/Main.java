package ru.bspb.clients_lesson6;

import ru.bspb.clients_lesson4.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List <Client> сl = new ArrayList<>();
        ArrayList<Person> pl = new ArrayList<>();
        pl.add(new Person("Мартышкина Анна Львовна", 27, Gender.FEMALE));
        pl.add(new Person("Шариков Шарик Шарикович", 27, Gender.MALE));
        pl.add(new Person("Кусков Рафинад Сахарович", 88, Gender.MALE));
        pl.add(new Person("Бубликов Петр Сергеевич", 32, Gender.MALE));
        pl.add(new Person("Кусков Рафинад Сахарович", 51, Gender.MALE));
        pl.add(new Person("Конфеткина Анна Львовна", 67, Gender.FEMALE));
        pl.add(new Person("Львов Игорь Павлович", 33, Gender.MALE));
        pl.add(new Person("Джава Джав Джавович", 44, Gender.MALE));
        pl.add(new Person("Конфеткина Анна Львовна", 67, Gender.FEMALE));
        pl.add(new Person("Кусков Рафинад Сахарович", 88, Gender.MALE));
        pl.add(new Person("Шариков Шарик Шарикович", 27, Gender.MALE));
        pl.add(new Person("Бубликов Петр Сергеевич", 32, Gender.MALE));

        Set<Person> pl1 = new HashSet<>(); // Записываем Arraylist в Set, чтобы удалить дубликаты
        pl1.addAll(pl);

        // ** Проверяем, что при записи в Set удалились дубликаты
        //  Iterator <Person> iterator = pl1.iterator();
        //   while (iterator.hasNext()) {
        //    Person tmp1 = iterator.next();
        //    System.out.println(tmp1);
        //     }

        ArrayList<Person> pl2 = new ArrayList<>(); //Записываем Клиентов обратно в в Arraylist
        pl2.addAll(pl1);

        Collections.sort(pl2);// Сортируем по возрастанию предварительно в классе Person мы переопределили compare: public int compareTo(Person o) {return this.getAge()-o.getAge(); }

        //  ** Проверяем вывод, что Клиенты отсортированы по возрастанию:
        //    Iterator <Person> iterator = pl2.iterator();
        //    while (iterator.hasNext()) {
        //       Person tmp2 = iterator.next();
        //       System.out.println(tmp2);
        //     }

        ArrayList<Person> pl3 = new ArrayList<>();
        pl3.addAll(pl2);

        // **Удаляем всех женщин и печатаем мужчин
        Iterator<Person> iterator = pl3.iterator();
        while (iterator.hasNext()) {
            Person tmp3 = iterator.next();
            if (tmp3.getGender() == Gender.FEMALE) {
                iterator.remove();
            }
        }
        //** Для красивого вывода
       ArrayList<Person> result = new ArrayList<>();
       result.addAll(pl3);
        Iterator <Person> iterator1 = result.iterator();
        while (iterator1.hasNext()) {
            Person bmp = iterator1.next();
             System.out.println(bmp);
           }
     // System.out.println(pl3);
    }
}


