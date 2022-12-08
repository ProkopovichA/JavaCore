package lesson_15;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample {
    public CallableExample() {

        //определяем пул из трех потоков
        ExecutorService executor;
        executor = Executors.newFixedThreadPool(3);

        //Список ассоциированных с Callable задач Future
        List<Future<String>> futures;

        futures = new ArrayList<Future<String>>();

        //Создание экземпляра Callable класса
        Callable<String> callable = new CallableClass();

        for (int i = 0; i < 3; i++) {
            /*
             * Стартуем возвращающий результат исполнения
             * в виде объекта Future поток
             */
            Future<String> future;
            future = executor.submit(callable);
            //Добавляем объект
            futures.add(future);
        }

//        SimpleDateFormat sdf;
//        sdf = new SimpleDateFormat("HH:mm:ss ");

        for (Future<String> future : futures) {
            try {
                String text =  future.get();
                System.out.println(text);
            } catch (InterruptedException | ExecutionException e) {

            }
            //Останавливаем пул потоков
            executor.shutdown();
        }
    }

    //Класс, реализующий интерфейс Callable
    class CallableClass implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(10000);
            //Наименование потока выполняющего
            //callable задачу
            SimpleDateFormat sdf;
            sdf = new SimpleDateFormat("HH:mm:ss ");
            return sdf.format(new Date()) + Thread.currentThread().getName();
        }
    }

    public static void main(String[] args) {
        new CallableExample();
    }

}
