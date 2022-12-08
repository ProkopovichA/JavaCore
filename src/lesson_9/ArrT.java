package lesson_9;

import java.util.Iterator;

public class ArrT<T> implements Iterator {

    public T[] arr;
    private int currentIndex;



    public ArrT(T[] arr) {
        this.arr = arr;

    }

    public T getArrT(int i) {
        return arr[i];
    }

    @Override
    public boolean hasNext() {
        if (currentIndex == arr.length) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return arr[currentIndex++];
    }

    @Override
    public void remove() {

    }

    public void reset() {
        currentIndex = 0;
    }



//    public <T> void addData(T[] arrIn) {
//        int i = 0;
//        for (T j:arrIn) {
//            arr[i] = j;
//            i++;
//        }
//    }

}
