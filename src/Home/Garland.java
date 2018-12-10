package home;

/**
 * Created by Student on 10.12.2018.
 */
public class Garland {
    public static void main(String[] args) {
        int garland = 8978;

        System.out.println("бинарное отображение числа без ведущих нулей = " + Integer.toBinaryString(garland));
        String s = String.format("%32s", Integer.toBinaryString(garland)).replace(' ', '0');
        System.out.println("бинарное отображение с ведущими нулями " + s);

        System.out.println("проверка кол-ва символов в бинарном отображении = " + s.length() + " символа");

        stateLamp(garland);
        blinking(garland, s);
        runing(garland, s);


    }

    public static void stateLamp(int gaarland) {
        int stateFirstLamp = 1;
        int lastState = gaarland & stateFirstLamp;
        if (lastState == 1) {
            System.out.println("первая лампа включена");
        } else {
            System.out.println("первая лампа выключена");
        }

    }

    public static void blinking(int garland, String s) {
        int blink = garland;
        for (int i =0; i < s.length(); i++){
            blink = ~blink;
            System.out.println(String.format("%32s", Integer.toBinaryString(blink)).replace(' ', '0') + " мигание гирлянды");

            //System.out.println(Integer.toBinaryString(blink) + "    мигание гирлянды");
        }

    }




    public static void runing(int gaarland, String s) {
        for (int i = 0; i < s.length(); i++) {
            gaarland = gaarland << 1;
            System.out.println(String.format("%32s", Integer.toBinaryString(gaarland)).replace(' ', '0') +
                    " бегущая строка пока не пройдет все 32 бита");
        }
    }
}
