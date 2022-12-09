package home_work_3_cycles;

import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {
        //1. Необходимо вывести на экран таблицу умножения на 5
        System.out.println("1. Таблица умножения на 5: ");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (j == 5) {
                    System.out.printf("%2d \n", i * j);
                } else {
                    System.out.printf("%2d ", i * j);
                }
            }
        }
        System.out.print("\n");

        //2. Необходимо вывести на консоль такую последовательность чисел:
        //1 2 4 8 16 32 64 128 256 512
        System.out.println("2. Вывести последовательность чисел: 1 2 4 8 16 32 64 128 256 512");
        System.out.print("Результат: ");
        int myInt = 1;
        do {
            System.out.printf("%d ", myInt);
            myInt = myInt + myInt;
        } while (myInt <= 512);
        System.out.print("\n\n");

        //3. Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом, как на картинке ниже.
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        System.out.println("3. Выводим звездочки");
        String myString = "";
        for (int i = 0; i < 5; i++) {
            myString = myString + "* ";
            System.out.println(myString);
        }
        System.out.print("\n");

        //4. Найдите сумму и произведение цифр числа, введенного с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.print("4. Введите число: ");
        myInt = in.nextInt();
        int temp = 0;
        int temp2 = 0;
        while (myInt != 0) {
            if (temp == 0) {
                temp = myInt % 10;
                temp2 = myInt % 10;
            } else {
                temp = temp * (myInt % 10);
                temp2 = temp2 + (myInt % 10);
            }
            myInt = myInt / 10;
        }
        System.out.printf("Произведение чисел равно: %d. Cумма чисел равно: %d\n\n", temp, temp2);

        //5. Найдите самую большую цифру числа, введенного с клавиатуры, а также ее индекс
        System.out.print("5. Введите число: ");
        myInt = in.nextInt();
        temp = 0;
        int indexOfNumber = 0;
        int counter = 0;

        while (myInt != 0) {
            counter++;
            if (temp < (myInt % 10)) {
                temp = myInt % 10;
                indexOfNumber = counter;
            }
            myInt = myInt / 10;
        }
        System.out.println("Самая большая цифра: " + temp + " индэкс числа " + (counter - indexOfNumber + 1));

        //6. Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры
        System.out.print("6. Введите число: ");
        myInt = in.nextInt();
        temp = 0;
        while (myInt != 0) {
            if (temp == 0) {
                temp = myInt % 10;
            } else {
                temp = temp * (myInt % 10);
            }
            myInt = myInt / 10;
        }
        System.out.printf("Факториал равен: %d\n\n", temp);

        //7. Выведите на экран первые 10 членов последовательности Фибоначчи
        System.out.println("7. Вывести на экран первые 10 членов последовательности Фибоначчи");
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("\n\n");

        //8. В американской армии считается несчастливым число 13, а в японской — 4. Перед международными учениями штаб российской
        // армии решил исключить номера боевой техники, содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040),
        // чтобы не смущать иностранных коллег. Если в распоряжении армии имеется 100 тыс. единиц боевой техники и каждая боевая
        // машина имеет номер от 00001 до 99999, то сколько всего номеров придётся исключить?
        System.out.println("8. Сколько номеров придется исключить?");
        myInt = 0;
        for (int i = 1; i <= 99999; i++) {
            myString = String.valueOf(i);

            if (!(myString.indexOf("4") == -1) && !(myString.indexOf("13") == -1)) {
                // System.out.printf("%d ",i);
                myInt++;
            }
        }
        System.out.println("Придется исключить " + myInt);
        System.out.print("\n");

        //9. В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо
        // заказывает в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым» считается билетик
        // у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с
        // номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета
        // и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых
        // билетов в одном рулоне?
        System.out.println("9. Сколько сколько счастливых билетов?");
        int firstPart = 0;
        int secondPart = 0;
        myInt = 0;
        for (int i = 1; i <= 99999; i++) {
            firstPart = 0;
            secondPart = 0;
            temp = i;
            for (int j = 1; j <= 6; j++) {
                if (j <= 3) {
                    firstPart = firstPart + temp % 10;
                } else {
                    secondPart = secondPart + temp % 10;
                }
                temp = temp / 10;
            }
            if (firstPart == secondPart) {
                myInt++;
            }
        }

        System.out.println("Количество счастливых билетов равно: " + myInt);
        System.out.print("\n");

        //10. В городе N есть большой склад на котором существует 50000 различных полок. Для удобства работников руководство
        // склада решило заказать для каждой полки табличку с номером от 00001 до 50000 в местной типографии, но когда таблички
        // напечатали, оказалось что печатный станок из-за неисправности не печатал цифру 2, поэтому все таблички, в номерах
        // которых содержалась одна или более двойка (например, 00002 или 20202) — надо перепечатывать. Напишите программу,
        // которая подсчитает сколько всего таких ошибочных табличек оказалось в бракованной партии.
        System.out.println("10. Сколько табличек будет браковано?");
        myInt = 0;
        for (int i = 1; i <= 50000; i++) {
            myString = String.valueOf(i);

            if (myString.indexOf("2") != -1) {
                //System.out.printf("%d ", i);
                myInt++;
            }
        }
        System.out.println("Количество бракованных табличек равно: " + myInt);
        System.out.print("\n");

        //11. Для введенного целого числа определить является ли это число простым
        myInt = 20;
        boolean result = true;
        System.out.printf("11. Определить является ли число %d простым?\n", myInt);
        for (int i = 2; i < myInt; i++) {
            if ((myInt % i) == 0) {
                result = false;
            }
        }

        if (result) {
            System.out.println("Число является простым.");
        } else {
            System.out.println("Число не является простым.");
        }
        System.out.print("\n");

        //12. Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается
        // так, что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия
        // (например, 02:20, 11:11 или 15:51)
        System.out.println("12. Сколько раз часы показываю симметричные комбинации?");
        int minute = 0;
        int hour = 0;
        int minuteInDay = 1440;
        myInt = 0;

        for (int i = 0; i <= minuteInDay; i++) {
            minute = i % 60;
            hour = i / 60;

            if ((hour / 10 == minute % 10) && (hour % 10 == minute / 10)) {
                myInt++;
                System.out.printf("%02d:%02d | ", hour, minute);
            }
        }
        System.out.print("\n");
        System.out.println("Количество симметричные комбинации равно: " + myInt);
        System.out.print("\n");
    }
}
