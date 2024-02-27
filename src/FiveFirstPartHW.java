import java.util.Arrays;

public class FiveFirstPartHW {
    public static void runFiveHWTask() {
        System.out.println("Первое задание:");
        firstTask();
        System.out.println("Второе задание:");
        secondTask();
        System.out.println("Третье задание:");
        thirdTask();
        System.out.println("Четвертое задание:");
        fourTask();
        System.out.println("Пятое задание:");
        fiveTask();
        System.out.println("Шестое задание:");
        sixTask();
        System.out.println("Седьмое задание:");
        sevenTask();
    }

    public static void firstTask() {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Дан массив: " + Arrays.toString(array));
        System.out.println("Сумма всех значений массива: " + sum);
        System.out.println();
    }

    public static void secondTask() {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Дан массив: " + Arrays.toString(array));
        System.out.println("Максимальное значение массива: " + max);
        System.out.println();
    }

    public static void thirdTask() {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Дан массив: " + Arrays.toString(array));
        System.out.println("Минимальное значение массива: " + min);
        System.out.println();
    }

    public static void fourTask() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        System.out.println("Дан массив: " + Arrays.toString(array));
        System.out.println("Среднее арифметическое всех значений массива: " + average * 1.0 / array.length);
        System.out.println();
    }

    public static void fiveTask() {
        int[][] array = {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9},
                        {-1, -2, -3, -4},
                        {-5, -6}
        };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Дан массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println();
    }

    public static void sixTask() {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}
        };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Дан массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Максимальное значение массива: " + max);
        System.out.println();
    }

    public static void sevenTask() {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}
        };
        System.out.println("Дан массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int totalElements = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                totalElements ++;
            }
        }
        System.out.println("Количество элементов в массиве: " + totalElements);
    }
}
