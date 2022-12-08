package lesson_16.tehnick;

import lesson_16.Printable;

public class Quadcopter extends FlyingMachines implements Printable {

    private int flightTime;
    private int batteryLevel;
    private int batteryСonsumption;

    public Quadcopter(String name, int spaciousness, int loadCapacity, int rangeOfFlight, int flightTime, int batteryСonsumption) {
        super(name, spaciousness, loadCapacity, rangeOfFlight);
        this.flightTime = flightTime;
        this.batteryLevel = 100;
        this.batteryСonsumption = batteryСonsumption;
    }

    public void runAFlight() {
        if (batteryLevel < batteryСonsumption) {
            System.out.println("Не достаточно заряда для полета, квадрокоптер отправлен на зарядку: " + name);
            charge();
        } else {
            batteryLevel = batteryLevel - batteryСonsumption;
            System.out.println("Квадрокоптер выполнил задание: " + name);
        }
    }

    public void charge() {
        batteryLevel = 100;
        System.out.println("Квадрокоптер заряжен: "+name);
    }

    @Override
    public void Print() {

        System.err.println("Квадрокоптер: "+this.name+" вместимость: "+this.spaciousness);

    }


}
