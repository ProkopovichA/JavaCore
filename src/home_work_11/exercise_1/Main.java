package home_work_11.exercise_1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        int maxInt;
        int minInt;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println("Начальный массив: ");
        System.out.println(Arrays.toString(numbers));

        UtilClass utilClass1 = new UtilClass("uc1", numbers, "max");
        utilClass1.start();

        UtilClass utilClass2 = new UtilClass("uc2", numbers, "min");
        utilClass2.start();

        try {
            utilClass1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            utilClass2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        maxInt = utilClass1.result;
        minInt = utilClass2.result;

        System.out.printf("Максимальное значение: %d \n", maxInt);
        System.out.printf("Минимальное значение: %d \n", minInt);


    }
}
