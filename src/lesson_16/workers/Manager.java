package lesson_16.workers;

public class Manager extends Worker {
    public void checkWorkerWork(String workerName) {
        System.out.printf("Менеджер приступил к проверке работы: %s",workerName);
    }

    public String getReport() {
        return  "Name: "+getName()+" зарплата: "+getSalary();
    }

}
