package Eleven;
import java.util.Scanner;
public class MainEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int b = scanner.nextInt();
        int a1 = Integer.parseInt(a);
        int max = Math.max(b, a1);
        System.out.println(max);
        double min = Math.min(b, a1);
        System.out.println(min);
    }
}
