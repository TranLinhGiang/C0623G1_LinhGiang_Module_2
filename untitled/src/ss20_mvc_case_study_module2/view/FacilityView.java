package ss20_mvc_case_study_module2.view;

import ss20_mvc_case_study_module2.controllers.FacilityController;
import ss20_mvc_case_study_module2.model.facility.Facility;
import ss20_mvc_case_study_module2.model.facility.House;
import ss20_mvc_case_study_module2.model.facility.Room;
import ss20_mvc_case_study_module2.model.facility.Villa;

import java.util.List;
import java.util.Scanner;

public class FacilityView {
    private final Scanner scanner = new Scanner(System.in);
    private final FacilityController facilityController = new FacilityController();


    public void runMenuFacility() {
        facilityManagement();
        System.out.println("Nhap lua chon cua ban: ");
        int choiceFacility = Integer.parseInt(scanner.nextLine());
        do {
            switch (choiceFacility) {
                case 1:
                    displayListFacility(facilityController.getList());
                    break;
                case 2:
                    facilityController.add(inputFacility());
                    break;
                case 3:
                    System.out.println("Bao tri");
                    break;
                case 4:
                    facilityController.deleteFacility(String.valueOf(inputFacility()));
                    break;
                case 5:
                    break;
                default:
            }
            break;
        } while (choiceFacility != 5);

    }

    public void facilityManagement() {
        System.out.println("=== MENU FACILITY ===");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance.");
        System.out.println("4. Delete facility");
        System.out.println("5. Return main menu");
    }

    public void displayListFacility(List<Facility> facilities) {
        for (Facility facility : facilities) {
            System.out.println(facility);
        }
    }

    public Facility inputFacility() {
        Facility facility = null;
        int choice;
        do {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");

            choice = Integer.parseInt(scanner.nextLine());
            if (choice <= 0 || choice > 3) {
                System.out.println("Chon khong dung chuong trinh.Vui long chon lai: ");

            }
        } while (choice <=0 || choice > 4);

        String rentalType;    // Kiểu thuê (year, month,day,hourly)
        String roomStandard;  // tiêu chuẩn phòng
        int usableArea;         // diện tích phòng
        int poolArea;          // dien tich ho boi
        int numberOfFloors;   //so tang
        String freeService;   // dich vu mien phi
        String id;      // ma dich vu
        String name;   // ten dich vu
        int rentalCosts; //chi phi thuê
        int maximumNumberOfPeople; //số lượng người tối đa


        switch (choice) {
            case 1:
                System.out.println("nhap ma dich vu:  ");
                id = scanner.nextLine();

                System.out.println("Nhap ten dich vu: ");
                name = scanner.nextLine();

                System.out.println("Nhap dien tich phong: ");
                usableArea = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap chi phi thue: ");
                rentalCosts = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap so luong nguoi toi da: ");
                maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap kieu thue ( Year || Month || Day || Hourly): ");
                rentalType = scanner.nextLine();

                System.out.println("Nhap tieu chuan phong: ");
                roomStandard = scanner.nextLine();


                System.out.println("Nhap dien tich ho boi: ");
                poolArea = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap so tang: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());

                facility = new Villa(id, name, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, poolArea, numberOfFloors);
                break;
            case 2:
                System.out.println("nhap ma dich vu:  ");
                id = scanner.nextLine();

                System.out.println("Nhap ten dich vu: ");
                name = scanner.nextLine();

                System.out.println("Nhap dien tich phong: ");
                usableArea = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap chi phi thue: ");
                rentalCosts = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap so luong nguoi toi da: ");
                maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap kieu thue ( Year || Month || Day || Hourly): ");
                rentalType = scanner.nextLine();

                System.out.println("Nhap tieu chuan phong: ");
                roomStandard = scanner.nextLine();

                System.out.println("Nhap so tang: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());

                facility = new House(id, name, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, numberOfFloors);
                break;

            case 3:
                System.out.println("nhap ma dich vu:  ");
                id = scanner.nextLine();

                System.out.println("Nhap ten dich vu: ");
                name = scanner.nextLine();

                System.out.println("Nhap dien tich phong: ");
                usableArea = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap chi phi thue: ");
                rentalCosts = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap so luong nguoi toi da: ");
                maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap kieu thue ( Year || Month || Day || Hourly): ");
                rentalType = scanner.nextLine();

                System.out.println("Nhap dich vu mien phi di kem (wifi || air conditional || water) : ");
                freeService = scanner.nextLine();

                facility = new Room(id, name, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, freeService);
                break;
            case 4:
                break;
        }
        return facility;
    }
}
