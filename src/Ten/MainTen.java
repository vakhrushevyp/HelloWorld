package Ten;
import java.util.Scanner;
public class MainTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы, кол-во строк:");
        int j = scanner.nextInt();
        System.out.println("Введите размер матрицы, кол-во столбцов:");
        int i = scanner.nextInt();
        int[][] myArray = new int[j][i];
        System.out.println("Заполните матрицу " + j + " на " + i + " числами:");
        for (int x = 0; x < j; x++ ) {
            for (int y = 0; y < i; y++ ) {
                myArray[x][y] = scanner.nextInt();
            }
        }
        System.out.println("Первая строка матрицы (элементы умножены на 3 ):");
        for (int z = 0; z < myArray[0].length; z++) {
            System.out.print(myArray[0][z] * 3 + " ");
        }
    }
}
