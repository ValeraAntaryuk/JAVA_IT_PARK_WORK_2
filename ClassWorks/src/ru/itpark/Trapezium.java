package ru.itpark;

/**
 * Created by Student9 on 19.05.2017.
 */
public class Trapezium extends Rectangle {
    private int height;
    private int sideA;
    private int sideB;
    public Trapezium(int sideA,int sideB,int height){
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public area(){
        return ((this.sideA + this.sideB)/2 )* this.height;

    }

}
