package ss14_sort_algorithm.bai_tap.bai2;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println(" Nhập phần tử con trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng lúc đầu của bạn là: " + Arrays.toString(array));
        insertionSort(array);
    }

    public static void insertionSort (int[] array) {
        int n= array.length;
        for (int i = 1; i < n ; i++) {
            int key = array[i];
            int j = i-1;

            while (j>=0 && array[j]>= key){
                array[j+1]= array[j];
                j--;
            }
            array[j+1]= key;
        }
        System.out.println("Mảng sắp xếp các số theo trật tự tăng dần là: "+ Arrays.toString(array));
    }
}
