package home_work_07_inheritance.exercise_2;

public class RectangularParallelepiped extends Cube {
    public int sideB;

    public RectangularParallelepiped() {
    }

    public RectangularParallelepiped(int sideA, int sideB) {
        super(sideA);
        this.sideB = sideB;
    }


}
