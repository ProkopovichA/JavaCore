package lesson_18_producer_consumer_exchnger.exchnger;

import java.util.concurrent.Exchanger;

public class Thread2 implements Runnable{
    Exchanger<String> exchanger;

    public Thread2(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    public void run() {
        Thread.currentThread().setName("hello_thread");
        try {
            String massage = exchanger.exchange("Hello");
            System.out.println(Thread.currentThread().getName() +" получил сообщение " + massage);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
