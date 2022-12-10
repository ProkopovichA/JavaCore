package lesson_18_producer_consumer_exchnger.exchnger;

import java.util.concurrent.Exchanger;

public class Thread1 implements Runnable{
    Exchanger<String> exchanger;

    public Thread1(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    public void run() {
        Thread.currentThread().setName("hi_thread");
        try {
            String massage = exchanger.exchange("Hi");
            System.out.println(Thread.currentThread().getName() +" получил сообщение " + massage);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
