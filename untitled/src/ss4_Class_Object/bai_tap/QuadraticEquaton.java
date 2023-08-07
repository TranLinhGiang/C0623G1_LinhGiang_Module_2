package ss4_Class_Object.bai_tap;

import java.util.Scanner;

public class QuadraticEquaton {
    double a;
    double b;
    double c;

    public QuadraticEquaton() {
    }
    public QuadraticEquaton(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // tạo delta;
    public double getDiscriminant() {
        return Math.pow(this.b,2) - 4 * this.a * this.c;
    }
    //nếu delta >0 thì trả về 2 nghiệm dưới đây là Root1 và Root2
    public double getRoot1() {
        return -(this.b) + (Math.sqrt(getDiscriminant()) / (2 * this.a));
    }

    public double getRoot2() {
        return -(this.b) - (Math.sqrt(getDiscriminant()) / (2 * this.a));
    }

    // nếu delta = 0 thì phương trình có 2 nghiêmh kép dưới đây.
    public double solution() {
        return (-(this.b) / 2 * this.a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập số c: ");
        double c = scanner.nextDouble();

        QuadraticEquaton quadraticEquaton = new QuadraticEquaton(a, b, c);
        if (a == 0) {
            System.out.println("vui lòng nhập a > 0 !");
        }
        if (quadraticEquaton.getDiscriminant() == 0) {
            // phương trình có 2 nghiệm kép.
            System.out.println("Phương trình có 2 nghiệm kép: " + "x1" + "=" + "x2" + ": " + quadraticEquaton.solution());
        } else if (quadraticEquaton.getDiscriminant() > 0) {
            // phương trình có 2 nghiệm phân biệt.
            System.out.println("Phương trình có 2 nghiệm phân biệt là : " + quadraticEquaton.getRoot1() + " " + "và" + " " + quadraticEquaton.getRoot2());
        } else
            System.out.println("Phương trình vô nghiệm. ");
    }
}
