package Final2;

import java.util.Scanner;

public class MainFinal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        String a = scanner.nextLine();
        String[] result = a.split("\\+|-|=");
        String[] result2 = a.split("\\d+|x|=");
        if (result2[1].equals("+")) {
            if (result[0].equals("x")) {
                int x1 = Integer.parseInt(result[1]);
                int x2 = Integer.parseInt(result[2]);
                int x0 = x2 - x1;
                System.out.println("Вывод: " + x0);
            } else if (result[1].equals("x")) {
                int x0 = Integer.parseInt(result[0]);
                int x2 = Integer.parseInt(result[2]);
                int x1 = x2 - x0;
                System.out.println("Вывод: " + x1);
            } else if (result[2].equals("x")) {
                int x0 = Integer.parseInt(result[0]);
                int x1 = Integer.parseInt(result[1]);
                int x2 = x0 + x1;
                System.out.println("Вывод: " + x2);
            } else System.out.println("Значение 'x' не найдено в введенном выражении");
        }
        else if (result2[1].equals("-")) {
                if (result[0].equals("x")) {
                    int x1 = Integer.parseInt(result[1]);
                    int x2 = Integer.parseInt(result[2]);
                    int x0 = x2 + x1;
                    System.out.println("Вывод: " + x0);
                } else if (result[1].equals("x")) {
                    int x0 = Integer.parseInt(result[0]);
                    int x2 = Integer.parseInt(result[2]);
                    int x1 = x0 - x2;
                    System.out.println("Вывод: " + x1);
                } else if (result[2].equals("x")) {
                    int x0 = Integer.parseInt(result[0]);
                    int x1 = Integer.parseInt(result[1]);
                    int x2 = x0 - x1;
                    System.out.println("Вывод: " + x2);
                } else System.out.println("Значение 'x' не найдено в введенном выражении");
        }
        else System.out.println("Значение '+' или '-' не найдено в введенном выражении");
    }
}
