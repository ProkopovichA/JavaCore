package home_work_11_thread_class_and_runnable.exercise_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        Generator generator = new Generator(intList);
        generator.start();
    }
}
