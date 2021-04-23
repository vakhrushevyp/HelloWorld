package Five;
import java.util.Scanner;
public class MainFive {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Введите 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String z = scanner.next();
        switch(z) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
        }
        //Ниже вариант с if else
        /*     if (z.equals("+")) {
            System.out.println(x + y);
            }
       else if (z.equals("-")) {
           System.out.println(x - y);
       }
       else if (z.equals("*")) {
           System.out.println(x * y);
       }
       else if (z.equals("/")) {
           System.out.println(x / y);
       } */
    }
}

