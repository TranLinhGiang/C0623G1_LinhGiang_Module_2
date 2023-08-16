package ss12_java_collection_framework.bai_tap.view;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.List;
import java.util.Scanner;

public class MainView {
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm theo id");
        System.out.println("3. Xoá sản phẩm theo id");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm tăng dần");
        System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
        System.out.println(" Nhập số khác các chức năng trên để hiển thị.");
        System.out.println(" Vui lòng chọn chức năng :");
    }

    public Product inputInfoProduct() {
        System.out.println("nhập id sản phẩm: ");
        int id = scanner.nextInt();

        System.out.println("nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        int price = scanner.nextInt();

        Product newProduct = new Product(id, name, price);
        return newProduct;
    }

    public Product inputEditProduct() {
        System.out.println("Nhap Id moi:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("nhap ten moi:");
        String name = scanner.nextLine();

        System.out.println("nhap gia san pham moi: ");
        int price = Integer.parseInt(scanner.nextLine());

        Product editProduct = new Product(id,name,price);
        return  editProduct;
    }
    public  void  displayProduct(List<Product> products){
        if(products.size()!=0){
            System.out.println("danh sach sanr pham");
            for (Product product:
                 products) {
                System.out.println(product);
            }
        }else {
            System.out.println("khong co danh sach");
        }
    }

    public void displayProductSearchId(Product product){
        String result= "Product{" + "id=" + product.getId() + ", name='" + product.getName() + '\'' + ", price=" + product.getPrice() + '}';
        System.out.println("Tìm thấy: "+result);
    }

}

