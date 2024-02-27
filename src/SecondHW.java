import java.util.Random;

public class SecondHW {
    private final static Random randomInt = new Random();
    private static final int LOWER_BOUND_A = 50;
    private static final int UPPER_BOUND_A = 100;
    private static final int LOWER_BOUND_B = 0;
    private static final int UPPER_BOUND_B = 50;
    public static void runSecondHWTask() {
        int a = randomInt.nextInt(LOWER_BOUND_A,UPPER_BOUND_A);
        int b = randomInt.nextInt(LOWER_BOUND_B, UPPER_BOUND_B);

        int sum = a + b;
        int product = a * b;
        int difference = a - b;

        System.out.println("Переменная а: " + a);
        System.out.println("Переменная b: " + b + "\n");

        System.out.println("Сложение: " + sum);
        System.out.println("Умножение: " + product);
        System.out.println("Вычитание: " + difference + "\n");
        double quotient = 0;
        int remainder = 0;
        if (b != 0) {
            quotient = a / (double) b;
            remainder = a % b;
        } else {
            System.out.println("Деление на 0 невозможно.");
        }
        if (b != 0) {
            System.out.println("Деление: " + quotient);
            System.out.println("Остаток от деление: " + remainder + "\n");
        }

        if (a % 2 == 0 & b % 2 == 0) {
            System.out.println("Переменная а четная: " + a);
            System.out.println("Переменная b четная: " + b);
        } else if (b % 2 == 0) {
            System.out.println("Переменная b четная: " + b);
        } else if (a % 2 == 0) {
            System.out.println("Переменная а четная: " + a);
        } else {
            System.out.println("Нет четных переменных");
        }
    }
}
