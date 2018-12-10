package home;

/**
 * Created by Student on 10.12.2018.
 */
public class averageValue {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        double x = (a+b+c)/args.length;
        System.out.println(x);

    }
}
