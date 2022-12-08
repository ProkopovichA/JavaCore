package lesson_4;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
//        for (int i = 17; i < 28; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//
//            if (i % 3 == 0) {
//                System.out.println("i = " + i);
//            }
//
//        }


//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                if (j==9) {
//                    System.out.printf("%2d \n",i*j);
//                } else {
//                    System.out.printf("%2d ",i*j);
//                }
//            }
//        }
//
//        //-------------------------------------------------
//        int allPeople = 10000000;
//        int newPeople = 14;
//        int deathPeople = 8;
//        int thousand = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            thousand = allPeople / 1000;
//            allPeople = allPeople + newPeople*thousand - deathPeople*thousand;
//        }
//        System.out.println("");
//        System.out.println("Через 10 лет будет "+allPeople);
//
//        //-------------------------------------------------
//
//
//        for (int i = 1;i <= 10;i++) {
//            thousand = allPeople/1000;
//            allPeople = allPeople + newPeople*thousand - deathPeople*thousand;
//
//            if (newPeople >= 7) {
//                newPeople--;
//            }
//
//            if (deathPeople >= 6) {
//                deathPeople--;
//            }
//
//        }
//
//        System.out.println("");
//        System.out.println("Через 10 лет будет "+allPeople);
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите сумму: ");
//        float summMoney = in.nextInt();
//
//        System.out.print("Введите количество месяцев: ");
//        int monthNumber = in.nextInt();
//
//
//        for (int i=1;i <= monthNumber;i++) {
//            summMoney = summMoney + summMoney*0.07f;
//            //System.out.println(summMoney);
//        }
//
//        System.out.println(summMoney);

        int firstNumber = 0;
        int secondNumber = 0;
        char command;
        String lineIn;
        System.out.println("Доступные команды:");
        System.out.println("q - Выход");
        System.out.println("1 - Умножить два числа");
        System.out.println("2 - Разделить два числа");
        System.out.println("3 - Сложить два числа");
        System.out.println("4 - Найти разницу двух чисел");

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("Введите команду: ");
            lineIn = in.next();
            command = lineIn.charAt(lineIn.length()-1);
            if (command == 'q')
            { System.out.println("Завершение программы ...");
                break;
            }

            System.out.print("Введите первое число: ");
            firstNumber = in.nextInt();
            System.out.print("Введите второе число: ");
            secondNumber = in.nextInt();

            switch (command) {
                case '1':
                    System.out.println("Результат умножения: " + (firstNumber * secondNumber)); break;
                case '2':
                    try {
                        System.out.println("Результат деления: " + (firstNumber / secondNumber));
                    }  catch (Exception e) {
                        System.out.println("Что-то не правильно с делением");
                    }
                    break;
                case '3':
                    System.out.println("Результат сложения: " + (firstNumber + secondNumber)); break;
                case '4':
                    System.out.println("Результат разности: " + (firstNumber - secondNumber)); break;
                default:
                    System.out.println("Нет такой команды");
            }
//           if (command == '1') {
//               System.out.println("Результат умножения: " + (firstNumber * secondNumber));
//
//           } else if (command == '2') {
//               if (secondNumber == 0) {
//                   System.out.println("Второе число ровно нулю. Деление на ноль запрещено");
//                   continue;
//               }
//              System.out.println("Результат деления: "+(firstNumber/secondNumber));
//           } else if (command == '3') {
//               System.out.println("Результат сложения: "+(firstNumber+secondNumber));
//           } else if (command == '4') {
//               System.out.println("Результат разности: "+(firstNumber-secondNumber));
//           } else if (command == 'q') {
//               System.out.println("Завершение программы ...");
//               break;
//           } else  {
//               System.out.println("Не верно указана операция");
//           }

        }

    }

}
