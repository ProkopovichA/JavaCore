package home_work_9_generalizations_enum;

public class Pair<T> {
    private T value1;
    private T value2;

    public Pair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T first() {
        return value1;
    }

    public T last() {
        return value2;
    }

    public void swap() {
        T tmp = value1;
        value1 = value2;
        value2 = tmp;
    }

    public void replaceFirst(T value1) {
        this.value1 = value1;
    }

    public void replaceLast(T value2) {
        this.value2 = value2;
    }


}
