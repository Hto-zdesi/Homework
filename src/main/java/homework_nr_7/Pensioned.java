package homework_nr_7;

public abstract class Pensioned extends Person{

    String retireDate;
    int age;

    public Pensioned(String surName, String name, String retireDate, int age) {
        super(surName, name);
        this.retireDate = retireDate;
        this.age = age;
    }
}
