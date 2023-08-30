package ss20_mvc_case_study_module2.view;

import ss20_mvc_case_study_module2.controllers.CustomerController;
import ss20_mvc_case_study_module2.model.persion.Customer;
import ss20_mvc_case_study_module2.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final Scanner scanner = new Scanner(System.in);
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
        String id;
        do {
            System.out.println("Nhap id cua khach hang( id khach hang theo dinh dang KH-YYYY): ");
            id = scanner.nextLine();
            if (!Regex.idCustomerRegex(id)) {
                System.out.println("Vui long nhap lai id: ");
            }
        } while (!Regex.idCustomerRegex(id));


        String name;
        do {
            System.out.println("Nhap ten cua khach hang( Ten nhan khach hang viet hoa cac ky tu dau moi tu: ");
            name = scanner.nextLine();
            if (!Regex.nameCustomerRegex(name)) {
                System.out.println("Vui long nhap lai ten khach hang: ");
            }
        } while (!Regex.nameCustomerRegex(name));


        String dateOfBirth;
        System.out.println("Nhap ngay thang nam sinh cua khach hang: ");
        dateOfBirth = scanner.nextLine();

        String gender;
        do {
            System.out.println("Nhap gioi tinh cua khach hang: ");
            gender = scanner.nextLine();
            if (!Regex.genderEmployeeAndCustomer(gender)) {
                System.out.println("Ban nhap sai dinh dang.Vui long nhap (Nam || Nu || LGBT): ");
            }
        } while (!Regex.genderEmployeeAndCustomer(gender));


        String identityCardNumber;
        do {
            System.out.println("Nhap so chung minh khach hang ( CMND phai du 9 hoac 12 so): ");
            identityCardNumber = scanner.nextLine();
            if (!Regex.identityCardCustomer(identityCardNumber)) {
                System.out.println("Vui long nhap lai chung minh cua khach hang: ");
            }
        } while (!Regex.identityCardCustomer(identityCardNumber));


        String phoneNumber;
        do {
            System.out.println("Nhap so dien thoai khach hang ( Sdt phai bat dau tu 0 va du 10 so) : ");
            phoneNumber = scanner.nextLine();
            if (!Regex.phoneNumberCustomer(phoneNumber)) {
                System.out.println("Vui long nhap lai so dien thoai: ");
            }
        } while (!Regex.phoneNumberCustomer(phoneNumber));


        String email;
        do {
            System.out.println("Nhap email cua khach hang: ");
            email = scanner.nextLine();
            if (!Regex.emailCustomer(email)) {
                System.out.println("Vui long nhap dung dinh dang cua email (***@gmail.com): ");
            }
        } while (!Regex.emailCustomer(email));


        String customerType;
        do {
            System.out.println("Nhap loai khach hang:");
            customerType = scanner.nextLine();
            if (!Regex.typeCustomer(customerType)) {
                System.out.println("Nhap sai dinh dang.Vui long nhap theo loai khach hang ( Diamond, Platinum, Gold, Silver): ");
            }
        } while (!Regex.typeCustomer(customerType));


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
