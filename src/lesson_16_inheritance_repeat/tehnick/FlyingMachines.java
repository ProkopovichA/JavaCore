package lesson_16_inheritance_repeat.tehnick;

import lesson_16_inheritance_repeat.Printable;
import lesson_16_inheritance_repeat.Reportable;

public abstract class FlyingMachines  implements Reportable, Printable {
    public String name;
    public int spaciousness;
    public int loadCapacity;
    public int rangeOfFlight;

    public FlyingMachines(String name, int spaciousness, int loadCapacity, int rangeOfFlight) {
        this.name = name;
        this.spaciousness = spaciousness;
        this.loadCapacity = loadCapacity;
        this.rangeOfFlight = rangeOfFlight;
    }

    public void runAFlight() {

    }

    public String getReport() {
        return  "Name: "+name+" вместимость: "+spaciousness;
    }

}
