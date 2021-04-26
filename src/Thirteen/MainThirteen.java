package Thirteen;
import java.util.Scanner;
public class MainThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”");
        String str = scanner.nextLine();
        String[] result = str.split(" ");
        String[] result2 = new String[result.length];
        int x = 0;
        System.out.println("Слова, которые состоят только из латиницы:");
        for (int i = 0; i < result.length; i++) {
               result2[i] = result[i].replaceAll("[^a-zA-Z]+", "");
               if (result2[i].equals(result[i])) {
                   x++;
                   System.out.println(result2[i]);
               }
           }
        System.out.println("Количество таких слов: " + x);

    }
}
