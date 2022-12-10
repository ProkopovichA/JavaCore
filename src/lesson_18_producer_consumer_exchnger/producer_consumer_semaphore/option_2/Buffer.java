package lesson_18_producer_consumer_exchnger.producer_consumer_semaphore.option_2;

import java.util.concurrent.Semaphore;

public class Buffer {
    private int messageCount = 0;
    private Semaphore semaphore;

    public Buffer(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void get() {
        try {
            semaphore.acquire();

            if (messageCount > 0) {
                messageCount--;
                System.out.println("Покупатель купил 1 товар");
                System.out.println("Товар на складе: " + messageCount);
            }

            semaphore.release();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void put() {
        try {
            semaphore.acquire();

            if (messageCount <= 3) {
                messageCount++;
                System.out.println("Производитель добавил 1 товар");
                System.out.println("Товар на складе: " + messageCount);
            }

            semaphore.release();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
