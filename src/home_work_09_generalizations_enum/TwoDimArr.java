package home_work_09_generalizations_enum;

import java.util.Iterator;

public class TwoDimArr implements Iterator {
    private int[][] arr;
    private int currentIndexI;
    private int currentIndexJ;
    private boolean arrNotIsEnd;

    public TwoDimArr(int[][] arr) {
        this.arr = arr;
        this.currentIndexI = 0;
        this.currentIndexJ = 0;
        arrNotIsEnd = true;
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                System.out.printf(" %2d ", arr[i][k]);
            }
            System.out.println();
        }
    }

    @Override
    public boolean hasNext() {
        return arrNotIsEnd;
    }

    @Override
    public Object next() {
        int currentValue;
        currentValue = arr[currentIndexI][currentIndexJ];
        currentIndexJ++;
        if (currentIndexJ == arr[currentIndexI].length) {
            currentIndexJ = 0;
            currentIndexI++;
        }
        if (currentIndexI == arr.length) {
            arrNotIsEnd = false;
        }
        return currentValue;
    }
}
