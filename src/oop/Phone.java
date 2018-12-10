package oop;

/**
 * Created by Student on 10.12.2018.
 */
public class Phone {
    int num;
    int model;
    int weight;


    Phone(int n, int m, int w) {
        num = n;
        model = m;
        weight = w;
    }

    Phone(int w, int m) {
        num = w;
        model = m;
    }

    Phone() {

    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public int getNumber() {
        return num;
    }
}

