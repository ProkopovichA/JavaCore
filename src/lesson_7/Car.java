package lesson_7;

//public class Car implements Transport{
public class Car extends Transport{


    public Car(int etxNumber) {
        super(etxNumber);
    }

    @Override
    public boolean isReadyForWork() {
        return tasksDone < 5;
    }

    @Override
    public void goWork() {

    }

    @Override
    public void doService() {
        System.out.println("Автомобиль на сервисе");
        Utils.sleep(3);
        tasksDone = 0;
        System.out.println("Автомобиль прошел сервисное обслуживание");
    }

    public void someMethod() {

    }
}
