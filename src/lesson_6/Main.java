package lesson_6;

public class Main {
    public static void main(String[] args) {
        String colorBlack = "black";
        String colorRed = "red";
        String colorGreen = "green";


        Car myFirstCar;
        myFirstCar = new Car();

        myFirstCar.setManufacturer("BMW");
        myFirstCar.setEngineVolume(3);
        myFirstCar.paint("red");
        myFirstCar.printCar();

        //proglib.in

        Car bigGreenFord = new Car();
        bigGreenFord.setManufacturer("Ford");
        bigGreenFord.setEngineVolume(6);
        bigGreenFord.paint(colorGreen);
        myFirstCar.printCar();

        Cat myCat = new Cat();
        myCat.setAgeCat(11);
        myCat.setNameCat("Tom");
        System.out.println(myCat.getAgeCat());
        System.out.println(myCat.getNameCat());
        myCat.sayMau();
        System.out.println();

        Cat mySecondCat = new Cat("Jimmy",8);
        System.out.println(mySecondCat.getAgeCat());
        System.out.println(mySecondCat.getNameCat());


    }
}