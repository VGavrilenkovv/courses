package lesson4;

import java.util.Scanner;

/**
 * Created by Student on 23.11.2018.
 */
public class Task3 {

    public static void main(String[] args) {
            /*Scanner sc = new Scanner(System.in);
            System.out.print("Введите число от 1 до 7 ");
            int day = sc.nextInt();*/
        String a = args[0];
        int day = Integer.parseInt(a);
        System.out.println(day);
        if (day < 0 || day > 7) {
            System.out.println("не удовлетворяет условиям задачи");
        } else {
            if (day == 1) {

                System.out.println("Понедельник");
            } else if (day == 2) {
                System.out.println("Вторник");
            } else if (day == 3) {
                System.out.println("Ср");
            } else if (day == 4) {
                System.out.println("Чт");
            } else if (day == 5) {
                System.out.println("Пт");
            }
            else  if (day == 6 || day == 7) {
                System.out.println("Выходные");
            }
        }

    }

}
