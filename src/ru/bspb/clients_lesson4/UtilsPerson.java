package ru.bspb.clients_lesson4;
import java.util.ArrayList;
import java.util.Arrays;

public class UtilsPerson {



    public static void sortbyage(Person[] persons) {
        Arrays.sort(persons, new ComporatorByAge());
    }

    public static Person [] dublledel(Person[] persons) {

        Person[] noduble = new Person[persons.length];
        int couter = 0;
        for (int i = 0; i < persons.length; i++) {
            boolean distinctive = true;
         for (int j = 0; j <= couter; j++) {
                if (persons[i].equals(noduble[j])) {
                    distinctive = false;
                    break;
                }
            }
            if (distinctive) {
                noduble[couter] = persons[i];
                couter = couter + 1;
            }
        }
       Person [] afterdel = new Person[couter];
        for (int i = 0; i < afterdel.length; i++) {
            afterdel[i]=noduble[i];
        }
        return afterdel;
    }

    public static Person[] filterByGender(Person[] persons) {
        int count = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getGender() == Gender.MALE) {
                count = count + 1;
            }
        }

        Person[] out = new Person[count];
        int index = 0;

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getGender() == Gender.MALE) {
                out[index] = persons[i];
                index++;
            }
        }
        return out;
    }

    public static void print(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());


        }
    }
}


