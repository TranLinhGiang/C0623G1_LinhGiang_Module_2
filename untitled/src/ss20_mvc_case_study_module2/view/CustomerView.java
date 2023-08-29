package ss20_mvc_case_study_module2.view;

import ss20_mvc_case_study_module2.controllers.CustomerController;
import ss20_mvc_case_study_module2.model.persion.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final Scanner scanner = new Scanner(System.in);
    // regex de fix loi;////////////////////////////////////////////////////////////////////////
    private final CustomerController customerController = new CustomerController();

    public void runMenuCustomer() {
        customerManagement();
        System.out.println("Nhap lua chon cua ban: ");
        int choiceCustomer = Integer.parseInt(scanner.nextLine());
        switch (choiceCustomer) {
            case 1:
                displayListCustomer(customerController.getList());
                break;
            case 2:
                customerController.add(inputCustomer());
                break;
            case 3:
                customerController.editCustomer(inputEditCustomer(), inputCustomer());
                break;
            case 4:
                customerController.deleteCustomer(inputDeleteCustomer());
                break;
            case 5:
                List<Customer> customers = customerController.searchCustomer(inputSearchCustomer());
                System.out.println(customers);
                break;
            case 6:
                break;
        }
    }

    public void customerManagement() {
        System.out.println("=== Menu Customer Management ===");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customers");
        System.out.println("3. Edit customers");
        System.out.println("4. Delete customers");
        System.out.println("5. Search by name customers");
        System.out.println("6. Return main menu");
    }

    public void displayListCustomer(List<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public Customer inputCustomer() {
        String id = null;
        try {
            System.out.println("Nhap id cua khach hang: ");
            id = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Ban nhap sai dinh dang");
        }

        String name;
        System.out.println("Nhap ten cua khach hang: ");
        name = scanner.nextLine();

        String dateOfBirth;
        System.out.println("Nhap ngay thang nam sinh cua khach hang: ");
        dateOfBirth = scanner.nextLine();

        String gender;
        System.out.println("Nhap gioi tinh cua khach hang: ");
        gender = scanner.nextLine();

        String identityCardNumber;
        System.out.println("Nhap so chung minh khach hang: ");
        identityCardNumber = scanner.nextLine();

        String phoneNumber;
        System.out.println("Nhap so dien thoai khach hang: ");
        phoneNumber = scanner.nextLine();

        String email;
        System.out.println("Nhap email cua khach hang: ");
        email = scanner.nextLine();

        String customerType;
        System.out.println("Nhap loai khach hang:");
        System.out.println("( Diamond, Platinum, Gold, Silver)");
        customerType = scanner.nextLine();

        String address;
        System.out.println("Nhap dia chi cua khach hang: ");
        address = scanner.nextLine();
        Customer customer = new Customer(id, name, dateOfBirth, gender, identityCardNumber, phoneNumber, email, customerType, address);
        return customer;
    }

    public String inputEditCustomer() {
        String string;
        System.out.println("Nhap id ban muon sua: ");
        string = scanner.nextLine();
        return string;
    }

    public String inputDeleteCustomer() {
        System.out.println("Nhap id ban muon xoa: ");
        return scanner.nextLine();
    }

    public String inputSearchCustomer() {
        System.out.println("Nhap ten khach hang ban muon tim: ");
        return scanner.nextLine();
    }
}
