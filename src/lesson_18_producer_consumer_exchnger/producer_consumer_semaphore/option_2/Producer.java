package lesson_18_producer_consumer_exchnger.producer_consumer_semaphore.option_2;

public class Producer implements Runnable {
    Buffer store;

    public Producer(Buffer store) {
        this.store = store;

    }

    public void run() {
        for (int i = 1; i < 10; i++) {
            store.put();
        }
    }
}
