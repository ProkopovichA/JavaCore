package home_work_11.exercise_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Generator extends Thread {
    List<Integer> intList;

    public Generator(List<Integer> intList) {
        this.intList = intList;
    }

    public void run() {
        Random random = new Random();

        System.out.printf("%s started... \n", Thread.currentThread().getName());

        for (int i = 0; i < 100; i++) {
            intList.add(random.nextInt(10));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }

        System.out.println(intList.toString());
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}
