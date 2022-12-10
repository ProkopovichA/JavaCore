package lesson_15_thread_executor_callable_semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static final int COUNT_CONTROL_PLACES = 5;
    private static final int COUNT_RIDERS = 7;
    private static boolean[] CONTROL_PLACES = null;

    private static Semaphore SEMAPHORE = null;

    public static class Rider implements Runnable {
        private int ruderNum;

        public Rider(int ruderNum) {
            this.ruderNum = ruderNum;
        }

        @Override
        public void run() {
            System.out.printf("Всaдник %d подошел к зоне контроля\n", ruderNum);
            try {
                // Запрос разрешения
                SEMAPHORE.acquire();
                System.out.printf("\tвсадник %d проверяет наличие свободного контроллера. \n", ruderNum);
                int controlNum = -1;
                //Ищем свободное место
                synchronized (CONTROL_PLACES) {
                    for (int i = 0; i < COUNT_CONTROL_PLACES; i++) {
                        // Есть ли свободные контроллеры?
                        if (CONTROL_PLACES[i]) {
                            CONTROL_PLACES[i] = false;
                            controlNum = i;
                            System.out.printf("\t\tвсадник %d подошел к контроллеру %d. \n", ruderNum, i);
                            break;
                        }
                    }
                }

                Thread.sleep((int) (Math.random() * 10 + 10) * 1000);
                synchronized (CONTROL_PLACES) {
                    CONTROL_PLACES[controlNum] = true;
                }

                SEMAPHORE.release();
                System.out.printf("Всадник %d завершил проверку\n", ruderNum);

            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //определяем количество мест контроля
        CONTROL_PLACES = new boolean[COUNT_CONTROL_PLACES];
        for (int i = 0; i < COUNT_CONTROL_PLACES; i++) {
            CONTROL_PLACES[i] = true;
        }
        //Определяем семафор с количеством разрешений 5 и флаг очередности тру

        SEMAPHORE = new Semaphore(CONTROL_PLACES.length, true);

        //Запускаем всадников
        for (int i = 1; i < COUNT_RIDERS; i++) {
            new Thread(new Rider(i)).start();
            Thread.sleep(400);
        }
    }
}



