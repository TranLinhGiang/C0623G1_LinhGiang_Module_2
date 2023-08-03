package ss2_java_loop.bai_tap;

import java.util.Scanner;

public class ShowPiture4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height;
        height = scanner.nextDouble();
        System.out.println("Enter height");
        for (double i = 0; i <= height; i++) {
            for (double k = height; k > i; k--) {
                System.out.print(" ");
            }
            for (double j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
