package home_work_7.exercise_1;

public class Man {
    private String name;
    private String gender;
    private int age;
    private int weiding;

    public Man() {
    }

    public Man(String name, String gender, int age, int weiding) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weiding = weiding;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeiding(int weiding) {
        this.weiding = weiding;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getWeiding() {
        return weiding;
    }
}
