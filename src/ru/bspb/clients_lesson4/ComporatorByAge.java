package ru.bspb.clients_lesson4;

import java.util.Comparator;

public class ComporatorByAge implements Comparator<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        return o1.getAge()-o2.getAge();
    }
}
