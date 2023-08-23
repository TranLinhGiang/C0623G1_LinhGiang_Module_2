package ss17_binary_file_serialization.bai_tap.bai1.view;

import ss17_binary_file_serialization.bai_tap.bai1.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("=== CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ===");
        System.out.println("1. Thêm sản phẩm: ");
        System.out.println("2. Hiển thị sản phẩm: ");
        System.out.println("3. Tìm kiếm sản phẩm: ");
        System.out.println("Mời chọn chức năng: ");
    }

    public Product inputInforProduct() {
        int id = 0;
        do {
            try {
                System.out.println("Nhập id của sản phẩm: ");
                id = Integer.parseInt(scanner.nextLine());
                if (id <= 0) {
                    System.out.println("Id phải lớn hơn 0");
                }
            } catch (Exception e) {
                System.out.println("bạn nhâp sai định dang. Id phải là số");
            }
        } while (id <= 0);

        String name;
        do {
            try {
                System.out.println("Nhập tên của sản phẩm:");
                name = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Bạn nhập sai định dạng");
            }
        } while (true);


        double price = 0;
        do {
            try {
                System.out.println("Nhập giá của sản phẩm: ");
                price = Double.parseDouble(scanner.nextLine());
                if (price <= 0) {
                    System.out.println("Giá của sản phẩm phải là số tiền nguyên dương.");
                }
            } catch (Exception e) {
                System.out.println("Giá của sản phẩm phải là số.");
            }
        } while (price <= 0);


        String manufactured = null;

        try {
            System.out.println("Nhập loại hàng sản xuất: ");
            manufactured = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Loại hàng bạn nhập sai định dạng");
        }


        System.out.println("Hãy mô tả sản phẩm: ");
        String describe = scanner.nextLine();

        Product newProduct = new Product(id, name, price, manufactured, describe);
        return newProduct;
    }

    public void displayProduct(List<Product> products) {

        if (products.size() == 0) {
            System.out.println("Danh sách trống");
        } else {
            System.out.println("Danh sách sản phẩm: ");
            for (Product product :
                    products) {
                System.out.println(product);
            }
        }
    }

    public void displayProductSearch(Product product) {

        String result = "Product {" + "id = "
                + product.getId()
                + "name = " + product.getName()
                + "price = " + product.getPrice()
                + "manufactured = " + product.getManufactured();
        System.out.println("Tìm thấy sản phẩm." + result);
    }

    public String inputNameSearch() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm: ");
        String name = scanner.nextLine();
        return name;
    }
}
