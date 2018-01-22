package edu.vccs.email.ldh2662;

public class Circle extends Shape {
    double radius;
    double x, y;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public Circle() {
        this(0);
    }

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    public static void main(String[] args) {
       Circle circle = new Circle(1.5);
        System.out.println(circle);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getCenterX() {
        return x;
    }

    @Override
    public double getCenterY() {
        return y;
    }
}
