package Four;
import java.util.Scanner;
public class MainFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x,y,z: ");
        float x = in.nextFloat();
        float y = in.nextFloat();
        float z = in.nextFloat();
        float sr = (x+y+z)/3;
        System.out.println("Среднее арифметическое: " + sr);
        int okr = (int) (sr/2);
        if (okr > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
