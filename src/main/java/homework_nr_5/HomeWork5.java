package homework_nr_5;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {


        int[] numbers = new int[100];
        int sum = 0;
        long prod = 1;

        for (int i = 0; i != numbers.length; i++) {
            numbers[i] = 100 - i;
            System.out.println(numbers[i]);
            if (numbers[i] % 2 != 0) {
                prod *= numbers[i];
            }
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }

        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);

        for (int i : copyNumbers) {
            System.out.println("copy - " + i);
        }

        System.out.println("Сумма четных элементов = " + sum);
        System.out.println("Произведение нечетных элементов = " + prod);
    }
}
