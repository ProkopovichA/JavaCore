package lesson_16.workers;

public class OfficeWorker extends Worker{
    public void  doWork(String taskDescription) {
        System.out.printf("Paботник делает %s",taskDescription);
    }

    public String getReport() {
        return  "Name: "+getName()+" зарплата: "+getSalary();
    }
 }
