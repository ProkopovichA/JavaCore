package home_work_11.exercise_1;


import java.util.Arrays;


public class UtilClass extends Thread {

    public int result;
    private int[] numbers;
    private String command;

    public UtilClass(String name) {
        super(name);
    }

    public UtilClass(String name, int[] numbers, String command) {
        super(name);
        this.numbers = numbers;
        this.command = command;
    }

    private int findMaxNumberInArray() {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    private int findMinNumberInArray() {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());

        if (command == "max") {
            result = findMaxNumberInArray();
        } else if (command == "min") {
            result = findMinNumberInArray();
        } else {
            System.out.println("Command not found...");
        }

        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }

}
