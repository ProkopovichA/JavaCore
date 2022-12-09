package home_work_07_inheritance.exercise_1;

public class Student extends Man {
    private int yearOfStudy;

    public Student() {
    }

    public Student(String name, String gender, int age, int weiding) {
        super(name, gender, age, weiding);
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void addYearOfStudy() {
        this.yearOfStudy++;
    }
}
