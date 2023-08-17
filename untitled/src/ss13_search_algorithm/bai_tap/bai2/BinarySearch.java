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
            System.out.println("Nhập phần tử con trong mảng: ");
            System.out.println(i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int value;
        System.out.println("Nhập số bạn cần tìm: ");
        value= scanner.nextInt();

        BinarySearch binary = new BinarySearch();
        int index = binary.binarySearch(arr, value, 0, arr.length - 1);
        System.out.println(index);
    }

    public int binarySearch(int[] array, int value, int left, int right) {
        if (right >= left) {
            int mid = (right + left) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] > value) {
                right = mid - 1;
                return binarySearch(array, value, left, right);
            } else {
                left = mid + 1;
                return binarySearch(array, value, left, right);
            }
        }
        return -1; // Không tìm thấy trả về -1.
    }
}
