package lesson_16_inheritance_repeat.workers;

import lesson_16_inheritance_repeat.Printable;
import lesson_16_inheritance_repeat.Reportable;

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
