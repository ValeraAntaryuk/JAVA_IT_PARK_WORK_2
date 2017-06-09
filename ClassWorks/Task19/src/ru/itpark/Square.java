package ru.itpark;

public class Square extends Rectangle {
    public Square(String name, int a) {
        super(name, a, a);
    }
    public int perimeter(){
        return a*4;
    }
    public int area (){
        return a*a;
    }
}
