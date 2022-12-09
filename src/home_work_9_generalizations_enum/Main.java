package home_work_9_generalizations_enum;

public class Main {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(1, 2);
        System.out.println(pair.first());
        System.out.println(pair.last());
        pair.swap();
        System.out.println(pair.first());
        System.out.println(pair.last());
        pair.replaceFirst(3);
        pair.replaceFirst(4);
        System.out.println(pair.first());
        System.out.println(pair.last());

        int myArrInt[][] = new int[3][3];
        int counter = 1;
        for (int i = 0; i < myArrInt.length; i++) {
            for (int k = 0; k < myArrInt[i].length; k++) {
                myArrInt[i][k] = counter++;
            }
        }

        TwoDimArr twoDimArr = new TwoDimArr(myArrInt);
        twoDimArr.printArr();
        System.out.println("");

        while (twoDimArr.hasNext()) {
            System.out.println(twoDimArr.next());
        }
        System.out.println();

        Food[] menu = new Food[6];
        menu[0] = new HomeFood("Пельмени", FoodType.MEAT);
        menu[1] = new HomeFood("Гречка", FoodType.VEGETABLE);
        menu[2] = new HomeFood("Салат", FoodType.VEGETABLE);
        menu[3] = new HomeFood("Курица", FoodType.MEAT);
        menu[4] = new StreetFood("Картошка фри", FoodType.VEGETABLE);
        menu[5] = new StreetFood("Фишбургер", FoodType.FISH);

        for (Food foods : menu) {
            System.out.println(foods.getName());
        }

        menu[2].setName("Салат с овощами");
        System.out.println("");

        for (Food foods : menu) {
            System.out.println(foods.getName());
        }

        System.out.println();


        if (VegetarianChecker.isVegetarian(menu)) {
            System.out.println("Меню является вегетарианским. ");
        } else {
            System.out.println("Меню не является вегетарианским. ");
        }


    }
}
