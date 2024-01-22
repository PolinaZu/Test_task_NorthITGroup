package Conditional_statements;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        Scanner scan = new Scanner(System.in);
        int firstSide = scan.nextInt();
        int secondSide = scan.nextInt();
        int thirdSide = scan.nextInt();
        if (firstSide == secondSide && secondSide == thirdSide) {
            System.out.println("Треугольник является равносторонним");
        } else if (firstSide != secondSide && secondSide != thirdSide && firstSide != thirdSide) {
            System.out.println("Треугольник является разносторонним");
        } else {
            System.out.println("Треугольник является равнобедренным");
        }
    }
}
