package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

// Tìm giá trị nhỏ nhất trong mảng.
public class SmallestValue {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of the array : ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element :");
            arr[i] = scanner.nextInt();
        }
        System.out.println("new aray :");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("smallest value :" + min);


    }
}
