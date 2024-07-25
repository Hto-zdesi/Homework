package homework_nr_7;

public class Programmer extends Employee{

    String programmingLanguage;
    int yearOfExperience;

    public Programmer(String surName, String name, String companyName, String programmingLanguage, int yearOfExperience) {
        super(surName, name, companyName);
        this.programmingLanguage = programmingLanguage;
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public void work() {
        System.out.println("Programmer is working");
    }
}
