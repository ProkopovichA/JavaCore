package home_work_5_arrays;

import java.util.Arrays;
import java.util.Random;

public class HomeWork5 {
    public static void main(String[] args) {
        //1. Найти максимальное значение из массива
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println("Начальный массив: ");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.printf("1. Максимальное значение: %d \n\n", array[array.length - 1]);

        //2. Найти максимальное значение из массива
        System.out.printf("2. Минимальное значение: %d \n\n", array[0]);

        //3. Найти сумму цифр массива
        int sumOfArr = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfArr = sumOfArr + array[i];
        }
        System.out.printf("3. Сумма цифр масива: %d \n\n", array[0]);

        //4. Найти максимальный из элементов массива с четными индексами
        int maxVolume = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("4.Найти максимальный из элементов массива с четными индексами.  Начальный массив: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if ((i % 2) == 0) {
                if (maxVolume < array[i]) {
                    maxVolume = array[i];
                }
            }
        }
        System.out.printf("Результат: %d \n\n", maxVolume);

        //5. Найти минимальный из элементов массива с нечетными индексами
        int minVolume = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i % 2) == 1) {
                if (i == 1) {
                    minVolume = array[i];
                }
                if (minVolume > array[i]) {
                    minVolume = array[i];
                }
            }
        }
        System.out.printf("5. минимальный из элементов массива с нечетными индексами: %d \n\n", minVolume);

        //6. Разложить положительные и отрицательные числа по разным массивам
        int[] bigArray = new int[20];
        int[] positiveArray = new int[20];
        int[] negativeArray = new int[20];
        int negativeCounter = 0;
        int positiveCounter = 0;

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = random.nextInt(20) - 10;
        }
        System.out.println("6. Начальный массив: ");
        System.out.println(Arrays.toString(bigArray));

        for (int i = 0; i < bigArray.length; i++) {
            if (bigArray[i] < 0) {
                negativeArray[negativeCounter] = bigArray[i];
                negativeCounter++;
            } else {
                positiveArray[positiveCounter] = bigArray[i];
                positiveCounter++;
            }
        }

        System.out.println("Массив с положительными числами: ");
        System.out.println(Arrays.toString(positiveArray));
        System.out.println("Массив с отрицательными числами: ");
        System.out.println(Arrays.toString(negativeArray));
        System.out.println();

        //7. Исключить одинаковые элементы массива (каждое значение должно присутствовать в единственном экземпляре)
        //int[] bigArray = new int[20];
        int[] tmpArray = new int[20];
        int searchIndex = 0;
        int finalArraySize = 0;

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = random.nextInt(10);
        }
        System.out.println("7. Начальный массив: ");
        System.out.println(Arrays.toString(bigArray));

        for (int i = 0; i < bigArray.length; i++) {
            searchIndex = -1;
            for (int k = 0; k < tmpArray.length; k++) {
                if (bigArray[i] == tmpArray[k]) {
                    searchIndex = i;
                    continue;
                }
            }
            if (searchIndex == -1) {
                tmpArray[finalArraySize] = bigArray[i];
                finalArraySize++;
            }
        }

        int[] finalArray = new int[finalArraySize];
        for (int k = 0; k < finalArray.length; k++) {
            finalArray[k] = tmpArray[k];
        }

        System.out.println("Результат: ");
        System.out.println(Arrays.toString(finalArray));
        System.out.println();

        //8. Найти максимальный и минимальные элементы массива и вывести их индексы на экран
        int minimumValue = 0;
        int maximumValue = 0;
        int indexOfminimumValue = 0;
        int indexOfmaximumValue = 0;

        for (int k = 0; k < bigArray.length; k++) {

            if ((bigArray[k] < minimumValue) || (k == 0)) {
                minimumValue = bigArray[k];
                indexOfminimumValue = k;
            }
            if (bigArray[k] > maximumValue) {
                maximumValue = bigArray[k];
                indexOfmaximumValue = k;
            }
        }

        System.out.printf("8. Минимальное значение %d, индэкс %d. \n Максимальное значение %d, индэкс %d. \n\n", minimumValue, indexOfminimumValue, maximumValue, indexOfmaximumValue);

        //9. Выполнить слияние 2 упорядоченных массивов
        //возьмем массивы из задания 6.
        int[] newArr1ForEx9 = new int[10];
        int[] newArr2ForEx9 = new int[10];
        int tmp = 0;

        //int[] newArr1ForEx9 = {0, 0, 1, 2, 2, 4, 8, 8, 8, 9};
        //int[] newArr2ForEx9 = {1, 2, 2, 3, 4, 6, 6, 7, 8, 8};

        for (int i = 0; i < newArr1ForEx9.length; i++) {
            newArr1ForEx9[i] = random.nextInt(10);
        }

        for (int i = 0; i < newArr2ForEx9.length; i++) {
            newArr2ForEx9[i] = random.nextInt(10);
        }

        Arrays.sort(newArr1ForEx9);
        System.out.println("9. Первый массив");
        System.out.println(Arrays.toString(newArr1ForEx9));
        Arrays.sort(newArr2ForEx9);
        System.out.println("Второй массив");
        System.out.println(Arrays.toString(newArr2ForEx9));

        int[] totalArray = new int[newArr1ForEx9.length + newArr2ForEx9.length];
        int indexArr1 = 0;
        int indexArr2 = 0;
        int indexTotal = 0;
        int tmpValue1 = 0;
        int tmpValue2 = 0;


        while (indexTotal < totalArray.length) {
            if (indexArr1 < newArr1ForEx9.length) {
                tmpValue1 = newArr1ForEx9[indexArr1];
            } else {
                totalArray[indexTotal] = newArr2ForEx9[indexArr2];
                indexArr2++;
                indexTotal++;
                continue;
            }

            if (indexArr2 < newArr2ForEx9.length) {
                tmpValue2 = newArr2ForEx9[indexArr2];
            } else {
                totalArray[indexTotal] = newArr1ForEx9[indexArr1];
                indexArr1++;
                indexTotal++;
                continue;
            }

            if (tmpValue1 > tmpValue2) {
                totalArray[indexTotal] = tmpValue2;
                indexArr2++;
                indexTotal++;
                continue;
            } else if (tmpValue1 < tmpValue2) {
                totalArray[indexTotal] = tmpValue1;
                indexArr1++;
                indexTotal++;
                continue;
            } else {
                totalArray[indexTotal] = tmpValue1;
                indexArr1++;
                indexTotal++;
                totalArray[indexTotal] = tmpValue2;
                indexArr2++;
                indexTotal++;
            }

        }


        System.out.println("9. Результат слияния двух упорядоченных массивов: ");
        System.out.println(Arrays.toString(totalArray));
        System.out.println();

        //10. Найти строку матрицы с максимальной суммой элементов
        int[][] matrix = new int[10][10];
        int sumOfLine = 0;
        maximumValue = 0;
        indexOfmaximumValue = 0;


        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = random.nextInt(10);
            }
        }

        System.out.println("10. Начальная матрица: ");
        //System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < matrix.length; i++) {
            sumOfLine = 0;
            for (int k = 0; k < matrix[i].length; k++) {
                sumOfLine = sumOfLine + matrix[i][k];
                System.out.print(" " + matrix[i][k] + " "); //Выведем матрицу для наглядности
            }
            System.out.printf(" sumOfLine №%d:%d", i, sumOfLine);//и сумму по каждой строке для проверки алгоритма
            System.out.println();

            if (sumOfLine > maximumValue) {
                maximumValue = sumOfLine;
                indexOfmaximumValue = i;
            }
        }

        System.out.println("Индекс строки с максимальной суммой элементов: " + indexOfmaximumValue);
        System.out.println();

        //11. Сделать транспонирование матрицы (замена строк на столбцы)
        //берем начальную матрицу из задания 10.
        int[][] matrix2 = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix2[k][i] = matrix[i][k];
            }
        }

        System.out.println("11. Выводим транспонированную матрицу: ");
        for (int i = 0; i < matrix2.length; i++) {
            sumOfLine = 0;
            for (int k = 0; k < matrix2[i].length; k++) {
                System.out.print(" " + matrix2[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //12. Создать массив заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать
        //При перевороте элементов не желательно создавать еще один массив
        int[] arrayFor12Ex = new int[10];
        tmp = 0;


        for (int i = 0; i < arrayFor12Ex.length; i++) {
            arrayFor12Ex[i] = random.nextInt(10);
        }

        System.out.println("12. Начальный массив: ");
        System.out.println(Arrays.toString(arrayFor12Ex));

        for (int i = 0; i < (arrayFor12Ex.length / 2); i++) {
            tmp = arrayFor12Ex[i];
            arrayFor12Ex[i] = arrayFor12Ex[arrayFor12Ex.length - i - 1];
            arrayFor12Ex[arrayFor12Ex.length - i - 1] = tmp;
        }
        System.out.println("Результат: ");
        System.out.println(Arrays.toString(arrayFor12Ex));
        System.out.println();

        //13. Создать двумерный квадратный массив размера n. Заполнить его случайными числами таким образом:
        //- числа по диагонали равны 0;
        //- вверху и снизу от пересечения диагоналей находятся только положительные числа;
        //- слева и справа от пересечения диагоналей находятся только отрицательные числа;
        //Вывести массив на экран.
        //- Найти сумму всех элементов
        //        - Найти среднее арифметическое всех элементов, которые больше суммы всех элементов
        int[][] matrix3 = new int[5][5];
        sumOfArr = 0;
        double average = 0;
        double counter = 0;

        for (int i = 0; i < matrix3.length; i++) {
            for (int k = 0; k < matrix3[i].length; k++) {
                if ((i == k) || ((i + k) == (matrix3.length - 1))) {
                    matrix3[i][k] = 0;
                } else if (((i > k) && ((i + k) < (matrix3.length - 1)))
                        || ((i < k) && ((i + k) > (matrix3.length - 1)))) {
                    matrix3[i][k] = (random.nextInt(9) + 1) * -1;

                } else {
                    matrix3[i][k] = random.nextInt(9) + 1;
                }
            }
        }

        System.out.println("13. Начальный массив: ");
        for (int i = 0; i < matrix3.length; i++) {
            sumOfLine = 0;
            for (int k = 0; k < matrix3[i].length; k++) {
                System.out.printf(" %2d ", matrix3[i][k]);
            }
            System.out.println();
        }

        for (int i = 0; i < matrix3.length; i++) {
            for (int k = 0; k < matrix3[i].length; k++) {
                sumOfArr = sumOfArr + matrix3[i][k];
            }
        }

        for (int i = 0; i < matrix3.length; i++) {
            for (int k = 0; k < matrix3[i].length; k++) {
                if (sumOfArr < matrix3[i][k]) {
                    counter++;
                    average = average + matrix3[i][k];
                }
            }
        }

        average = average / counter;

        System.out.println("Сумма всех элементов: " + sumOfArr);
        System.out.println("Среднее арифметическое всех элементов, которые больше...: " + average);

    }
}
