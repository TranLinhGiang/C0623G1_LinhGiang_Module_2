package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class MaximumValueArray2D {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap chieu dai cua mang");
        int length= scanner.nextInt();
        int[] arr= new int[length];
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                System.out.println("nhap phan tu cua mang thu nhat");
                arr[i]= scanner.nextInt();
                System.out.println("Nhap phan tu cua mang thu hai");
                arr[j]=scanner.nextInt();
            }

        }
    }
}
// chua xong