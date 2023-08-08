package ss5_Access_modifier_static_method_static_property.bai_tap;

import java.util.Scanner;

public class Circle {
    Scanner scanner = new Scanner(System.in);
    private double radius = 1.0d;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }



    public static class TestCircle {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println("area of circle is equal to: " + " " + circle.getArea());
            System.out.println("round glass wheel: " + " " + circle.radius);

        }

    }
}
