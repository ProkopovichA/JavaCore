package lesson_15_thread_executor_callable_semaphore;

import java.util.concurrent.Callable;

class CallableHomeWorkClassSumRoad implements Callable<Integer> {
    public int[][] matrix;

    public CallableHomeWorkClassSumRoad(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public Integer call() throws Exception {
        int summ = 0;
        int multiplication;
        int lineLength = matrix.length;
        int roadLength = matrix[1].length ;


        for (int i = 0; i < roadLength; i++) {
            multiplication = -1;
            for (int k = 0; k < lineLength; k++) {
                if (multiplication == -1) {
                    multiplication = matrix[i][k];
                } else {
                    multiplication = multiplication * matrix[i][k];
                }
            }
            summ = summ + multiplication+1;
        }

        return Integer.valueOf(summ);
    }
}