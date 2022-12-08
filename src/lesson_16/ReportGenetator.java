package lesson_16;

import lesson_16.tehnick.FlyingMachines;
import lesson_16.workers.Worker;

public class ReportGenetator {

    public static void generateReport(Reportable r) {
        System.out.println("Отчет: " + r.getReport());
    }


}
