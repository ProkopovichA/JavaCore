package lesson_16_inheritance_repeat.workers;

public class OfficeWorker extends Worker{
    public void  doWork(String taskDescription) {
        System.out.printf("Paботник делает %s",taskDescription);
    }

    public String getReport() {
        return  "Name: "+getName()+" зарплата: "+getSalary();
    }
 }
