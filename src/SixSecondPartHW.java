import java.util.Random;

public class SixSecondPartHW {
    private final static Random randomInt = new Random();
    public static void runFiveHWTask() {
        int number1 = randomInt.nextInt(100);
        int number2 = randomInt.nextInt(100);
        System.out.println("Первое задание:");
        firstTask(number1, number2);
    }

    public static void firstTask(int number1, int number2) {
        System.out.println("Первое число: " + number1);
        System.out.println("Второе число: " + number2 + "\n");
        addition(number1, number2);
        subtraction(number1, number2);
        multiplication(number1, number2);
        division(number1, number2);
        System.out.println();
    }

    public static void addition(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Сумма чисел = " + sum);
    }
    public static void subtraction(int number1, int number2) {
        int sub = number1 - number2;
        System.out.println("Вычитание чисел = " + sub);
    }
    public static void multiplication(int number1, int number2) {
        int multiplication = number1 * number2;
        System.out.println("Умножение чисел = " + multiplication);
    }
    public static void division(double number1, double number2) {
        double division = number1 / number2;
        System.out.println("Деление чисел = " + division);
    }

    public static int doubleInteger(int i) {
        // Double the integer and return it!
        return i * 2;
    }

    public static boolean isLove(final int flower1, final int flower2) {
        return ((flower1 % 2 == 0) && !(flower2 % 2 == 0)) ||
                ((!(flower1 % 2 == 0)) && ((flower2 % 2 == 0)));
    }

    public static String numberToString(int num) {
        // Return a string of the number here!
        return String.valueOf(num);
    }

    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    public static String countingSheep(int num) {
        //Add your code here
        if (num <= 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            result.append(i).append(" sheep...");
        }
        return result.toString();
    }
}
