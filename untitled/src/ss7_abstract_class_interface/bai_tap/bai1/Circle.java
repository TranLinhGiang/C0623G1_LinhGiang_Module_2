package ss7_abstract_class_interface.bai_tap.bai1;

public class Circle extends Shape implements Resizeable {
    private double radius = 2.0d;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
       setRadius(this.radius *= (1+(percent/100)));
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                "Area =" + getArea() +
                '}';
    }
}