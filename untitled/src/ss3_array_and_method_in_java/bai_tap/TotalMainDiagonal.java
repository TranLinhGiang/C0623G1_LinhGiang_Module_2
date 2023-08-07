package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class TotalMainDiagonal {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng ma trận: ");
        n = scanner.nextInt();
        int A[][] = new int[n][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận của bạn là:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println(" ");
        }
        // các phần tử nằm trên đường chéo chính
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i][i];
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}




