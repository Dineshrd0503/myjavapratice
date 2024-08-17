import java.lang.Math;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    protected Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    protected Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    protected double calculateArea() {
        return length * width;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5.4461);
        System.out.println("Area of circle is " + c.calculateArea());

        Rectangle r = new Rectangle(10.6109, 15.31678);
        System.out.println("Area of rectangle is " + r.calculateArea());
    }
}