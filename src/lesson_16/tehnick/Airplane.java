package lesson_16.tehnick;

import lesson_16.Printable;

public class Airplane extends FlyingMachines implements Printable {

    private int fuelСonsumption;
    private int fuelLevel;
    private int takeOfDistance;

    public Airplane(String name, int spaciousness, int loadCapacity, int rangeOfFlight, int fuelСonsumption) {
        super(name, spaciousness, loadCapacity, rangeOfFlight);
        this.fuelСonsumption = fuelСonsumption;
        this.fuelLevel = 100;
    }

    public void refuel() {
        fuelLevel = 100;
        System.out.println("Самолет заправлен: " + name);
    }

    public void runAFlight() {
        if (fuelLevel < fuelСonsumption) {
            System.out.println("Не достаточно топлива для полета, самолет отправлен на заправку: " + name);
            refuel();
        } else {
            fuelLevel = fuelLevel - fuelСonsumption;
            System.out.println("Cамолет выполнил задание: " + name);
        }
    }

    @Override
    public void Print() {
        System.err.println("Самолет: " + this.name + " вместимость: " + this.spaciousness);
    }
}


