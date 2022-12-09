package home_work_11_thread_class_and_runnable.exercise_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveAsThread extends Thread {
    int[] numbers;
    String fileName;

    public SaveAsThread(String name) {
        super(name);
    }

    public SaveAsThread(String name, int[] numbers, String fileName) {
        super(name);
        this.numbers = numbers;
        this.fileName = fileName;
    }

    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (int i : numbers) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }

}
