package lesson_18_producer_consumer_exchnger.producer_consumer_semaphore.option_1;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    Buffer store;
    Semaphore semaphore;

    public Producer(Buffer store, Semaphore semaphore) {
        this.store = store;
        this.semaphore = semaphore;
    }

    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                semaphore.acquire();

                store.put();

                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
