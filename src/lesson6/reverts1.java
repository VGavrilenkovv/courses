package lesson6;

import java.util.Arrays;

/**
 * Created by Student on 30.11.2018.
 */
public class reverts1 {
    public static void main(String[] args) {
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1,     2, 3, 4});
        testInvert(new int[]{7, 1, 2, 3,4, 9, 155, 632});

    }

    private static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        invert(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array).length());
        System.out.println(Arrays.toString(array).toUpperCase());

    }


    public static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }

    }

}

