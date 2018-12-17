package lesson4;

import java.util.Scanner;

/**
 * Created by Student on 23.11.2018.
 */
public class PositiveMet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        if (sc.hasNextInt()) {

            int i = sc.nextInt();
            validateNumber(i);

           } else {
               System.out.println("Вы ввели число не верно");
           }
        }


    private static void validateNumber(int i) {
        if (0 < i && i < 10){
            System.out.println("Положительное число меньше 10 ");
        } else {
            System.out.println("Положительное число больше 10 ");
        }
    }
}
