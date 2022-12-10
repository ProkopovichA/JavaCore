package lesson_18_producer_consumer_exchnger.producer_consumer_semaphore.option_1;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    Buffer buffer;
    Semaphore semaphore;

    public Consumer(Buffer store, Semaphore semaphore) {
        this.buffer = store;
        this.semaphore = semaphore;
    }

    public void run() {

        for (int i = 1; i < 10; i++) {
            try {
                semaphore.acquire();

                buffer.get();

                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
