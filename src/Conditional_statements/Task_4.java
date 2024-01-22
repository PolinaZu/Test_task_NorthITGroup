package Conditional_statements;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введите четыре числа");
        Scanner scan = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < 4; i++) {
            int number = scan.nextInt();
            if (number > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println("Количество положительных чисел = " + positive);
        System.out.println("Количество отрицательных чисел = " + negative);
    }
}
