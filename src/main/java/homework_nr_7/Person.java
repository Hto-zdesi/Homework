package homework_nr_7;

public abstract class Person{

    String name;
    String surName;

    public Person(String surName, String name) {
        this.surName = surName;
        this.name = name;
    }

    public void printMyName(){
        System.out.println(name);
    }
}
