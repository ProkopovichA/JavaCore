package lesson_7;

//public class Bus implements Transport {
public class Bus extends Transport {


    public Bus(int etxNumber) {
        super(etxNumber);
    }

    @Override
    public boolean isReadyForWork() {
        return tasksDone < 5;
    }

    @Override
    public void goWork() {
        System.out.println("Автобус выехал на задание");
        tasksDone++;
        Utils.sleep(1);
    }

    @Override
    public void doService() {
        System.out.println("Автобус на сервисе");
        Utils.sleep(10);
        tasksDone = 0;
        System.out.println("Автобус прошел сервис");
    }

    @Override
    public void wash() {
        System.out.println("Автобус помыт №" + number);
    }
}
