package lesson_18_producer_consumer_exchnger.exchnger;

import java.util.concurrent.Exchanger;

public class Program {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Thread(new Thread1(exchanger)).start();
        new Thread(new Thread2(exchanger)).start();
    }
}
