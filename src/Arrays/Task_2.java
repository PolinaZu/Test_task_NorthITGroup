package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int[] mass = new int[]{2, 8, 9, -2, 4, 6, 22, 10};
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0 && i != 0) {
                sum += mass[i];
            }
        }
        System.out.println("Сумма элементов с четными индексами " + sum);
    }
}

