package home_work_12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrInteger = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            arrInteger.add(random.nextInt(99) + 1);
        }

        System.out.println("Начальный массив: ");
        System.out.println(arrInteger.toString());
        //arrInteger.stream().mapToInt(i -> i).toArray()

        System.out.println("Минимальное число: " + arrInteger.stream().min(Integer::compare).get());
        System.out.println("Максимально число: " + arrInteger.stream().max(Integer::compare).get());
        System.out.println("Среднее арифметическое: " + arrInteger.stream().mapToInt(i -> i).average());
        System.out.println("Произведение всех чисел: " + arrInteger.stream().reduce((x, y) -> x * y));
        System.out.println("Сумма всех чисел: " + arrInteger.stream().mapToInt(i -> i).sum());
        // System.out.println("Сумма всех цифр: " + arrInteger.toString().toCharArray());

        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        List<String> stringsWithLoginWord = myList.stream().filter(s -> !(s.contains("3"))).collect(Collectors.toList());
        stringsWithLoginWord.forEach(System.out::println);

        Comparator<String> myStringComparator = (s1, s2) -> {

//            if (s1.replaceAll("\\w","") > s2.replaceAll("\\w","")) {
//                return 1;
//            } else if (s1.replaceAll("\\w","") > s2.replaceAll("\w","")) {
//                return -1;
//            } else {
                return 0;
//            }
        };


    }
}
