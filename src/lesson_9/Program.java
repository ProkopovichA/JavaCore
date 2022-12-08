package lesson_9;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
//        Account<Integer> acc1 = new Account<>(2334,5000);
//        int acc1Id = (int)acc1.getId();
//        System.out.println(acc1Id);
//
//        Account<String> acc2 = new Account<>("sid5523",5000);
//        String acc2Id = acc2.getId();
//        System.out.println(acc2Id);

//        Printer printer = new Printer();
//        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
//        System.out.println(printer.<Integer>print(numbers));
//
//        Day monday = Day.MONDAY;
//        Day sunday = Day.SUNDAY;
//
//        System.out.println(monday.isWorkingDay());
//        System.out.println(sunday.isWorkingDay());

//        int[] intArr = new int[3];
//        intArr[0] = 1;
//        intArr[1] = 2;
//        intArr[2] = 3;

        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};

        ArrT<Integer> arrT = new ArrT<>(numbers);

        System.out.println(arrT.getArrT(2));

        while (arrT.hasNext()) {
            System.out.println(arrT.next());
        }

        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.println(arrT.next());
        }
        arrT.remove();
        System.out.println();

        arrT.reset();
//        while (arrT.hasNext()) {
//            System.out.println(arrT.next());
//        }

        Arrays.toString(arrT.arr);




    }
}
