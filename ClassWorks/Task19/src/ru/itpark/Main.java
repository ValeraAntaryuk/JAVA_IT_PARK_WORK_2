package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Rectangle a = new Rectangle("rect",2, 2);
        Square b = new Square("square", 2);
        Circle c = new Circle("cicle",3);

        Figure figures[] = {a, b, c};
        System.out.println(a.equals(b));

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].area());
        }
        // Figure figure = new Figure();

    }
}
