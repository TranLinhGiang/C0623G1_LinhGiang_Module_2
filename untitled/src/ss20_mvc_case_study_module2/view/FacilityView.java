package ss20_mvc_case_study_module2.view;

import ss20_mvc_case_study_module2.controllers.FacilityController;
import ss20_mvc_case_study_module2.model.facility.Facility;
import ss20_mvc_case_study_module2.model.facility.House;
import ss20_mvc_case_study_module2.model.facility.Room;
import ss20_mvc_case_study_module2.model.facility.Villa;
import ss20_mvc_case_study_module2.utils.Regex;

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
        } while (choice <= 0 || choice > 4);

        String rentalType;
        String roomStandard;
        String usableArea;
        int poolArea = 0;
        int numberOfFloors = 0;
        String freeService;
        String id;
        String name;
        int rentalCosts = 0;
        int maximumNumberOfPeople = 0;

        switch (choice) {
            case 1:
                do {
                    System.out.println("nhap ma dich vu (SVVL-YYYY):  ");
                    id = scanner.nextLine();
                    if (!Regex.idVilla(id)) {
                        System.out.println("Ban nhap sai sinh dang id cua villa. Vui long nhap (SVVL-YYYY): ");
                    }
                } while (!Regex.idVilla(id));

                do {
                    System.out.println("Nhap ten dich vu: ");
                    name = scanner.nextLine();
                    if (!Regex.nameValidate(name)) {
                        System.out.println(" ## Ban nhap sai dinh dang.Vui long nhap phai viet hoa cac ky tu dau tien.Vui long nhap lai ## ");
                    }
                } while (!Regex.nameValidate(name));

                System.out.println("Nhap dien tich phong( >0 & >30m2 ): ");
                usableArea = scanner.nextLine();
                do {
                    try {
                        System.out.println("Nhap chi phi thue ( > 0 ): ");
                        rentalCosts = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("## Ban nhap sai dinh dang. Vui long nhap lai ##");
                    }
                } while (rentalCosts <= 0);

                do {
                    try {
                        System.out.println("Nhap so luong nguoi toi da ( >0 & <20): ");
                        maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("## Ban nhap sai dinh dang,so luong nguoi phai la so. Vui long nhap lai ## ");
                    }
                } while (maximumNumberOfPeople <= 0 || maximumNumberOfPeople >= 20);

                do {
                    System.out.println("Nhap kieu thue ( Year || Month || Day || Hourly): ");
                    rentalType = scanner.nextLine();
                    if (!Regex.rentalType(rentalType)) {
                        System.out.println("## Ban nhap sai dinh dang, hay nhap theo mau da duoc de xuat. Vui long nhap lai ##");
                    }
                } while (!Regex.rentalType(rentalType));


                System.out.println("Nhap tieu chuan phong: ");
                roomStandard = scanner.nextLine();

                do {
                    try {
                        System.out.println("Nhap dien tich ho boi( > 30m2 ): ");
                        poolArea = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("## Ban nhap sai dinh dang, dien tich phai la so. Vui long nhap lai ##");
                    }
                } while (poolArea <= 30);

                do {
                    try {
                        System.out.println("Nhap so tang: ");
                        numberOfFloors = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println(" ## Ban nhap sai dinh dang, so tang phai la so.Vui long nhap lai ##");
                    }
                } while (numberOfFloors <= 0);


                facility = new Villa(id, name, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, poolArea, numberOfFloors);
                break;
            case 2:
                do {
                    System.out.println("nhap ma dich vu ( SVHO-YYYY ):  ");
                    id = scanner.nextLine();
                    if (!Regex.idHouse(id)) {
                        System.out.println("## Nhap sai dinh dang.Vui long nhap lai ##");
                    }
                } while (!Regex.idHouse(id));

                do {
                    System.out.println("Nhap ten dich vu: ");
                    name = scanner.nextLine();
                    if (!Regex.nameValidate(name)) {
                        System.out.println("## Sai dinh dang.Vui long nhap dung dinh dang.Chu cai dauphai viet hoa ##");
                    }
                } while (!Regex.nameValidate(name));


                System.out.println("Nhap dien tich phong( >0 & >30m2 ): ");
                usableArea = scanner.nextLine();
                do {
                    try {
                        System.out.println("Nhap chi phi thue ( > 0 & <20 ): ");
                        rentalCosts = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("## Nhap sai dinh dang.Vui long nhap lai ## ");
                    }
                } while (rentalCosts <= 0);

                do {
                    try {
                        System.out.println("Nhap so luong nguoi toi da ( 0 < X < 20 ): ");
                        maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("## Nhap sai dinh dang, so luong nguoi la so duong.Vui long nhap lai ##");
                    }

                } while (maximumNumberOfPeople <= 0 || maximumNumberOfPeople >= 20);

                do {
                    System.out.println("Nhap kieu thue ( Year || Month || Day || Hourly): ");
                    rentalType = scanner.nextLine();
                    if (!Regex.rentalType(rentalType)) {
                        System.out.println("## Ban nhap sai dinh dang, hay nhap theo mau da duoc de xuat. Vui long nhap lai ##");
                    }
                } while (!Regex.rentalType(rentalType));


                System.out.println("Nhap tieu chuan phong: ");
                roomStandard = scanner.nextLine();
                do {
                    try {
                        System.out.println("Nhap so tang: ");
                        numberOfFloors = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("## Nhap sai dinh dang,so tang phai la mot so.Vui long nhap lai ##");
                    }

                } while (numberOfFloors <= 0);


                facility = new House(id, name, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, numberOfFloors);
                break;

            case 3:
                do {
                    System.out.println("nhap ma dich vu:  ");
                    id = scanner.nextLine();
                    if (!Regex.idRoom(id)) {
                        System.out.println("Ban nhap sai sinh dang id cua villa. Vui long nhap (SVRO-YYYY): ");
                    }

                } while (!Regex.idRoom(id));
                do {
                    System.out.println("Nhap ten dich vu: ");
                    name = scanner.nextLine();
                    if (!Regex.nameValidate(name)) {
                        System.out.println("Nhap sai dinh dang,phai ghi hoa owr chu cai dau. Vui long nhap lai");
                    }
                } while (!Regex.nameValidate(name));


                System.out.println("Nhap dien tich phong: ");
                usableArea = scanner.nextLine();
                do {
                    System.out.println("Nhap chi phi thue ( > 0 ): ");
                    rentalCosts = Integer.parseInt(scanner.nextLine());
                } while (rentalCosts <= 0);

                do {
                    System.out.println("Nhap so luong nguoi toi da ( < 20 ): ");
                    maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                } while (maximumNumberOfPeople >= 20);


                do {
                    System.out.println("Nhap kieu thue ( Year || Month || Day || Hourly): ");
                    rentalType = scanner.nextLine();
                    if (!Regex.rentalType(rentalType)) {
                        System.out.println("## Ban nhap sai dinh dang, hay nhap theo mau da duoc de xuat. Vui long nhap lai ##");
                    }
                } while (!Regex.rentalType(rentalType));

                do {
                    System.out.println("Nhap dich vu mien phi di kem (wifi || air conditional || water) : ");
                    freeService = scanner.nextLine();
                    if (!Regex.freeService(freeService)) {
                        System.out.println("## Nhap sai dinh dang.Vui long chon lai ##");
                    }
                } while (!Regex.freeService(freeService));


                facility = new Room(id, name, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, freeService);
                break;
            case 4:
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
        return facility;
    }
}
