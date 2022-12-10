package lesson_18_producer_consumer_exchnger.producer_consumer_semaphore.option_1;

import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1, true);

        Buffer store = new Buffer();
        Producer producer = new Producer(store,semaphore);
        Consumer consumer = new Consumer(store,semaphore);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
