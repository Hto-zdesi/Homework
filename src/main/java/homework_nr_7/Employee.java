package homework_nr_7;

public abstract class Employee extends Person{

    String companyName;

    public Employee(String surName, String name, String companyName) {
        super(surName, name);
        this.companyName = companyName;
    }

    public abstract void work();
}
