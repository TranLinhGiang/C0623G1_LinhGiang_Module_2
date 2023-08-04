package ss3_array_and_method_in_java.bai_tap;
// Gộp mảng.
import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = {"1", "2", "3", "4", "5", "6"};                                        // Tạo một mảng đầu tiên.
        System.out.println("the first array is : " + Arrays.toString(arr1) + ";");             // cho hiển thị ra.
        String[] arr2 = {"7", "8", "9", "10", "11", "12"};                                     // Tạo mảng thứ hai.
        System.out.println("the second array is : " + Arrays.toString(arr2) + ";");            //Cho hiển thị ra.
        String[] arr3 = new String[arr1.length + arr2.length];                                 // Tạo mảng thứ 3 để gộp mảng 1 với mảng 2.

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);                         // coppy lần lượt các mảng ban đầu
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);                      // sang mảng kết quả.

        System.out.println("array after merge : " + Arrays.toString(arr3) + ";");             // hiển thị mảng sau khi gộp lại.

    }
}
