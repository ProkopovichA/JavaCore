package home_work_7_inheritance.exercise_2;

public class Rectangle extends RectangularParallelepiped {
    public int sideC;

    public Rectangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB);
        this.sideC = sideC;
    }
}
