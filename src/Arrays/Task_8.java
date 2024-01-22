package Arrays;

import java.util.Random;

public class Task_8 {
    public static void main(String[] args) {
        int[][] mass = new int[5][5];
        Random random = new Random();
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int k = 0; k < mass.length; k++) {
                mass[k][i] = random.nextInt(40);
                sum += mass[k][i];
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
            sum = 0;
        }
        System.out.println("Максимальная сумма чисел " + maxSum);
    }
}
