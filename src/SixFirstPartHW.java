import java.util.Arrays;

public class SixFirstPartHW {
    public static void runFiveHWTask() {
        System.out.println("Первое задание:");
        firstTask();
        System.out.println("Второе задание:");
        secondTask();
        System.out.println("Третье задание:");
        thirdTask();
        System.out.println("Четвертое задание:");
        fourTask();
    }

    // Дана строка:
    // String s = “Перестановочный алгоритм быстрого действия”;
    // необходимо вывести все буквы “о” из этой строки.
    // Для указанной строки ответ будет “ооооо” (или в столбик)
    public static void firstTask() {
        String s = "Перестановочный алгоритм быстрого действия";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о' || s.charAt(i) == 'О') {
                result.append('о');
            }
        }
        System.out.println("Дана строка: " + s);
        System.out.println("Все буквы “о” из этой строки: " + result);
        System.out.println();
    }

    // Дана строка:
    // String s = “Перевыборы выбранного президента”;
    // необходимо подсчитать количество букв “е” в строке.
    // Для указанной строки ответ будет 4.
    public static void secondTask() {
        String s = "Перевыборы выбранного президента";
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е' || s.charAt(i) == 'Е') {
                result++;
            }
        }
        System.out.println("Дана строка: " + s);
        System.out.println("Количество букв “е” в строке: " + result);
        System.out.println();
    }

    // Дана строка:
    // String s = “Посмотрите как Рите нравится ритм”;
    // необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
    // Для указанной строки ответ будет 6, 15, 29.
    public static void thirdTask() {
        String s = "Посмотрите как Рите нравится ритм";
        String target = "рит";
        int index = -1;
        System.out.println("Дана строка: " + s);
        while ((index = s.toLowerCase().indexOf(target, index + 1)) != -1) {
            System.out.println("Индекс начала подстроки - “рит”, независимо от регистра: " + index);
        }
        System.out.println();
    }


    // Дан массив:
    // String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
    // необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
    public static void fourTask() {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        int result = countStringsWithoutE(array);
        System.out.println("Массив строк:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Количество строк без буквы 'е': " + result);
    }

    public static int countStringsWithoutE(String[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!(array[i][j].toLowerCase().contains("е"))) {
                    count++;
                }
            }
        }
        return count;
    }
}