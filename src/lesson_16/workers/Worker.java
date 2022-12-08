package lesson_16.workers;

import lesson_16.Printable;
import lesson_16.Reportable;

public abstract class Worker implements Reportable, Printable {
    private String name;
    private double salary;

    @Override
    public void Print() {
        System.out.println("Name: " + name + "salary: " + salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


}
