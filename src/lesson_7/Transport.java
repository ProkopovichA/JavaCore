package lesson_7;

public abstract class Transport {
    protected int tasksDone = 0;
    protected int number;

    public Transport(int etxNumber) {
        this.number = etxNumber;
    }

    public abstract boolean isReadyForWork();

    public abstract void goWork();

    public abstract void doService();

    public void wash() {
        System.out.println("Транспорт помыт №" + number);
    }

}

//public interface Transport {
//    boolean isReadyForWork();
//
//    void goWork();
//
//    void doService();
//
//    default void wash() {
//        System.out.println("Транспорт помыт");
//    }
//
//}
