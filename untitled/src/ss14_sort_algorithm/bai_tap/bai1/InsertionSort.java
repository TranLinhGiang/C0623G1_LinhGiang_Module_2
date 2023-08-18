package ss14_sort_algorithm.bai_tap.bai1;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int size = scanner.nextInt();

        int[] list = new int[size];
        System.out.println(" Nhập phần tử con : ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Mảng của bạn là: " + Arrays.toString(list));

        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
        System.out.println("mang sau khi sap xep la: " + Arrays.toString(list));
    }
}