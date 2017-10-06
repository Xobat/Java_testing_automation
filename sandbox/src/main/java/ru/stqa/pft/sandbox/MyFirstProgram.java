package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alexey");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной "+ s.a +" = "+area(s));

    Rectangle a = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника со сторонами "+ a.a +" и " + a.b +" = "+area(a));

    }

    public static  void hello(String somebody) {
        System.out.println("Hello, "+somebody+"!");
    }

    public static double area (Square s) {
        return s.a*s.a;
    }

    public static double area (Rectangle a) {
        return a.a*a.b;
    }

}