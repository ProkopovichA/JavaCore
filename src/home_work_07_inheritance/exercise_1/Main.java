package home_work_07_inheritance.exercise_1;

public class Main {
    public static void main(String[] args) {
        Man someman = new Man("Pol", "Man", 28, 65);
        System.out.println("Имя: " + someman.getName() + " возраст: " + someman.getAge() + " вес: " + someman.getWeiding());
        someman.setAge(29);
        someman.setWeiding(66);
        someman.setName("Paul");
        System.out.println("Имя: " + someman.getName() + " возраст: " + someman.getAge() + " вес: " + someman.getWeiding());

        Student someStudent = new Student("Max", "Man", 17, 22);
        System.out.println("Имя: " + someStudent.getName() + " возраст: " + someStudent.getAge() + " вес: " + someStudent.getWeiding());
        someStudent.setYearOfStudy(2);
        System.out.println("Количество лет обучения: " + someStudent.getYearOfStudy());
        someStudent.addYearOfStudy();
        System.out.println("Количество лет обучения: " + someStudent.getYearOfStudy());

    }
}
