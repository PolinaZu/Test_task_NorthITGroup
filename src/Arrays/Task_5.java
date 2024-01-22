package Arrays;


public class Task_5 {
    public static void main(String[] args) {
        int[] mass = new int[]{0, 1, 7, 3, 11, 2, 12, 5, 5};
        int count = 0;
        int maxCount = 1;
        int popularNumber = 0;
        int maxPopularNumber = 0;
        for (int i = 0; i < mass.length; i++) {
            count = 0;
            for (int k = i; k < mass.length; k++) {
                if (mass[i] == mass[k]) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
                popularNumber = mass[i];
            } else if (maxCount == count && count != 1 && popularNumber < mass[i]) {
                maxPopularNumber = mass[i];

            }
        }
        if (maxCount == 1) {
            System.out.println("Повторяющихся чисел нет");
        } else if (maxPopularNumber > 0) {
            System.out.println("Наибольшее число из часто встречающихся: " + maxPopularNumber);
        } else {
            System.out.println("Наиболее часто встречающееся число: " + popularNumber);
        }
    }
}

