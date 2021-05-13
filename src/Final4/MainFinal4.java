package Final4;

import java.util.Scanner;

public class MainFinal4 {
    public static void main(String[] args) {
        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Всего 3 попытки. В первой попытке можно использовать подсказку. Подсказка сократит количество попыток до одной");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++ ) {
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Заархивированный вирус") ) {
                System.out.println("Правильно!");
                break;
            }
            else if ((answer.equalsIgnoreCase("Подсказка")) && (i==1)  ) {
               System.out.println("Вирус, но простой");
               i=2;
            }
            else if ((answer.equalsIgnoreCase("Подсказка")) && (i==2)  ) {
                System.out.println("Подсказка уже недоступна");
                i--;
            }
            else if ((answer.equalsIgnoreCase("Подсказка")) && (i==3)  ) {
                        System.out.println("Подсказка уже недоступна");
                i--;
            }
            else {
                if (i==1||i==2) System.out.println("Подумай еще!");
                if (i==3) System.out.println("Обидно, приходи в другой раз");

            }
        }

    }
}
