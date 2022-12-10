package lesson_06;

public class Cat {
    private String nameCat;
    private int ageCat;

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public int getAgeCat() {
        return ageCat;
    }

    public void setAgeCat(int ageCat) {
        this.ageCat = ageCat;
    }

    public void sayMau() {
        System.out.println("Мяу.");
    }

    public Cat() {}

    public Cat(String nameCat, int ageCat) {
        this.nameCat = nameCat;
        this.ageCat = ageCat;
    }

}
