package oop;

/**
 * Created by Student on 21.12.2018.
 */
public class Circle extends Shape {
    private int x,y, radius;

    public Circle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void drow() {
        System.out.println("Draw circle with coordinates " + x +" "+""+ y +""+ radius
        + " "+ getColor());
    }
}
