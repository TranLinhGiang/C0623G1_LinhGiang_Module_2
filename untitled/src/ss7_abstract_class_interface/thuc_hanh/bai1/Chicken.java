package ss7_abstract_class_interface.thuc_hanh.bai1;

import ss7_abstract_class_interface.thuc_hanh.bai1.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound () {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
