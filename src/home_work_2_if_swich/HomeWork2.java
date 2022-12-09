package home_work_2_if_swich;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        //1. Напишите программу, которая будет переводить секунды в форматированный вид - часы минуты секунды учитывая окончания слов
        //Пример:
        //1249
        //20 минут 49 секунд
        //648958
        //180 часов 15 минут 58 секунд
        //Добавьте 3 строчку, которая будет выводить недели, сутки, часы минуты и секунды

        int secondStart = 648953;
        int second = secondStart;
        int minute = 0;
        int hour   = 0;
        int day    = 0;
        int week   = 0;
        int divisionRemainder = 0;

        second = secondStart % 60;
        minute = secondStart / 60;
        hour   = minute / 60;
        minute = minute % 60;
        day = hour / 24;
        hour = hour % 24;
        week = day / 7;
        day = day % 7;

        System.out.println("1. Начальное количество секунд: "+secondStart);
        //System.out.printf("%d %d %d %d %d \n",second,minute,hour,day,week);

        //секунды
        divisionRemainder = second % 10;
        if ((5 <= second) & (second <= 20)) {
            System.out.printf("%d секунд", second);
        } else if (divisionRemainder == 1) {
            System.out.printf("%d секунда", second);
        } else if ((2 <= divisionRemainder) & (divisionRemainder <=4)) {
            System.out.printf("%d секунды", second);
        } else {
            System.out.printf("%d секунд", second);
        }

        //Минуты
        divisionRemainder = minute % 10;
        if ((5 <= minute) & (minute <= 20)) {
            System.out.printf(" %d минут", minute);
        } else if (divisionRemainder == 1) {
            System.out.printf(" %d минута", minute);
        } else if ((2 <= divisionRemainder) & (divisionRemainder <=4)) {
            System.out.printf(" %d минуты", minute);
        } else {
            System.out.printf(" %d минут", minute);
        }

        //часы
        divisionRemainder = hour % 10;
        if ((5 <= hour) & (hour <= 20)) {
            System.out.printf(" %d часов", hour);
        } else if (divisionRemainder == 1) {
            System.out.printf(" %d час", hour);
        } else if ((2 <= divisionRemainder) & (divisionRemainder <=4)) {
            System.out.printf(" %d часа", hour);
        } else {
            System.out.printf(" %d часов", hour);
        }

        //дни
        divisionRemainder = day % 10;
        if ((5 <= day) & (day <= 20)) {
            System.out.printf(" %d дней", day);
        } else if (divisionRemainder == 1) {
            System.out.printf(" %d день", day);
        } else if ((2 <= divisionRemainder) & (divisionRemainder <=4)) {
            System.out.printf(" %d дня", day);
        } else {
            System.out.printf(" %d дней", day);
        }

        //недели
        divisionRemainder = week % 10;
        if ((5 <= week) & (week <= 20)) {
            System.out.printf(" %d недель",week);
        } else if (divisionRemainder == 1) {
            System.out.printf(" %d неделя", week);
        } else if ((2 <= divisionRemainder) & (divisionRemainder <=4)) {
            System.out.printf(" %d недели", week);
        } else {
            System.out.printf(" %d недель", week);
        }

        System.out.print("\n \n");

        //---------------------------------------------------------
        //2. Напишите программу расчета даты следующего дня введя 3 числа - день месяц и год
        //Пример:
        //15
        //3
        //2000
        //16 3 2000

        //int day = 0; //переменная уже есть в первом задании по этому инициализировать не буду
        day = 0;
        int month = 0;
        int year = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер дня: ");
        day = in.nextInt();
        System.out.print("Введите номер месяца: ");
        month = in.nextInt();
        System.out.print("Введите номер года: ");
        year = in.nextInt();

        System.out.printf("2. Начальная дата %d.%d.%d\n",day,month,year);
        day++;
        if (29 <= day) {
            switch (month) {
                case 2:
                    day = 1;
                    month++;
                    break;
                case 4, 6, 7, 9:
                    if (31 <= day) {
                        day = day - 30;
                        month++;
                    }
                    break;
                default:
                    if (32 <= day) {
                        day = day - 31;
                        month++;
                    }
            }
        }

        if (month > 12) {
            month = 1;
            year++;
        }
        System.out.printf("Следующая дата %2d.%2d.%d\n\n",day,month,year);

        //---------------------------------------------------------
        //3. На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
        // оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800»
        // (т.е. остаётся 8 часов), когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда
        // наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
        //Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
        // Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные
        // фразы с информацией о том, сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов»,
        // «осталось 4 часа», «остался 1 час», «осталось менее часа».
        //Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
        // далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна выводиться
        // фраза о количестве полных часов, содержащихся в n секундах.
        //Пример:
        //23466
        //Осталось 6 часов

        int n = 23466;
        System.out.printf("3. Число в секундах %d\n",n);
        n = n % 60;
        n = n % 60;
        System.out.printf("Осталось %d часов\n\n",n);

        //---------------------------------------------------------
        //4. Найти среднее число из трех, введенных с клавиатуры


        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;

        //Scanner in = new Scanner(System.in); //инициализация была выше
        System.out.print("Введите первое число: ");
        firstNumber = in.nextInt();
        System.out.print("Введите второе число: ");
        secondNumber = in.nextInt();
        System.out.print("Введите третье число: ");
        thirdNumber = in.nextInt();

        System.out.print("4. Среднее число ");

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                if (secondNumber > thirdNumber) {
                    System.out.print(secondNumber);
                } else {
                    System.out.print(thirdNumber);
                }
            } else {
                System.out.print(firstNumber);
            }
        } else {
            if (secondNumber > thirdNumber) {
                if (firstNumber > thirdNumber) {
                    System.out.print(firstNumber);
                } else {
                    System.out.print(thirdNumber);
                }
            } else {
                System.out.print(secondNumber);
            }
        }
        System.out.printf("\n\n");

        //---------------------------------------------------------
        //5. Создать программу, которая будет находить вещественные корни квадратного уравнения ax²+bx+c=0,
        // либо сообщать, что корней нет.
        float a = 8;
        float b = 4;
        float c = 55;

        System.out.printf("5. Начальные переменные a = %f, b = %f,c = %f\n",a,b,c);

        double d=(b*b)-(4*a*c);
        float e=0;
        float f=0;
        if(d==0){
            e=-1*(b/(2*a));
            System.out.println("Есть 1 корень: "+e);
        }
        else {
            if(d>0){
                e=((-1*b)+(float)Math.sqrt(d))/(2*a);
                f=((-1*b)-(float)Math.sqrt(d))/(2*a);
                System.out.println("Есть 2  корня: "+e+" и " +f);
            }
            else {
                System.out.println("Нет корней");
            }
        }
        System.out.printf("\n");

        //---------------------------------------------------------
        //6. Определить принадлежность точки кругу
        double x1 = 2;
        double y1 = 3;
        double r_circle= 3;
        double hypotenuse = 0;

        hypotenuse = Math.sqrt((x1 * x1) + (y1 * y1));

        if (hypotenuse <= r_circle) {
            System.out.println("6. Координаты точки (" + x1 + "," + y1 + ") точка принаджежит кругу.");
        } else{
            System.out.println("6. Координаты точки (" + x1 + "," + y1 + ") точка принаджежит кругу.");
        }
        System.out.printf("\n");

        //---------------------------------------------------------
        //7. Определить является ли целое число чётным либо нечётным
        int myNumber = 3;

        System.out.println("7. Надо оперделить является ли число " + myNumber + " чётным либо нечётным");
        if (myNumber % 2 == 0) {
            System.out.println("Число " + myNumber + " является четным");
        } else {
            System.out.println("Число " + myNumber + " является не четным");
        }
        System.out.printf("\n");

        //---------------------------------------------------------
        //8. По порядковому номеру пальца руки необходимо вывести его название на экран.
        int fingerNumber = 4;

        System.out.println("8. Порядковый номер пальца " + fingerNumber);
        switch (fingerNumber) {
            case 1:
                System.out.println("Большой"); break;
            case 2:
                System.out.println("Указательный"); break;
            case 3:
                System.out.println("Средний"); break;
            case 4:
                System.out.println("Безимянный"); break;
            case 5:
                System.out.println("Мизинец"); break;
            default:
                System.out.println("У человека всего пять пальцев");
        }
        System.out.printf("\n");

        //---------------------------------------------------------
        // 9. По порядковому номеру дня недели необходимо вывести его название на экран.
        int dayNumber = 6;

        System.out.println("9. Порядковый номер дня недели " + dayNumber);
        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник"); break;
            case 2:
                System.out.println("Вторник"); break;
            case 3:
                System.out.println("Среда"); break;
            case 4:
                System.out.println("Четверг"); break;
            case 5:
                System.out.println("Пятница"); break;
            case 6:
                System.out.println("Суббота"); break;
            case 7:
                System.out.println("Воскресенье"); break;
            default:
                System.out.println("Нет такого дня");
        }
    }
}
