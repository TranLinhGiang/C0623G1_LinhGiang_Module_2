package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class MaximumValueArray2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ma tran.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {12, 67, 0}
        };
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.print("The maximum value is:" + max);
    }
}
