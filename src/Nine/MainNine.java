package Nine;
import java.util.Scanner;
public class MainNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sr = 0;
        System.out.println("Введите размер массива:");
        int i = scanner.nextInt();
        double[] myArray = new double[i];
        System.out.println("Введите элементы массива в количестве " + i + " чисел:");
        for (int j = 0; j < myArray.length; j++) {
            myArray[j] = scanner.nextDouble();
            sr += myArray[j];
        }
        sr = sr / i;
        for (double outArray : myArray) {
            System.out.print(outArray * sr + " ");
        }
    }

}
