package ru.bspb.clients_lesson4;

public enum Gender {
    MALE("Мужской"),
    FEMALE("Женский");

    Gender(String name){
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }


    @Override
    public  String toString() {
        return name;
    }

}
