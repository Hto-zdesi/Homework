package homework_nr_6;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month < 13){
            this.month = month;
        }else {
            System.out.println("Ошибка Введенных данных месяца!!!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day < 31){
            this.day = day;
        }else {
            System.out.println("Ошибка Введенных данных месяца!!!");
        }
        }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate(){
        System.out.println(day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {

        Date dataClass = new Date(5,2,1999);

        dataClass.displayDate();
    }
}
