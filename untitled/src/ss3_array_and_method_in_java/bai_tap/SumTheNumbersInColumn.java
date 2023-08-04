package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class SumTheNumbersInColumn {
    public static void main(String[] args) {
        int current, column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        current = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        column = scanner.nextInt();
        int[][] A = new int[current][column];
        for (int i = 0; i < current; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < current; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("vui lòng nhập vị trí cột bạn muốn tính tổng:");
        int columnn = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i][columnn];
        }
        System.out.println("Tổng bằng: " + sum);
    }

}
