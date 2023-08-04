package ss3_array_and_method_in_java.bai_tap;
// Thêm phần tử vào mảng.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class AddElementToArray {
    public static void main(String[] args) {
        String[] arr = {"11", "12", "13", "14", "15"}; // Tạo mảng.
        System.out.println("orgin arr:" + Arrays.toString(arr)); // Hiển thị mảng đầu tiên được khai báo.
        List<String> testList = new ArrayList<>(Arrays.asList(arr)); // Chuyển mảng đầu tiên thành ArrayList.
        testList.add("16");
        testList.add("17");
        testList.add("18");
        testList.add("19");
        testList.add("20"); // Thêm các phần tử trên vào cuối mảng.
        arr = testList.toArray(new String[0]); // Chuyển ArrayList về aray.
        System.out.println("New array:"+ Arrays.toString(arr));
    }

}
