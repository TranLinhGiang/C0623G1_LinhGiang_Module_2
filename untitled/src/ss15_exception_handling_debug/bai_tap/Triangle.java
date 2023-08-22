package ss15_exception_handling_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        do {
            try {
                do {
                    try {
                        System.out.print(" Nhập giá trị của a: ");
                        a = Integer.parseInt(scanner.nextLine());
                        if (a <= 0) {
                            System.out.println("Vui lòng nhập giá trị lớn hơn 0");
                        }
                    } catch (NumberFormatException exception) {
                        System.out.println("Không đúng định dạng");
                    }
                } while (a <= 0);

                do {
                    try {
                        System.out.print(" Nhập giá trị của b: ");
                        b = Integer.parseInt(scanner.nextLine());
                        if (b <= 0) {
                            System.out.println("Vui lòng nhập giá trị lớn hơn 0");
                        }
                    } catch (NumberFormatException exception) {
                        System.out.println("Không đúng định dạng");

                    }
                } while (b <= 0);

                do {
                    try {
                        System.out.print(" Nhập giá trị của c: ");
                        c = Integer.parseInt(scanner.nextLine());
                        if (c <= 0) {
                            System.out.println("Vui lòng nhập giá trị lớn hơn 0");
                        }
                    } catch (NumberFormatException exception) {
                        System.out.println("Không đúng định dạng");
                    }
                } while (c <= 0);

            } catch (Exception e) {
                System.out.println("Nhập dữ liệu không đúng, cạnh của tam giác phải là số.");
                break;
            }
        } while (a + b < c || b + c < a || c + a < b);

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("=> Đây là ba cạnh của tam giác.");
        } else {
            System.out.println("=> Đây không phải là ba cạnh của tam giác.");
        }
    }
}
