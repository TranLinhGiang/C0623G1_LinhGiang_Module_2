package ss15_exception_handling_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        try {
            System.out.println(" Nhập giá trị của a: ");
            a = scanner.nextInt();

            System.out.println("Nhập giá trị của b: ");
            b = scanner.nextInt();

            System.out.println("Nhập giá trị của c: ");
            c = scanner.nextInt();


        } catch (Exception e) {
            System.out.println("Nhập dữ liệu không đúng.");
        }

        System.out.println("-Giá trị a bạn nhập là: " + a);
        System.out.println("-Giá trị b bạn nhập là: " + b);
        System.out.println("-Giá trị c bạn nhập là: " + c);

        while (a > 0) {
            if (a + b > c && b + c > a && c + a > b) {
                System.out.println("=> Đây là ba cạnh của tam giác.");
                break;
            } else {
                System.out.println("=> Đây không phải là ba cạnh của tam giác.");
                break;
            }
        }
    }
}
