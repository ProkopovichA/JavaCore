package home_work_12_stream_api;


import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static int sumOfNumber(int number) {
        int result = 0;
        while (number != 0) {
            result = result + (number % 10);
            number = number / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arrInteger = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            arrInteger.add(random.nextInt(99) + 1);
        }

        System.out.println("Начальный массив: ");
        System.out.println(arrInteger.toString());

        System.out.println("Минимальное число: " + arrInteger.stream().min(Integer::compare).get());
        System.out.println("Максимально число: " + arrInteger.stream().max(Integer::compare).get());
        System.out.println("Среднее арифметическое: " + arrInteger.stream().mapToInt(i -> i).average());
        System.out.println("Произведение всех чисел: " + arrInteger.stream().reduce((x, y) -> x * y));
        System.out.println("Сумма всех чисел: " + arrInteger.stream().mapToInt(i -> i).sum());
        System.out.println("Сумма всех цифр: " + arrInteger.stream().mapToInt(i -> i).map(i -> sumOfNumber(i)).sum());
        System.out.println();

        System.out.println("3.0 Выведем начальный массив");
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        System.out.println(myList);
        System.out.println();

        System.out.println("3.1 Выводим без элементов которые не содержат 3: ");
        List<String> resultArray = myList.stream().filter(s -> !(s.contains("3"))).collect(Collectors.toList());
        System.out.println(resultArray);
        System.out.println();

        System.out.println("3.2 Выводим сортированный массив: ");
        Comparator<String> myStringComparator = (s1, s2) -> {
            int num1 = Integer.parseInt(s1.replaceAll("\\D", ""));
            int num2 = Integer.parseInt(s2.replaceAll("\\D", ""));
            char letter1 = s1.replaceAll("\\d", "").charAt(0);
            char letter2 = s2.replaceAll("\\d", "").charAt(0);

            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            } else {
                if (letter2 > letter1) {
                    return 1;
                } else if (letter2 < letter1) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        //Использовал исходный массив что бы максимально полно проверить компоратор
        System.out.println(myList.stream().sorted(myStringComparator).collect(Collectors.toList()));
        System.out.println();

        System.out.println("3.3 Отбрасываем первый и последний элемент: ");
        resultArray = resultArray.stream().skip(1).collect(Collectors.toList());
        resultArray = resultArray.stream().limit(resultArray.size() - 1).collect(Collectors.toList());
        System.out.println(resultArray);
        System.out.println();

        System.out.println("3.4 Привести в uppercase: ");
        resultArray = resultArray.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(resultArray);
        System.out.println();

        System.out.println("3.5 выдать на печать результат: ");
        resultArray.stream().forEach(System.out::println);
        System.out.println();

        System.out.println("3.6 Напечатать количество оставшихся элементов: ");
        System.out.println(resultArray.stream().count());


    }
}
