package oop;

/**
 * Created by Student on 21.12.2018.
 */
public class Rictangle extends Shape {
    private int x,y;

    public Rictangle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void drow() {
        System.out.println("Rictangle = " + x + " " + y);
    }

}

