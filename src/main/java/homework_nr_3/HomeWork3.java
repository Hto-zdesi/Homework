package homework_nr_3;

public class HomeWork3 {
    public static void main(String[] args) {

        int Month = 4;

        switch (Month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");
        }

        for (int i = 100; i <= 1000; i++) {
            for (int j = i; j % 5 == 0; j++) {
                System.out.println(j);
            }
        }

        float sum = 0;
        for (int i = 1; i <= 97; i += 2) {
            sum += i / (i + 2.0);
        }
        System.out.println(sum);
    }
}
