package edu.vccs.email.ldh2662;

public class ColoredCircle extends Circle{
    String color;

    public ColoredCircle(String color) {
        super(0);
        this.color = color;
    }

    public ColoredCircle(double radius, String color) {
        super(radius);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ColoredCircle() {
        super();
        setColor(null);
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        ColoredCircle coloredCircle = new ColoredCircle(3.14, "black");
        System.out.println(coloredCircle);
    }

    @Override
    public String toString() {
        return "ColoredCircle{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
