package docghifile;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            int n;
            System.out.println("Nhap vao mot so: ");
            n = scanner.nextInt();
            boolean check = true;
            if (n < 2) {
                check = false;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println(n + " la so nguyen to");
            } else {
                System.out.println(n + " khong phai la so nguyen to");
            }
        } while (true);
    }
}
