package ss7_abstract_class_interface.bai_tap.bai2;

import ss7_abstract_class_interface.bai_tap.bai1.Resizeable;

 public class Circle extends Shape implements Colorable {
    private double radius = 1.0d;

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
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                "Area =" + getArea() +
                "color"+ getColor()+
                "Perimeter"+ getPerimeter()+
                "filled"+ isFilled()+
                '}';
    }
     @Override
     public void howToColor() {
         System.out.println("Color all four sides..");
     }
}