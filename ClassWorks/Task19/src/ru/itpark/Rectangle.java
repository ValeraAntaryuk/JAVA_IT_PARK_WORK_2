package ru.itpark;


public class Rectangle extends Figure {
    protected int a;
    private int b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int area() {
        return a * b;
    }
    public int perimeter(){
        return (int)((a + b)*2);
    }
}
