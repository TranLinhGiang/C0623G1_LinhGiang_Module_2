package ss8_mvc.view;

import ss8_mvc.controller.EditController;

import java.util.Scanner;

public class ListAppView {
    public void showList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");
        System.out.println("Chọn chức năng theo số (để tiếp tục):");
        System.out.println("0. Không có tác vụ: ");
        System.out.println("1. Thêm mới giảng viên hoặc học sinh:");
        System.out.println("1. Thêm mới giảng viên hoặc học sinh:");
        System.out.println("2. Xóa giảng viên hoặc học sinh:");
        System.out.println("3. Xem danh sách giảng viên hoặc học sinh:");
        System.out.println("4. Thoát ");
        System.out.println("Chọn chức năng");

    }
    public void editList() throws Exception{
        int option;
        Scanner sc = new Scanner(System.in);
        do {
            showList();
            System.out.println("Mời bạn chọn chức năng :");
            option = Integer.parseInt(sc.nextLine());
        }while (option <0 || option >4);

        if(option == 4)
            System.exit(0);

        EditController editController = new EditController();
    }
}
