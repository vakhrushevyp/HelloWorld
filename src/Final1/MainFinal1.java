package Final1;

import java.util.Scanner;

public class MainFinal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double cr = scanner.nextDouble();
        System.out.print("Количество рублей: ");
        double rub = scanner.nextDouble();
        System.out.printf("Итого: %.2f долларов",rub/cr);
    }
}
