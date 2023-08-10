package ss7_abstract_class_interface.bai_tap.bai1;

public class Main {
    public static void main(String[] args) {
        Resizeable [] shapes = {new Square(5),new Rectangle(15,7),new Circle(7)};
        for (Resizeable value: shapes) {
            System.out.println("\n" +
                    "Before size increase = "+value);
            double percent = Math.random()*100;
            value.resize(percent);
            System.out.println("After size increase = "+value +"%");
        }
    }
}
