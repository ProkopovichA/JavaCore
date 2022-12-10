package lesson_02;

public class Lesson2 {
    public static void main(String[] args) {
        long x = 9L;
        if (x % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }

        if (x < 20) {
            if (x > 10) {
                System.out.println("больше 10 и меньше 20");
            } else {
                System.out.println("меньше 11");
            }
        } else {
            System.out.println("больше 19");
        }

        int n = 8;

        if (n == 1) {
            System.out.println("Понедельник");
        } else if (n == 2) {
            System.out.println("Вторник");
        } else if (n == 3) {
            System.out.println("Среда");
        } else if (n == 4) {
            System.out.println("Четверг");
        } else if (n == 5) {
            System.out.println("Пятница");
        } else if (n == 6) {
            System.out.println("Суббота");
        } else if (n == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Дня с таким номером нет сущесвует");
        }

        switch (n) {
            case 1:
                System.out.println("Понедельник"); break;
            case 2:
                System.out.println("Вторник");break;
            case 3:
                System.out.println("Среда");break;
            case 4:
                System.out.println("Четверг");break;
            case 5:
                System.out.println("Пятница");break;
            case 6:
                System.out.println("Суббота");break;
            case 7:
                System.out.println("Воскресенье");break;
            default:
                System.out.println("Нет такого дня");
        }

    }
}
