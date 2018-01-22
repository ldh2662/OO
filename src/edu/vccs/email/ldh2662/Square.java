package edu.vccs.email.ldh2662;

public class Square extends Shape {
    double side;
    double x, y;

    public Square() {
        this(0);
    }

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double getArea() {
        return side * side;
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
