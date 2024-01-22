package Arrays;


public class Task_1 {
    public static void main(String[] args) {
        int[] mass = new int[]{2, 3, -4, 5, -4, 6, -8};
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println("Количество положительных: " + positive);
        System.out.println("Количество отрицательных: " + negative);
    }
}
