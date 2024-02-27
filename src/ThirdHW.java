import java.util.Random;

public class ThirdHW {
    private final static Random randomInt = new Random();
    private static final int UPPER_BOUND_FIRST_TASK = 10;
    private static final int UPPER_BOUND_SECOND_TASK = 20;
    private static final int UPPER_BOUND_THIRD_TASK = 100;
    public static void runThirdHWTask() {
        System.out.println("Первое задание:");
        firstTask();
        System.out.println("Второе задание:");
        secondTask();
        System.out.println("Третье задание:");
        thirdTask();
    }

    public static void firstTask() {
        int a = randomInt.nextInt(UPPER_BOUND_FIRST_TASK);
        int b = randomInt.nextInt(UPPER_BOUND_FIRST_TASK);

        System.out.println("Переменная а = " + a);
        System.out.println("Переменная b = " + b + "\n");
        System.out.println("Сравниваем a и b:");
        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
        System.out.println();
    }

    public static void secondTask() {
        int a = randomInt.nextInt(UPPER_BOUND_SECOND_TASK);
        int b = randomInt.nextInt(UPPER_BOUND_SECOND_TASK);

        System.out.println("Переменная а = " + a);
        System.out.println("Переменная b = " + b);

        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
        System.out.println();
    }

    public static void thirdTask() {
        int a = randomInt.nextInt(UPPER_BOUND_THIRD_TASK);

        System.out.println("Переменная а = " + a);

        if (a > 10) {
            System.out.println("больше 10");
        }
        if (a < 100) {
            System.out.println("меньше 100");
        }
        if (a * 1.0 / 2 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (a >= 5 && a <= 40) {
            System.out.println("значение переменной между 5 и 40");
        } else
            System.out.println("значение переменной меньше 5 или больше 40");
    }
}
