package home_work_08_strings_regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        //1. Введите строку. Если она начинается на 'abc', то заменить их на 'www',
        // иначе добавить в конец строки 'zzz'.

        //String myString = "abcfgjjkl";
        String myString = "1abcfgjjkl";
        System.out.println("1. Начальная строка: " + myString);

        if (myString.indexOf("abc") == 0) {
            myString = myString.replace("abc", "www");
        } else {
            myString = myString + "zzz";
        }

        System.out.println(myString);
        System.out.println();

        //2. Вводится ненормированная строка, у которой могут быть пробелы в начале,
        // в конце и между словами более одного пробела.
        //        - Привести ее к нормированному виду, т.е. удалить все пробелы в
        //        начале и конце, а между словами оставить только один пробел.

        myString = "   В начале три пробела  два пробела,    четыре пробела, в конце 6 пробелов       ";
        System.out.println("2. Начальная строка: " + myString);
        myString = myString.trim();
        myString = myString.replaceAll("\\s+", " ");
        System.out.println(myString);
        System.out.println();

        //3. Введите строку (текст). Найдите наибольшее количество идущих подряд цифр.

        myString = "555333332244444448888";
        int counter = 0;
        String curentNumber = "";
        String tmpNumber = "";
        int counterMax = 0;

        for (int i = 0; i < myString.length(); i++) {
            tmpNumber = myString.substring(i, i + 1);
            if (curentNumber.equals(tmpNumber)) {
                counter++;
            } else {
                if (counterMax < counter) {
                    counterMax = counter;
                    counter = 0;
                }
                curentNumber = tmpNumber;
            }
        }
        System.out.println("3.1. Начальная строка: " + myString);
        System.out.println("Длина самой длинной последовательности: " + counterMax);
        System.out.println();

        //        - Поменяйте местами первое самое длинное слово с последним самым коротким
        String str = "Эта строка строка test а test и";
        System.out.println("3.2. Начальная строка: " + str);
        String arrOfStr2[] = str.split(" ");
        String strMaxLength = "";
        String strMinLength = "";
        int strMaxLengthIndex = 0;
        int strMinLengthIndex = 0;

        for (int i = 0; i < arrOfStr2.length; i++) {
            if (strMaxLength.equals("")) {
                strMaxLength = arrOfStr2[i];
                strMinLength = arrOfStr2[i];
            }

            if (arrOfStr2[i].length() <= strMinLength.length()) {
                strMinLength = arrOfStr2[i];
                strMinLengthIndex = i;
            }

            if (arrOfStr2[i].length() > strMaxLength.length()) {
                strMaxLength = arrOfStr2[i];
                strMaxLengthIndex = i;
            }

        }

        arrOfStr2[strMinLengthIndex] = strMaxLength;
        arrOfStr2[strMaxLengthIndex] = strMinLength;

        String result = "";
        for (int i = 0; i < arrOfStr2.length; i++) {
            result = result + " " + arrOfStr2[i];
        }

        System.out.println(result);
        System.out.println();

        //        - Найти в строке все знаки препинания. Подсчитать общее количество их.
        counter = 0;
        myString = "«Я жалею, что не знала вашего отца , – сказала она погодя. – Он, должно быть, был очень добрым, очень серьезным, очень любил вас »? Лужин промолчал!";
        System.out.println("4. Начальная строка: " + myString);
        System.out.println("Знаки препинания:");

        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(myString);
        while (matcher.find()) {
            System.out.println(matcher.group());
            counter++;
        }

        System.out.println("Количество знаков препинания: " + counter);
        System.out.println();

        //4. Имеется строка с текстом.
        //- Подсчитайте уникальное количество слов в тексте.
        myString = "Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text.";
        System.out.println("4. Начальная строка: " + myString);
        myString = myString.trim();
        myString = myString.replaceAll("\\p{Punct}", "");
        myString = myString.replaceAll("\\s+", " ");
        myString = myString.toLowerCase();
        String arrOfStr[] = myString.split(" ");
        String arrOfStrF[] = new String[arrOfStr.length];
        counter = 0;
        int findOk = 0;


        for (String s : arrOfStr) {
            findOk = 0;
            for (int i = 0; i < counter; i++) {
                if (arrOfStrF[i].equals(s)) {
                    findOk = 1;
                }
            }
            if (findOk == 0) {
                arrOfStrF[counter] = s;
                counter++;
            }
        }

        System.out.println(counter);
        System.out.println();

        //5. RegEx. Шестнадцатеричный цвет.
        //Символ # (необязательно), затем слово, состоящее из букв от a до f или цифр, длиной 3 или 6:
        //Пример: FFFFFF #000 101011

        myString = "#FFFFFF";
        System.out.println("5. Начальная строка: " + myString);
        myString = myString.toLowerCase();
        boolean res = myString.matches("(\\#*)(\\d{3}|\\d{6}|[a-f]{3}|[a-f]{6})");
        if (res) {
            System.out.println("Это цвет");
        } else {
            System.out.println("Это не цвет");
        }
        System.out.println();

        //6. RegEx. Email.
        //Общий вид — логин@поддомен.домен.
        //Логин, как и поддомен — слова из букв, цифр, подчеркиваний, дефисов и точек.
        // А домен (имеется в виду 1го уровня) — это от 2 до 6 букв и точек.
        //Пример: myemail@gmail.com  a.petrov@gmail.com.au coder4575@yandex.ru

        myString = "myemail@gmail.com";
        System.out.println("6. Начальная строка: " + myString);
        myString = myString.toLowerCase();

        res = myString.matches("[_a-z0-9-\\.]+@[_a-z0-9-\\.]+(\\.[a-z.]{2,6})");

        if (res) {
            System.out.println("Это e-mail");
        } else {
            System.out.println("Это не e-mail");
        }
        System.out.println();

        //7. RegEx. IP адрес.
        myString = "255.255.255.253";
        System.out.println("7. Начальная строка: " + myString);
        myString = myString.toLowerCase();

        res = myString.matches("([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])");

        if (res) {
            System.out.println("Это ip");
        } else {
            System.out.println("Это не ip");
        }
        System.out.println();

        //7. RegEx. URL. .
        myString = "https://www.it-academy.by/course/java-developer/";
        //myString = "https://catalog.onliner.by/bike?is_prime=1";
        System.out.println("8. Начальная строка: " + myString);
        myString = myString.toLowerCase();

        res = myString.matches("(https://?|http://?)[-a-z0-9_.]*(\\.[a-z.]{2,6})/[-a-z0-9+&@#/%?=~_|]*");

        if (res) {
            System.out.println("Это URL");
        } else {
            System.out.println("Это не URL");
        }
        System.out.println();


    }
}
