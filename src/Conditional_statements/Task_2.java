package Conditional_statements;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Введите два числа");
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("Первое число больше, чем второе");
        } else {
            System.out.println("Первое число меньше, чем второе");
        }
    }
}

