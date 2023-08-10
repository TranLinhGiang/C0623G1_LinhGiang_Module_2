package ss7_abstract_class_interface.bai_tap.bai2;

import ss7_abstract_class_interface.bai_tap.bai1.Resizeable;
import ss7_abstract_class_interface.bai_tap.bai1.Shape;

public class Square extends Shape implements Resizeable {
    private double height = 6;

    public Square() {
    }

    public Square(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.height;
    }

    @Override
    public void resize(double percent) {
        this.setHeight(this.height *= (1+(percent/100)));
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + this.height +
                "Area=" + this.getArea() +
                '}';
    }

}
