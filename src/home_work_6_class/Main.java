package home_work_6_class;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Fraction fraction = new Fraction(3, 4);
        fraction.printFraction();
        System.out.println(fraction.sumFraction(2.5));
        System.out.println(fraction.divisionFraction(2.5));
        System.out.println(fraction.multiplicationFraction(2.5));

        System.out.println(); // разделим вывод в консоль пустой строкой.

        Phone phone1 = new Phone(55555, "14 Pro", 100);
        Phone phone2 = new Phone(66666, "SE 2", 80);
        Phone phone3 = new Phone(77777, "12 pro mini", 87);

        phone1.printPhone();
        phone2.printPhone();
        phone3.printPhone();

        phone1.receiveCall("Вася.");
        phone2.receiveCall("Вася.");
        phone3.receiveCall("Вася.");

        phone1.receiveCall("Петя.", 811);
        phone2.receiveCall("Петя.", 812);
        phone3.receiveCall("Петя.", 814);


        int[] listOfPhoneNumbers = new int[(random.nextInt(8) + 1)];
        //int[] listOfPhoneNumbers = new int[9];

        for (int k = 0; k < listOfPhoneNumbers.length; k++) {
            listOfPhoneNumbers[k] = (random.nextInt(8) + 1) * 10000 + (random.nextInt(9999));
        }

        phone1.sendMessage(111,222,333,555,777);
    }
}
