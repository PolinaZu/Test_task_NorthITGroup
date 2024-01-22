package Loops;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int number2 = 0;
        while (number2 <= number) {
            if (number2 % 2 == 0) {
                System.out.print(number2 + " ");
                number2++;
            } else {
                number2++;
            }
        }
    }
}
