package lesson_18_producer_consumer_exchnger.producer_consumer_semaphore.option_1;

public class Buffer {
    private int messageCount = 0;

    public void get() {
//        while (messageCount < 1) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        if (messageCount > 0) {
            messageCount--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товар на складе: " + messageCount);
            //notifyAll();
        }
    }

    public void put() {
//        while (messageCount >= 3) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        if (messageCount <= 3) {
            messageCount++;
            System.out.println("Производитель добавил 1 товар");
            System.out.println("Товар на складе: " + messageCount);
            //notifyAll();
        }
    }
}
