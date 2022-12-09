package lesson_16_inheritance_repeat;

public class Main {
    public static void main(String[] args) {
//        int totalSpaciousness = 0;
//        int totalLoadCapacity = 0;
//
//        FlyingMachines[] airport = new FlyingMachines[6];
//        airport[0] = new Airplane("Boeing 1", 700, 800, 700, 50);
//        airport[1] = new Airplane("Boeing 2", 800, 900, 550, 50);
//        airport[2] = new Airplane("Antonov An-22", 2000, 3000, 5225, 50);
//        airport[3] = new Helicopter("Helicopter 1", 50, 100, 200, 30);
//        airport[4] = new Helicopter("Helicopter 2", 70, 150, 220, 30);
//        airport[5] = new Quadcopter("Quadcopter", 5, 5, 100,60,30);
//
//        for (FlyingMachines flyingMachines : airport) {
//            totalSpaciousness = totalSpaciousness + flyingMachines.spaciousness;
//            totalLoadCapacity = totalLoadCapacity + flyingMachines.loadCapacity;
//        }
//
//        System.out.println("Общая вместительность: " + totalSpaciousness + ", общая грузоподъемность: " + totalLoadCapacity);
//
//        //Сортировка воздушных судов по дальности полета
//        int indexOfArr = -1;
//        int tmp;
//        FlyingMachines tmpFlyingMachine;
//
//        for (int i = 0; i < airport.length; i++) {
//            tmp = airport[i].rangeOfFlight;
//            indexOfArr = -1;
//            //System.out.println(i);
//            for (int j = i; j < airport.length; j++) {
//                if (airport[j].rangeOfFlight < tmp) {
//                    tmp = airport[j].rangeOfFlight;
//                    indexOfArr = j;
//                }
//            }
//            if (indexOfArr != -1) {
//                tmpFlyingMachine = airport[i];
//                airport[i] = airport[indexOfArr];
//                airport[indexOfArr] = tmpFlyingMachine;
//            }
//
//        }
//
//        //Проверка сортировки
//        for (FlyingMachines flyingMachines : airport) {
//            System.out.println(flyingMachines.rangeOfFlight);
//        }
//
//        //найдем воздушное судно с грузоподъемностью больше 130 и дальностью полета больше 500
//        for (FlyingMachines flyingMachines : airport) {
//            if ((flyingMachines.loadCapacity > 130) && (flyingMachines.rangeOfFlight > 500)) {
//                System.out.println("Найдено воздушное судно: " + flyingMachines.name);
//            }
//        }
        Airline airline = new Airline();
        //airline.startWork();
        airline.generateReports();
        airline.printAll();
    }
}
