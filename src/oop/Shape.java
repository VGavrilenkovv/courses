package oop;

/**
 * Created by Student on 21.12.2018.
 */
public abstract class Shape {
    private String color;
    public  Shape(String color){
        this.color=color;
    }

    public String getColor (){
        return color;
    }

    public void setColor (String color){
        this.color = color;
    }
    public abstract void drow();


}
