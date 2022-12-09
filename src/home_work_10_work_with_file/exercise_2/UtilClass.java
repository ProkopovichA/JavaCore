package home_work_10_work_with_file.exercise_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class UtilClass {
    public static void ioWrite(String fileName) {

        Random random = new Random();
        try (final FileOutputStream fos = new FileOutputStream(fileName);
             final ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            for (int i = 0; i < 30; i++) {
                oos.writeInt((random.nextInt(99) + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ioRead(String fileName) {
        int arithmeticMeanOfNumbers = 0;
        try (final FileInputStream fis = new FileInputStream(fileName);
             final ObjectInputStream ois = new ObjectInputStream(fis)) {
            int tempInt;
            for (int i = 0; i < 30; i++) {
                tempInt = ois.readInt();
                arithmeticMeanOfNumbers = arithmeticMeanOfNumbers + tempInt;
                System.out.println(tempInt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Среднее арифметическое: " + (arithmeticMeanOfNumbers / 30));
    }
}
