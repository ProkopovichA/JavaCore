package lesson_17_lombok_builred;


import lombok.Data;

@Data
//@Builder
public class Car {

    private String name;
    private int engineVolume;
    private String type;
    private int seats;
    private String color;
    private int maxSpeed;
}
