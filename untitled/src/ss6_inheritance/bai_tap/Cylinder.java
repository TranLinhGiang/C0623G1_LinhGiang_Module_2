package ss6_inheritance.bai_tap;

public class Cylinder extends Circle {
    private double width = 5;
    private double height = 8;

    public Cylinder() {
    }

    public Cylinder(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height * Math.pow(getRadius(), 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius="
                + getRadius()
                + ", which is a subclass of"
                + super.toString();
    }

    public static class CylinderText {
        public static void main(String[] args) {
            Cylinder cylinder = new Cylinder();

            System.out.println("the height of the cylinder is equal to: " + cylinder.getHeight());
            System.out.println("The radius of the cylinder is equal to: " + cylinder.getRadius());
            System.out.println("The volume of the cylinder is equal to: " + cylinder.getVolume());


        }
    }
}
