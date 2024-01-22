package Loops;


public class Task_1 {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 0; i < 9; i++) {
            number++;
            int numberIn = number * 4;
            System.out.println(number + " * 4 = " + numberIn);
        }
    }
}
