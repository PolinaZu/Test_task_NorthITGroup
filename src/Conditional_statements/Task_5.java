package Conditional_statements;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        System.out.println("Введите три числа: ");
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();
        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println("Самое большое число: " + firstNumber);
            } else {
                System.out.println("Самое большое число: " + thirdNumber);
            }
        } else if (secondNumber > firstNumber) {
            if (secondNumber > thirdNumber) {
                System.out.println("Самое большое число: " + secondNumber);
            } else {
                System.out.println("Самое большее число: " + thirdNumber);
            }
        }
    }
}
