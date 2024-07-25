package homework_nr_7;

public class Main {

    public static void main(String[] args) {

        Manager m1 = new Manager(
                "Balan",
                "Ana",
                "Foto-Video",
                1,
                "Solo");
        Programmer p1 = new Programmer(
                "Salamandic",
                "Evghenii",
                "Pentalog",
                "Java",
                2);

        m1.printMyName();
        m1.work();
        p1.printMyName();
        p1.work();

        Person[] allPerson = new Person[]{m1,p1};

        for (int i=0; i!=allPerson.length; i++){
            if (allPerson[i] instanceof Manager tempObject){
                tempObject.work();
            }
        }
    }
}
