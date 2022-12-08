package lesson_16.tehnick;

import lesson_16.Printable;

public class Helicopter extends FlyingMachines implements Printable {

    private int fuelСonsumption;
    private int fuelLevel;

    public Helicopter(String name, int spaciousness, int loadCapacity, int rangeOfFlight, int fuelСonsumption) {
        super(name, spaciousness, loadCapacity, rangeOfFlight);
        this.fuelСonsumption = fuelСonsumption;
        this.fuelLevel = 100;
    }

    public void runAFlight() {
        if (fuelLevel < fuelСonsumption) {
            System.out.println("Не достаточно топлива для полета, вертолет отправлен на заправку: " + name);
            refuel();
        } else {
            fuelLevel = fuelLevel - fuelСonsumption;
            System.out.println("Вертолет выполнил задание: " + name);
        }
    }

    public void refuel() {
        fuelLevel = 100;
        System.out.println("Вертолет заправлен: " + name);
    }

    @Override
    public void Print() {
        System.err.println("Вертолет: "+this.name+" вместимость: "+this.spaciousness);
    }

}


