package Arrays;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] mass = new int[]{20, 5, 15, -10, 3, 0, 12};
        int sumEvenElements = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                sumEvenElements += mass[i];
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Сумма четных элементов " + sumEvenElements);
    }
}
