package lesson_6;

public class Car {
    //поля класса
    private String manufacturer;
    private String color;
    private Integer engineVolume;

    public String getManufacturer() {
      return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer =manufacturer;
    }

    public Integer getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Integer engineVolume) {
        this.engineVolume =engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //конструктор
    public Car(String manufacturer, String color, Integer engineVolume) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public Car() {
    }

    //методы
    public void paintWhite() {
        color = "white";
    }

    public void paint(String color) {
        this.color = color;
    }

    public void printCar() {
        System.out.println(manufacturer + "\n" +
                color + "\n"
                + engineVolume + "\n");
    }

}
