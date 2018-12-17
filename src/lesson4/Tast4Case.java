package lesson4;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Student on 23.11.2018.
 */
public class Tast4Case {
    public static void main(String[] args) {
        String a = args[0];
        int day = Integer.parseInt(a);
        System.out.println(day);
        switch (day) {
            case 1:
                System.out.println("Понедельник");

            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Ср");
                break;
            case 4:
                System.out.println("Чт");
            case 5:
                System.out.println("Пт");
                break;
            case 6:

            case 7:
                System.out.println("Выходные");
            default:
                System.out.println("Входные данные не верны");
                break;

        }
    }
}
