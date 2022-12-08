package lesson_7;

public class Park {

    private Transport[] transports = new Transport[2];

    public void startWork() {

        transports[0] = new Bus(777);
        transports[1] = new Car(171);

        for (int i = 0; i < 10; i++) {
            for (Transport transport : transports) {
                if (transport.isReadyForWork()) {
                    transport.goWork();
                } else {
                    transport.doService();
                }
                transport.wash();
                if (transport instanceof Car) {
                    ((Car) transport).someMethod();
                }
            }
        }


    }
}
