package Twelve;
import java.util.Locale;
import java.util.Scanner;
public class MainTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.contains("Java")==a.startsWith("I like")==a.endsWith("!!!")) {
        System.out.println(a.toUpperCase());
        }
        System.out.println(a.replace('a',  'o').substring(7, 11));
    }
}
