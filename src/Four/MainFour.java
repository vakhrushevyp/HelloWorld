package Four;
import java.util.Scanner;
public class MainFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x,y,z: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int sr = (x+y+z)/3;
        System.out.println(sr);
        if (sr/2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
