package lesson_5;

import java.util.Arrays;
import java.util.Random;

public class Lesson5 {
    public static void main(String[] args) {
//        int[] array = new int[10];
//        Random random = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("Initial array: ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//            array[i] += 10;
//        }
//
//        System.out.println("Final array");
//        for (int i : array) {
//            //System.out.print(i + " ");
//            i = i + 1;
//        }
//        System.out.println(Arrays.toString(array));

        int tmp;
        int indexOfArr = 0;
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {
            tmp = array[i];
            indexOfArr = -1;
            //System.out.println(i);
            for (int j = i; j < array.length; j++) {
                if (array[j] < tmp) {
                    tmp = array[j];
                    indexOfArr = j;
                }
            }
            if (indexOfArr != -1) {
                tmp = array[i];
                array[i] = array[indexOfArr];
                array[indexOfArr] = tmp;
            }
            //System.out.println(Arrays.toString(array));

        }
        System.out.println(Arrays.toString(array));



    }
}
