package ss17_binary_file_serialization.bai_tap.bai1.controller;

import ss17_binary_file_serialization.bai_tap.bai1.service.impl.ProductServiceImpl;
import ss17_binary_file_serialization.bai_tap.bai1.view.ProductView;

import java.util.Scanner;

public class ProductController {
    public void run(){
        ProductView view= new ProductView();
        Scanner scanner = new Scanner(System.in);
        ProductServiceImpl productService = new ProductServiceImpl();
        int choice;
        do {
            view.displayMenu();
            choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productService.addProduct(view.inputInforProduct());
                    break;
                case 2:
                    System.out.println(productService.getProducts());
                    break;
                case 3:
                   view.displayProductSearch(productService.searchProduct(view.inputNameSearch()));
            }
        }while (choice !=0);
    }
}
