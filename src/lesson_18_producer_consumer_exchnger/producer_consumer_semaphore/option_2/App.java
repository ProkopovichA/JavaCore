package lesson_18_producer_consumer_exchnger.producer_consumer_semaphore.option_2;

import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1, true);

        Buffer store = new Buffer(semaphore);
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
