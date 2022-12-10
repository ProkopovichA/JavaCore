package lesson_18_producer_consumer_exchnger.producer_consumer_synchronized;

public class App {
    public static void main(String[] args) {
        Buffer store = new Buffer();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
