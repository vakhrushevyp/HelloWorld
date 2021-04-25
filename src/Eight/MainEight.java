package Eight;
import java.util.Scanner;
public class MainEight {
    public static void main(String[] args) {
        int summ = 0;
        Scanner scanner = new Scanner(System.in)  ;
        System.out.println("Введите любое целое положительное число:");
        int n = scanner.nextInt();
        for (int i = 0; i <=n; i++ ) {
            if (!(i % 2 == 0)) {
            summ += i;
            }
        }
        System.out.println("Сумма нечетных чисел составила: " + summ);

    }
}
