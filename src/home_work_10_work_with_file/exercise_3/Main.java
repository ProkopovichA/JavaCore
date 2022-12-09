package home_work_10_work_with_file.exercise_3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        int counterOfLetterA = 0;
        final String fileName = "SampleText.txt";
        Pattern pattern = Pattern.compile("а+");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    counterOfLetterA++;
                }
            }

            System.out.println("Количество букв а: " + counterOfLetterA);


        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(String.valueOf(counterOfLetterA));
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
