package Seven;
import java.util.Scanner;
public class MainSeven {
    public static void main(String[] args) {
      final int x = 5;
      final int y = 10;
      final int z = 20;
      Scanner scanner = new Scanner(System.in)  ;
      System.out.println("Введите размер массива:");
      int j = scanner.nextInt();
      int[] myArray = new int[j];
      System.out.println("Введите элементы массива в количестве " + j + " чисел:");
      for (int i = 0; i < myArray.length; i++) {
          myArray[i] = scanner.nextInt();
          switch (myArray[i]) {
              case x:
              case y:
              case z:
                  System.out.println("Данное значение имеется в константах");
                  break;
          }

      }

    }
}
