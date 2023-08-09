package ss6_Inheritance.bai_tap;

public class Circle {
    private double radius = 3.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }


    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of"
                + super.toString();
    }

    public static class CircleText {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle);
            System.out.println("Area of circle is" + " " + circle.getArea());
            System.out.println("color: " + circle.getColor());
            circle = new Circle(6, "black");
            System.out.println(circle);
            System.out.println(circle.getArea());
            System.out.println(circle.getColor());
        }
    }
}
