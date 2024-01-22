package Loops;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int enteredNumber = scan.nextInt();
        int[] mass = new int[enteredNumber + 1];
        for (int i = 0; i < mass.length; i++) {
            if (i == 0) {
                mass[i] = 0;
            } else if (i == 1) {
                mass[i] = mass[i - 1] + 1;
            } else {
                mass[i] = mass[i - 1] + mass[i - 2];
            }
            if (i == enteredNumber) {
                System.out.println(mass[i]);
            }
        }
    }
}
