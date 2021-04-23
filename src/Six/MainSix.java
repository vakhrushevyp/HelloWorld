package Six;
import java.util.Scanner;

public class MainSix {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int y = scanner.nextInt();
        System.out.println("Введите число выбранных единиц");
        float z = scanner.nextInt();

    /*  x   1 = масса,  2 =  расстояние
        y   1 - метр, 2 - миля, 3 - ярд, 4 - фут
        y   1 - кг, 2 - стон, 3 - фунт, 4 - унция

        z   колиичество
          */


        switch (x) {
            case 1:
                switch (y) {
                    case 1:
                        System.out.println("Килограммы: " + z);
                        System.out.println("Стоны: " + z / 6.35);
                        System.out.println("Фунты: " + z * 2.205);
                        System.out.println("Унции: " + z * 35.274);
                        break;
                    case 2:
                        System.out.println("Килограммы: " + z * 6.35);
                        System.out.println("Стоны: " + z);
                        System.out.println("Фунты: " + z * 14);
                        System.out.println("Унции: " + z * 224);
                        break;
                    case 3:
                        System.out.println("Килограммы: " + z / 2.205);
                        System.out.println("Стоны: " + z / 14);
                        System.out.println("Фунтов: " + z);
                        System.out.println("Унции: " + z * 16);
                        break;
                    case 4:
                        System.out.println("Килограммы: " + z / 35.274);
                        System.out.println("Стоны: " + z / 224);
                        System.out.println("Фунты: " + z / 16);
                        System.out.println("Унции: " + z);
                        break;
                }
                break;
            case 2:
                switch (y) {
                    case 1:
                        System.out.println("Метры: " + z);
                        System.out.println("Мили: " + z / 1609);
                        System.out.println("Ярды: " + z * 1.094);
                        System.out.println("Футы: " + z * 3.281);
                        break;
                    case 2:
                        System.out.println("Метры: " + z * 1609);
                        System.out.println("Мили: " + z);
                        System.out.println("Ярды: " + z * 1760);
                        System.out.println("Футы: " + z * 5280);
                        break;
                    case 3:
                        System.out.println("Метры: " + z/1.094);
                        System.out.println("Мили: " + z / 1760);
                        System.out.println("Ярды: " + z);
                        System.out.println("Футы: " + z * 3);
                        break;
                    case 4:
                        System.out.println("Метры: " + z / 3.281);
                        System.out.println("Мили: " + z / 5280);
                        System.out.println("Ярды: " + z / 3);
                        System.out.println("Футы: " + z);
                        break;
                }

        }
    }
}
