package Fourteen;

import java.util.Random;

public class MainFourteen {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        int min = 20;
        int max = -20;
        Random r = new Random();
        for (int i =0; i < myArray.length; i++) {
            myArray[i] = r.nextInt(41)-20;
                if (myArray[i] > max) {
                    max = myArray[i];
                }
                if (myArray[i] < min) {
                    min = myArray[i];
                }
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        int resultInt = Math.max(Math.abs(max),  Math.abs(min));
        System.out.println("Наибольшее по модулю: " + resultInt);

    }
}
