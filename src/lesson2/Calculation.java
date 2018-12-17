package lesson2;

/**
 * Created by Student on 16.11.2018.
 */
public class Calculation {
    public static void main(String[] args) {
        int x=summ(7,8);
        System.out.println(x);
        System.out.println(summ(x,x) *2);
    }

    public static  int summ(int a,int y){

        return a+y;
    }
}
