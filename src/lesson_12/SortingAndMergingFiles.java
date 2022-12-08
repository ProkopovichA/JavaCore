package lesson_12;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortingAndMergingFiles {
    public static void Run() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        try (BufferedReader br = new BufferedReader(new FileReader("in1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("in2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(numbers);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))) {
            for (int counter : numbers) {
                bw.write(String.valueOf(counter));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
