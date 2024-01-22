package Arrays;

import java.util.Arrays;
import java.util.Random;

//По условию необходимо вывести все числа по диагонали от [0][10] до [10][0], поэтому размер массива 11*11
public class Task_7 {
    public static void main(String[] args) {
        int[][] mass = new int[11][11];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int k = 0; k < mass.length; k++) {
                mass[i][k] = random.nextInt(40);
                if (i + k == 10) {
                    System.out.println(mass[i][k]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(mass)); //чтобы проверить результат
    }
}
