package Loops;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        char[] charArray = text.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}
