package lesson_15;

import java.util.concurrent.Callable;

//Класс, реализующий интерфейс Callable
class CallableHomeWorkClassSumLine implements Callable<Integer> {
    public int[][] matrix;

    public CallableHomeWorkClassSumLine(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public Integer call() throws Exception {
        int summ = 0;
        int multiplicationOfLine;
        ;
        for (int i = 0; i < matrix.length; i++) {
            multiplicationOfLine = -1;
            for (int k = 0; k < matrix[i].length; k++) {
                if (multiplicationOfLine == -1) {
                    multiplicationOfLine = matrix[i][k];
                } else {
                    multiplicationOfLine = multiplicationOfLine * matrix[i][k];
                }
            }
            summ = summ + multiplicationOfLine;
        }

        return Integer.valueOf(summ);
    }
}
