package Conditional_statements;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int[] mass = new int[3];
        for (int i = 0; i < mass.length; i++) {
            int number = scan.nextInt();
            mass[i] = number;
        }
        Arrays.sort(mass);
        sum = mass[0] + mass[2];
        System.out.println("Сумма наибольшего и наименьшего числа = " + sum);
    }
}
