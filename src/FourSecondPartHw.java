import java.util.Arrays;

public class FourSecondPartHw {
    public static void runFourHWTask() {
        System.out.println("Первое задание:");
        firstTask();
        System.out.println("Второе задание:");
        secondTask();
        System.out.println("Третье задание:");
        thirdTask();
    }
    public static int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    public static void firstTask() {
        for (int i : array) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void secondTask() {
        for (int i : array) {
            if (i > 5) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void thirdTask() {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 15;
        }
        System.out.println(Arrays.toString(array));
    }
}
