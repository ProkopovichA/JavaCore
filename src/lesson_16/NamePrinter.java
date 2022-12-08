package lesson_16;

public class NamePrinter<T> {
    private T sameObject;

    public NamePrinter(T sameObject) {
        this.sameObject = sameObject;
    }

    public static void Print() {
      //  System.out.println(sameObject.PrintObject());
    }

}
