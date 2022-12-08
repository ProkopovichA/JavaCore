package lesson_16;

import lesson_16.tehnick.Airplane;
import lesson_16.tehnick.FlyingMachines;
import lesson_16.tehnick.Helicopter;
import lesson_16.tehnick.Quadcopter;
import lesson_16.workers.Manager;
import lesson_16.workers.OfficeWorker;
import lesson_16.workers.Worker;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private  List<FlyingMachines>  airport = new ArrayList<>();
    private  List<Worker> workers = new ArrayList<>();

    public Airline() {

        airport.add(new Airplane("Boeing 1", 700, 800, 700, 50));
        airport.add(new Airplane("Boeing 2", 800, 900, 550, 50));
        airport.add(new Airplane("Antonov An-22", 2000, 3000, 5225, 50));
        airport.add(new Helicopter("Helicopter 1", 50, 100, 200, 30));
        airport.add(new Helicopter("Helicopter 2", 70, 150, 220, 30));
        airport.add(new Quadcopter("Quadcopter", 5, 5, 100, 60, 30));

        workers.add(new OfficeWorker());
        workers.add(new Manager());

    }

    public void PrintAirLine() {


        // NamePrinter namePrinter = new Ma
    }

    public void startWork() {

        for (int i = 0; i < 20; i++) {
            for (FlyingMachines fm : airport) {
                fm.runAFlight();
            }
        }
    }

    public void generateReports() {
        airport.forEach(t -> ReportGenetator.generateReport(t));
        //airport.forEach(ReportGenetator::generateReport);
        workers.forEach(ReportGenetator::generateReport);
    }

    public void printAll() {
        workers.forEach(Printer::print);
        airport.forEach(Printer::print);
    }
}


