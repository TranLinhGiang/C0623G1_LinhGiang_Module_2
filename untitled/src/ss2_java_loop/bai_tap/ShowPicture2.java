package ss2_java_loop.bai_tap;

import java.util.Scanner;

public class ShowPicture2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height;
        System.out.println("Enter heiht: ");
        height = scanner.nextDouble();
        for (double i = 0; i <= height; i++) {
            for (double j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
