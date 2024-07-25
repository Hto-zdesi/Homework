package homework_nr_7;

public class Manager extends Employee{

    int teamSize;
    String teamName;

    public Manager(String surName, String name, String companyName, int teamSize, String teamName) {
        super(surName, name, companyName);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }

    @Override
    public void work() {
        System.out.println("Manager is working");
    }
}
