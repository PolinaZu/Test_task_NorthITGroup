package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        int[] mass = new int[]{2, 10, 34, -3, 8, 12, 43, -98, 54};
        int maxElement = 0;
        for (int i = 0; i < mass.length; i++) {
            if (maxElement < mass[i]) {
                maxElement = mass[i];
            }
        }
        System.out.println("Максимальный элемент массива " + maxElement);
    }
}
