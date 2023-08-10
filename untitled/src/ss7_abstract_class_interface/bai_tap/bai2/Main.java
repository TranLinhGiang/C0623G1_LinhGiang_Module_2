package ss7_abstract_class_interface.bai_tap.bai2;

import ss7_abstract_class_interface.bai_tap.bai1.Circle;
import ss7_abstract_class_interface.bai_tap.bai1.Rectangle;
import ss7_abstract_class_interface.bai_tap.bai1.Resizeable;
import ss7_abstract_class_interface.bai_tap.bai1.Shape;
import ss7_abstract_class_interface.bai_tap.bai1.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(4, "blue", true),
                new Rectangle(1, 2),
                new Circle(7),
                new Rectangle(4, 5)};
        for (Shape shape :
                shapes) {
            System.out.println(shape);
        }
    }
}
