package lesson_11;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private int targetNumber;
    private int previousNumber;


    public Game() {
        Random random = new Random();
        this.targetNumber = random.nextInt(99) + 1;
    }

    private boolean checkNumber() throws SillyChoseException {
        int currentNumber;
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число от 1 до 100 или 9999 для выхода: ");
            currentNumber = in.nextInt();

//        } catch (SillyChoseException e) {
//            System.out.println(e.getMessage());
//            return false;
        } catch (Exception e) {
            System.out.println("Не верный ввод, введите число");
            return false;
        }
        if (((currentNumber < 1) || (currentNumber > 100) && !(currentNumber == 9999))) {
            throw new SillyChoseException("Число должно быть от 1 до 100");
        }



        if (currentNumber == 9999) {
            System.out.println("Выход из игры");
            return true;
        } else if (targetNumber == currentNumber) {
            System.out.println("Вы угадали! Поздравляем! ");
            return true;
        } else if (targetNumber > currentNumber) {
            System.out.println("Больше");
            return false;
        } else {
            System.out.println("Меньше");
            return false;
        }

    }


    public void startGame() {
        try {
            while (!checkNumber()) {
                System.out.println("Попробуйте еще раз...");
            }
        } catch (SillyChoseException e) {
            System.out.println(e.getMessage());
        }

    }

}
