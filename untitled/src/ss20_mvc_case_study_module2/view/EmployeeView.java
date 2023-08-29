package ss20_mvc_case_study_module2.view;

import ss20_mvc_case_study_module2.controllers.EmployeeController;
import ss20_mvc_case_study_module2.model.persion.Employee;
import ss20_mvc_case_study_module2.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
  private final   Scanner scanner = new Scanner(System.in);
    // regex de fix loi;////////////////////////////////////////////////////////////////////////
    private final EmployeeController employeeController = new EmployeeController();

public void runMenuEmployee(){

    employeeManagement();
    System.out.println(" Nhap lua chon cua ban:");
    int choiceEmployee = Integer.parseInt(scanner.nextLine());
    switch (choiceEmployee){
        case 1:
            displayListEmployee(employeeController.getList());
            break;
        case 2:
            employeeController.add(inputEmployee());
            break;
        case 3:
            employeeController.editEmployee(inputEditEmployee(),inputEmployee());
            break;
        case 4:
            employeeController.deleteEmployee(inputDeleteEmployee());
            break;
        case 5:
            List<Employee> employees = employeeController.searEmployee(inputSearchEmployee());
            System.out.println(employees);
            break;
        case 6:
            break;
    }
}
    public void employeeManagement() {
        System.out.println("=== Menu Employee Management ===");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Delete employee");
        System.out.println("5. Search by name employee");
        System.out.println("6. Return main menu");
    }

public void displayListEmployee(List<Employee> employees){
    for (Employee employee:employees) {
        System.out.println(employee);
    }
}
public Employee inputEmployee(){

    String id;
    do {
        System.out.println("Nhap id cua nhan vien ( id nhan vien theo dinh dang NV-YYYY): ");
        id= scanner.nextLine();
        if (!Regex.idEmployeeRegex(id)){
            System.out.println("sai dinh dang.Vui long nhap lai id: ");
        }
    }while (!Regex.idEmployeeRegex(id));


    String name;
    do {
        System.out.println("Nhap ten cua nhan vien ( Ten nhan vien phai viet hoa cac ky tu dau moi tu: ");
        name= scanner.nextLine();
        if (!Regex.nameEmployeeRegex(name)){
            System.out.println("sai dinh dang.Vui long nhap lai ten: ");
        }
    }while (!Regex.nameEmployeeRegex(name));


    String dateOfBirth;
    System.out.println("Nhap ngay thang nam sinh cua nhan vien: ");
    dateOfBirth= scanner.nextLine();

    String gender;
    System.out.println("Nhap gioi tinh cua nhan vien: ");
    gender = scanner.nextLine();

    String identityCardNumber;
    do {
        System.out.println("Nhap so chung inh cua nhan vien: ");
        identityCardNumber= scanner.nextLine();
        if (!Regex.identityCardEmployee(identityCardNumber)){
            System.out.println("Sai dinh dang, So chung minh phai du 9 hoac 12 so: ");
        }
    }while (!Regex.identityCardEmployee(identityCardNumber));


    String phoneNumber;
    do {
        System.out.println("Nhap so dien thoai cua nhan vien: ");
        phoneNumber= scanner.nextLine();
        if (!Regex.phoneNumberEmployee(phoneNumber)){
            System.out.println("so dien thoai sai dinh dang, so dien thoai bat dau tu 0 va du 10 so: ");
        }
    }while (!Regex.phoneNumberEmployee(phoneNumber));


    String email;
    do {
        System.out.println("Nhap email cua nhan vien: ");
        email= scanner.nextLine();
        if (!Regex.email(email)){
            System.out.println("Ban nhap sai dinh dang email, Vui long nhap lai: ");
        }
    }while (!Regex.email(email));
   ;

    String level;
    System.out.println("Nhap trinh do cua nhan vien:");
    System.out.println("( Trung cap, Cao dang, Dai hoc, Sau dai hoc)");
    level= scanner.nextLine();

    String position;
    System.out.println("Nhap chuc vu cua nhan vien:");
    System.out.println("le tan, Phuc vu, Chuyen vien, Giam sat, Quan ly, Giam doc");
    position= scanner.nextLine();

    String amount;
    System.out.println("Nhap luong nhan vien: ");
    amount= scanner.nextLine();
    Employee employee = new Employee(id,name,dateOfBirth,gender,identityCardNumber,phoneNumber,email,level,position,amount);
    return employee;
}


public String inputEditEmployee(){
    String string;
    System.out.println("Nhap id ban muon sua: ");
    string= scanner.nextLine();
    return string;
}
public String inputDeleteEmployee(){
    System.out.println("Nhap id ban muon xoa: ");
    return scanner.nextLine();
}
public String inputSearchEmployee(){
    System.out.println("Nhap ten nhan vien ban muon tim: ");
    return scanner.nextLine();
}
}
