package lesson_09;

public class Printer {

    public <T> T print(T[] items){
        for (T item: items) {
            System.out.println(item);
        }
        return items[0];
    }

}
