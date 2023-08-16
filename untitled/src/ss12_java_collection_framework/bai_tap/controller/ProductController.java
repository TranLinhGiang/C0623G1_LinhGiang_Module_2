package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.service.impl.ProductServiceImpl;
import ss12_java_collection_framework.bai_tap.view.MainView;

import java.util.Scanner;

public class ProductController {
    public void run(){
        MainView view = new MainView();
        Scanner scanner= new Scanner(System.in);
        ProductServiceImpl productService= new ProductServiceImpl();
        int choice;
        do {
            view.showMenu();
            choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productService.addProduct(view.inputInfoProduct());
                    break;
                case 2:
                    productService.editProductById(view.inputInfoProduct().getId(), view.inputEditProduct());
                    break;
                case 3:
                    productService.removeProductById(view.inputInfoProduct().getId());
                case 4:
                    view.displayProduct(productService.displayProductById());
                case 5:

            }
        }while (choice !=7);

    }
}
