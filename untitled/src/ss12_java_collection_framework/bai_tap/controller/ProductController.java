package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.service.impl.ProductServiceImpl;
import ss12_java_collection_framework.bai_tap.view.ProductView;

import java.util.Scanner;

public class ProductController {
    public void run(){
        ProductView view = new ProductView();
        Scanner sc = new Scanner(System.in);
        ProductServiceImpl productService = new ProductServiceImpl();
        int choice;
        do {
            view.displayMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    productService.addProduct(view.inputInfoProduct());
                    break;
                case 2:
                    productService.editProductbyId(view.inputId(),view.inputEditProduct());
                    break;
                case 3:
                    productService.removeProductById(view.inputIdRemove());
                    break;
                case 4:
                    view.displayProduct(productService.getProducts());
                    break;
                case 5:
                    view.displayProductSearch(productService.searchProduct(view.inputNameSearch()));
                    break;
                case 6:
                    int option = view.optionsSortProduct();
                    if (option==1) {
                        productService.sortListByPriceaAscending();
                    } else if (option==2) {
                        productService.sortListByPriceaDecrease();
                    } else {
                        view.choiceErrorMesseger();
                    }
                    break;
                case 0:
                    view.displayExitMesseger();
                    break;
                default:
                    view.choiceErrorMesseger();
            }
        } while (choice!=0);
    }
}
