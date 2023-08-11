package exercises.s5;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
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
    public double getArea(){
        return Math.pow(this.getRadius(),2)*Math.PI;
    }

    public static class TestCircle {
        public static void main(String[] args) {
           Circle circle= new Circle();
            System.out.println("radius: "+ circle.getRadius());
            System.out.println("Area: "+ circle.getArea());
        }
    }
}
