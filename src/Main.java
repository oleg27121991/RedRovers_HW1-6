import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название класса для запуска:");
        System.out.println("Первая домашняя: FirstHW");
        System.out.println("Вторая домашняя: SecondHW");
        System.out.println("Третья домашняя: ThirdHW");
        System.out.println("Четвертая домашняя(первая часть): FourFirstPartHW");
        System.out.println("Четвертая домашняя(вторая часть): FourSecondPartHW");
        System.out.println("Пятая домашняя(первая часть): FiveFirstPartHW");
        System.out.println("Пятая домашняя(вторая часть): FiveSecondPartHW");
        System.out.println("Шестая домашняя(первая часть): SixFirstPartHW");
        System.out.println("Шестая домашняя(вторая часть): SixSecondPartHW");
        String className = scanner.nextLine();

        switch (className) {
            case "FirstHW":
                FirstHW.runFirstHWTasks();
                break;
            case "SecondHW":
                SecondHW.runSecondHWTask();
                break;
            case "ThirdHW":
                ThirdHW.runThirdHWTask();
                break;
            case "FourFirstPartHW":
                FourFirstPartHW.runFourHWTask();
                break;
            case "FourSecondPartHW":
                FourSecondPartHw.runFourHWTask();
                break;
            case "FiveFirstPartHW":
                FiveFirstPartHW.runFiveHWTask();
                break;
            case "FiveSecondPartHW":
                FiveSecondPartHW.runFiveHWTask();
                break;
            case "SixFirstPartHW":
                SixFirstPartHW.runFiveHWTask();
                break;
            case "SixSecondPartHW":
                SixSecondPartHW.runFiveHWTask();
                break;
            default:
                System.out.println("Неизвестный класс: " + className);
        }
    }
}
