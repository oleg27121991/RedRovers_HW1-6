public class FiveSecondPartHW {
    public static void runFiveHWTask() {
        System.out.println("Первое задание:");
        firstTask(10);
        System.out.println("Второе задание:");
        secondTask(10);
        System.out.println("Третье задание:");
        thirdTask(9);
    }

    public static void firstTask(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void secondTask(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < rows - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void thirdTask(int rows) {
        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = rows - i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
