package lesson_18_producer_consumer_exchnger.producer_consumer_synchronized;

public class Consumer implements Runnable{
    Buffer buffer;

    public Consumer(Buffer store) {
        this.buffer = store;
    }

    public void run() {
        for (int i = 1; i < 10; i++) {
            buffer.get();
        }
    }
}
