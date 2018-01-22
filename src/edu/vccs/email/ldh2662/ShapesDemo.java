package edu.vccs.email.ldh2662;

import sun.security.provider.SHA;

/**
 * <purpose>
 * 1/10/2018
 * @author ldh2662
 */
public class ShapesDemo {
   public static void main(String[] args) {
      Shape[] shapes = new Shape[3];
      shapes[0] = new Circle(1.0);
      shapes[1] = new ColoredCircle(2.0, "red");
      shapes[2] = new Square(3.0);

      for (Shape shape : shapes) {
         tellMeAbout(shape);
      }
   }

   private static void tellMeAbout(Shape shape) {
      System.out.printf("%s" , shape);
      System.out.printf(": Area = %f", shape.getArea());
      System.out.printf(" at (%.3f, %.3f)", shape.getCenterX(), shape.getCenterY());
      System.out.println();
      if (shape instanceof Circle) {
         System.out.println(((Circle) shape).getRadius());
      }
   }
}
