package lesson_13;

public class Main {
    public static void main(String[] args) {

//        Thread t = Thread.currentThread();
//        System.out.println(t.getName());
//        t.setName("hello");
//        System.out.println(t.getName());

//        Thread t = Thread.currentThread();
//        System.out.println(t.getName());
//        t.setName("hello");
//        System.out.println(t.getName());

        System.out.println("Main thread started...");
//        for (int i=1; i < 6; i++) {
//            new JThread("JThread " + i,i+5).start();
//
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }

        JThread jThread = new JThread("JThread ");
        jThread.start();

        System.out.println("isAlive: " + jThread.isAlive());
        System.out.println("isInterrupted: " + jThread.isInterrupted());

        jThread.interrupt();

//        try {
//            jThread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("isAlive: " + jThread.isAlive());
        System.out.println("isInterrupted: " + jThread.isInterrupted());

        System.out.println("Main thread finished...");

    }
}
