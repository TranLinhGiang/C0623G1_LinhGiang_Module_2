package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        String Chain;
        int count = 0;
        char characters = 'a';// ký tự d
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi để kiểm tra : ");
        Chain = scanner.nextLine();
        for (int i = 0; i < Chain.length(); i++) {
            if (Chain.charAt(i) == characters) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("khong co");
        }
        System.out.println("Số lần xuất hiện của ký tự: " + characters + " trong chuỗi " + "là : " + count);
    }
}
