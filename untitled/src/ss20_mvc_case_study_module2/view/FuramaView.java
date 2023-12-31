package ss20_mvc_case_study_module2.view;

import java.util.Scanner;

public class FuramaView {
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeView employeeView = new EmployeeView();
    private final CustomerView customerView = new CustomerView();

    private final FacilityView facilityView = new FacilityView();

    public void run() {
        int choice;
        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeView.runMenuEmployee();
                    break;
                case 2:
                    customerView.runMenuCustomer();
                    break;
                case 3:
                    facilityView.runMenuFacility();
                case 4:
                    bookingManagement();
                    int option3;
                    do {
                        option3 = Integer.parseInt(scanner.nextLine());
                    } while (option3 != 6);
                    break;
                case 5:
                    promotionManagement();
                    int option4;
                    do {
                        option4 = Integer.parseInt(scanner.nextLine());
                    } while (option4 != 3);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

        } while (choice != 5);
    }

    public void showMenu() {
        System.out.println("==== MENU CHINH ===");
        System.out.println("1.Employee Management ");
        System.out.println("2. Customer Management ");
        System.out.println("3. Facility Management  ");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit ");
        System.out.println(" Nhap lua chon cua ban:");
    }

    public void bookingManagement() {
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
    }

    public void promotionManagement() {
        System.out.println("1. Display list customers use service.");
        System.out.println("2. Display list customers get voucher.");
        System.out.println("3. Return main menu");
    }
}
