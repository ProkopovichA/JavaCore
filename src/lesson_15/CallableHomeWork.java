package lesson_15;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableHomeWork {
    public int[][] matrix;

    public CallableHomeWork() {
        Integer resultSumOfRoad = 0;
        Integer resultSumOfLine = 0;

        ExecutorService executor;
        executor = Executors.newFixedThreadPool(2);

        //Инициализируем матрицу
        Random random = new Random();
        matrix = new int[3][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = random.nextInt(10);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.printf(" %2d ", matrix[i][k]);
            }
            System.out.println();
        }

        //Создание экземпляра Callable класса
        Callable<Integer> callable1 = new CallableHomeWorkClassSumLine(matrix);
        Callable<Integer> callable2 = new CallableHomeWorkClassSumRoad(matrix);
        Future<Integer> future1;
        future1 = executor.submit(callable1);
        Future<Integer> future2;
        future2 = executor.submit(callable1);


//        SimpleDateFormat sdf;
//        sdf = new SimpleDateFormat("HH:mm:ss ");


        try {
            resultSumOfLine = future1.get();
            resultSumOfRoad = future2.get();

        } catch (InterruptedException | ExecutionException e) {

        }

        if (resultSumOfLine < resultSumOfRoad) {
            System.out.println("Сумма произведения столбцов больше "+resultSumOfLine+" "+resultSumOfRoad);
        } else {
            System.out.println("Сумма произведения строк больше или ровна "+resultSumOfLine+" "+resultSumOfRoad);
        }
        //Останавливаем пул потоков
        executor.shutdown();
    }

}
