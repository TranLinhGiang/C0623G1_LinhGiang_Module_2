package ss13_search_algorithm.bai_tap.bai2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử con trong mảng: " + i);
            arr[i] = scanner.nextInt();

        }
        System.out.println(" Mảng của bạn vừa nhập và được sắp sếp là: ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        BinarySearch main = new BinarySearch();
        System.out.println("Nhập phần tử bạn cần tìm: ");
        int value = scanner.nextInt();


        int index = main.binarySearch(arr, 0, arr.length - 1, value);
        System.out.println("Giá trị " + value + ": " + index);
    }

    public int binarySearch(int[] arr, int left, int right, int value) {
        int mid = left + (right - left) / 2;
        if (value > 0) {
            if (right >= left) {
                if (arr[mid] == value) {
                    return mid;
                }
                if (arr[mid] < value) {
                    left = mid + 1;
                    return binarySearch(arr, left, right, value);
                } else {
                    right = mid - 1;
                    return binarySearch(arr, left, right, value);
                }
            }
        }
        return -1;
    }
}


