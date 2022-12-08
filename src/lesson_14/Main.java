package lesson_14;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    /*Дана коллекция Collection<String> col. С помощью stream api:
    узнать, содержит ли какая-нибудь из строк слово login
    найти самую длинную строку
    найти самую короткую строку
    найти строки-слова (не содержат пробелов и знаков препинания)
    получить все слова используемые в строках
    */

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("узнать, содержит ли какая-нибудь из строк слово login 123");
        strings.add("найти самую длинную строку login");
        strings.add("привет");
        strings.add("узнать, содержит ли какая-нибудь из строк слово login");
        strings.add("получить все слова используемые в строках");
        strings.add("пока");

        List<String> stringsWithLoginWord = strings.stream().filter(s -> s.contains("login")).collect(Collectors.toList());
        stringsWithLoginWord.forEach(System.out::println);

        Comparator<String> myStringComparator = (s1, s2) -> {
            if(s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() > s2.length()) {
                return -1;
            } else {
                return 0;
            }
        };

        String theLongestString = strings.stream().max(myStringComparator).get();

        System.out.println("theLongestString: "+theLongestString);
        System.out.println("theShortestString: "+strings.stream().min(myStringComparator).get());

        List<String> oneWordStrings = strings.stream().filter(s -> !(s.contains(" "))).collect(Collectors.toList());
        oneWordStrings.forEach(System.out::println);

        System.out.println("--------------------------------------------");
        List<String> allWords1 =
                Arrays.stream(strings.stream().collect(Collectors.joining(" ")).split(" |\\p{P} ")).distinct().collect(Collectors.toList());
        allWords1.forEach(System.out::println);

        System.out.println("--------------------------------------------");
        Set<String> allWords2 = new HashSet<>();
                strings.forEach(s -> allWords2.addAll(Arrays.asList(s.split(" |\\p{P} "))));
        allWords2.forEach(System.out::println);

        System.out.println("--------------------------------------------");
        List<Integer>  stringLengthList = strings.stream().map(String::length).collect(Collectors.toList());
        stringLengthList.forEach(System.out::println);

    }
}
