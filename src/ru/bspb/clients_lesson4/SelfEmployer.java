package ru.bspb.clients_lesson4;

public class SelfEmployer extends Clients {

    private String ogrn;

    public SelfEmployer(String name, int age, String ogrn) {
        super(name, age);
        this.ogrn = ogrn;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }


    @Override
    public int compare(Clients o1, Clients o2) {
        return 0;
    }
}
