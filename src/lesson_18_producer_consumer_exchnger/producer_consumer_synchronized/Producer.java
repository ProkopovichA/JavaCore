package lesson_18_producer_consumer_exchnger.producer_consumer_synchronized;

public class Producer implements Runnable {
    Buffer store;

    public Producer(Buffer store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 10; i++) {
            store.put();
            System.out.println("Производитель " + Thread.currentThread().getName() + " добавил товар");
        }
    }
}
