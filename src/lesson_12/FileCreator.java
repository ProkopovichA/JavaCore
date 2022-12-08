package lesson_12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileCreator {
    public static void CreateFile(String fileName) {

        Random random = new Random();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 1000; i++) {
                bw.write(String.valueOf(random.nextInt(99999)+1));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
