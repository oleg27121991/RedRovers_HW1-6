public class FourFirstPartHW {
    public static void runFourHWTask() {
        System.out.println("Первое задание:");
        firstTask();
        System.out.println("Второе задание:");
        secondTask();
        System.out.println("Третье задание:");
        thirdTask();
    }

    public static void firstTask() {
        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void secondTask() {
        int base = 5;
        int exponent = 1;
        int result = 5;

        while (result < 10000) {
            System.out.println("5^" + exponent + " = " + result);
            exponent++;
            result *= base;
        }
        System.out.println();
    }

    public static void thirdTask() {
        int multiple = 4;
        int firstNum = 40;
        int secondNum = 60;
        System.out.println("Первый вариант:");
        for (int i = firstNum; i <= secondNum; i++) {
            if (i % multiple == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Второй вариант:");
        for (int i = firstNum; i <= secondNum; i+=multiple) {
            System.out.println(i);
        }
    }
}
