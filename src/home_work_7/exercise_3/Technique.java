package home_work_7.exercise_3;

public class Technique {
    private boolean pluggedIn;
    public int power;
    public String deviceName;

    public Technique() {
    }

    public Technique(String deviceName, int power) {
        this.pluggedIn = false;
        this.power = power;
        this.deviceName = deviceName;
    }

    public void plugIn() {
        if (this.pluggedIn) {
            System.out.println("Прибор " + deviceName + " уже включен в розетку.");
        } else {
            this.pluggedIn = true;
            System.out.println("Прибор " + deviceName + " включен в розетку.");
        }
    }

    public void unPlug() {
        if (this.pluggedIn) {
            this.pluggedIn = false;
            System.out.println("Прибор " + deviceName + " выключен из розетки.");
        } else {
            System.out.println("Прибор " + deviceName + " уже включен из розетки.");
        }
    }

    public int сalculatePower() {
        if (this.pluggedIn) {
            return power;
        } else {
            return 0;
        }
    }


}
