package ru.itpark;

/**
 * Created by Student9 on 19.05.2017.
 */
public class Rectangle {
    private int sideA;
    private int sideB;


    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public Rectangle(int sideB, int sideA) {
        this.sideB = sideB;
        this.sideA = sideA;
    }

    public int area (){

        return this.sideA * this.sideB;
    }
}
