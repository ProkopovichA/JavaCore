package home_work_11.exercise_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers1 = new int[10];
        int[] numbers2 = new int[10];
        int[] numbers3 = new int[10];

        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = random.nextInt(10);
        }

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = random.nextInt(10);
        }

        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = random.nextInt(10);
        }

        SaveAsThread saveAsThread1 = new SaveAsThread("SaveAsThread1", numbers1, "SaveAsThread1.txt");
        saveAsThread1.start();

        SaveAsThread saveAsThread2 = new SaveAsThread("SaveAsThread2", numbers2, "SaveAsThread2.txt");
        saveAsThread2.start();

        SaveAsThread saveAsThread3 = new SaveAsThread("SaveAsThread3", numbers3, "SaveAsThread3.txt");
        saveAsThread3.start();


    }
}
