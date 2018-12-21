package oop;

/**
 * Created by Student on 21.12.2018.
 */
public class ShapeDemo {

    public static void main(String[] args) {
        Circle circle = new Circle("grey",4, 7, 44);
        Rictangle rictangle = new Rictangle("grey",4, 7);

        Shape [] xyradius = {circle, rictangle};
        for (Shape a : xyradius) {
           a.drow();
        }


    }
}
