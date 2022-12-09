package home_work_6_class;

public class Fraction {
    //1. Создайте класс с именем fraction, содержащий два поля типа
    //int - числитель и знаменатель обыкновенной дроби.

    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void printFraction() {
        System.out.printf("%d/%d\n", numerator, denominator);
    }

    public double sumFraction(double extDouble) {
        System.out.println("Добавляем к дроби: " + extDouble);
        return ((double) this.numerator / this.denominator) + extDouble;
    }

    public double multiplicationFraction(double extDouble) {
        System.out.println("Умножаем дробь на: " + extDouble);
        return ((double) this.numerator / this.denominator) * extDouble;
    }

    public double divisionFraction(double extDouble) {
        System.out.println("Делим дробь на: " + extDouble);
        if (extDouble == 0) {
            System.out.println("На ноль делить нельзя");
            return 0;
        }
        return ((double) this.numerator / this.denominator) / extDouble;
    }


}
