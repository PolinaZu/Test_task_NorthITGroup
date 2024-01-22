package Loops;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int amount = 1;
        int[] mass = new int[number];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;
            amount = amount * mass[i];
        }
        System.out.println(amount);
    }
}
