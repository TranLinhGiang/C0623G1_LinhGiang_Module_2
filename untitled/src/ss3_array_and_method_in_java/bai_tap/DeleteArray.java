package ss3_array_and_method_in_java.bai_tap;
// Xóa phần tử trong mảng.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "6","7","8","9","10"};
        System.out.println("the first array is:" + Arrays.toString(arr)); // Hiển thị mảng.

        List<String> testList = new ArrayList<>(Arrays.asList(arr));// Chuyển mảng thành ArrayList.

        testList.remove(5); // Vị trí muốn xóa ở trong mảng.
        testList.remove(4);
        arr = testList.toArray(new String[0]);// chuyển từ ArrayList sang arr.

        System.out.println("result array:" + Arrays.toString(arr));
    }
}
