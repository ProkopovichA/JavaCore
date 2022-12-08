package home_work_10.exercise_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int counterOfPunctuation = 0;
        int counterOfWord = 0;
        Pattern pattern = Pattern.compile("\\p{Punct}");

        try (BufferedReader br = new BufferedReader(new FileReader("SampleText.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    counterOfPunctuation++;
                }

                line = line.trim();
                line = line.replaceAll("\\p{Punct}", "");
                line = line.replaceAll("\\s+", " ");
                String arrOfStr[] = line.split(" ");
                counterOfWord = counterOfWord + arrOfStr.length;

            }

            System.out.println("Количество знаков препинания: " + counterOfPunctuation);
            System.out.println("Количество слов: " + counterOfWord);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
