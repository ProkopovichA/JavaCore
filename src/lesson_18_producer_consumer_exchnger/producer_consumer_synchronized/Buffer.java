package lesson_18_producer_consumer_exchnger.producer_consumer_synchronized;

public class Buffer {
    private int messageCount = 0;
    public synchronized void get() {
        while (messageCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        messageCount--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товар на складе: " + messageCount);
        notifyAll();
    }

    public synchronized void put() {
        while (messageCount >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        messageCount++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товар на складе: " + messageCount);
        notifyAll();
    }
}
