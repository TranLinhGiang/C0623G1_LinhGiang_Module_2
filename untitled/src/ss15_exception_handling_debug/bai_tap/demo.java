package ss15_exception_handling_debug.bai_tap;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap canh a: ");
            a = scanner.nextInt();
            System.out.println("Nhap canh b: ");
            b = scanner.nextInt();
            System.out.println("Nhap canh c: ");
            c = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("du lieu ban nhap khong dung ");
        }
        System.out.println("canh a cua ban la: " + a);
        System.out.println("canh b cua ban la: " + b);
        System.out.println("canh c cua ban la: " + c);

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("canh cua tam giac phai lon hon 0.");
        }
        while (a>0){
            if(a+b>c && b+c>a && a+c>b){
                System.out.println(" La ba canh cua tam giac");
                break;
            }else {
                System.out.println("Khong phai canh cua tam giac");
                break;
            }
        }
    }

}
