package ru.itpark;

public class Main {

    public static void main(String[] args) {
	Square square = new Square(10);
    Rectangle rectangle = new Rectangle(5,10);
	System.out.println("Площадь равна  = " + rectangle.area());
	Trapezium trapezium = new Trapezium(10,5,4);
	//trapezium.area();
    }
}
