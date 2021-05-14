package Final3;

import java.util.Scanner;

public class MainFinal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        String[] myArray = new String[n];
        int[] myArray2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i+1) + ": ");
            myArray[i] = scanner.next();
            for (int i1 = 0; i1 < myArray[i].length(); i1++) {
                if (myArray[i].indexOf(myArray[i].charAt(i1), i1 + 1) == -1) {
                    myArray2[i]++;
                }
            }
        }
        for (int j = 0; j < n - 1; j++)
            if (myArray2[j] > myArray2[j + 1]) {
                myArray[j+1] = myArray[j];
                myArray2[j+1] = myArray2[j];
            }
        System.out.println("Ответ: " + myArray[n-1]);
    }
}