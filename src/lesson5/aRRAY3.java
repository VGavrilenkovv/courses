package lesson5;

/**
 * Created by Student on 26.11.2018.
 */
public class aRRAY3 {
    public static void main(String[] args) {
        String[][] st = new String[3][9];
        System.out.println(st.length);
        char c = 'a';

        for (int i = 0; i < st.length; i++) {
            for (int j = 0; j < st[0].length; j++) {
                st[i][j] = c + "" +(j+1);
                System.out.print(st[i][j] + " ");
            }
            c++;
            System.out.println();

        }
    }
}
