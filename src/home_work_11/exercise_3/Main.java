package home_work_11.exercise_3;

import home_work_11.exercise_2.SaveAsThread;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        Generator generator = new Generator(intList);
        generator.start();
    }
}
