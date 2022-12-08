package lesson_12;

import java.io.Serializable;

public class Employee implements Serializable {
    private String firstName;
    private String lastName;
    private Integer age;



    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "firstName:"+firstName+"; lastName:"+lastName+"; age:"+age+";";
    }


}
