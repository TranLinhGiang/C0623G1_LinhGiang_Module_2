package ss20_mvc_case_study_module2.repository.impl;

import ss20_mvc_case_study_module2.model.persion.Employee;
import ss20_mvc_case_study_module2.repository.IEmployeeRepository;
import ss20_mvc_case_study_module2.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private final String PATH_FILE = "F:\\module 2\\C0623G1_LinhGiang_Module_2\\untitled\\src\\ss20_mvc_case_study_module2\\data\\data.csv";
    private final String COMMA = ",";


    @Override
    public void editEmployee(String id, Employee employee) {
        List<Employee> employeeList = getList();
        int index;
        for (Employee data : employeeList) {
            if (data.getId().equals(id)) {
                index = employeeList.indexOf(data);
                employeeList.set(index, employee);
            }
        }
        FileUtils.writeFile(PATH_FILE, convertToString(employeeList));
    }

    @Override
    public void deleteEmployee(String id) {
        int index;
        List<Employee> employeeList = getList();
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                index = employeeList.indexOf(employee);
                employeeList.remove(index);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE, convertToString(employeeList));
    }

    @Override
    public List<Employee> searchEmployee(String name) {
        List<Employee> employeeList = getList();
        List<Employee> employeeSearch = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getName().contains(name)) {
                employeeSearch.add(employee);
            }
        }
        FileUtils.writeFile(PATH_FILE, convertToString(employeeList));
        return employeeSearch;
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employeeList = getList();
        employeeList.add(employee);
        FileUtils.writeFile(PATH_FILE, convertToString(employeeList));
    }

    @Override
    public List<Employee> getList() {
        return convertToE(FileUtils.readFile(PATH_FILE));
    }

    @Override
    public List<String> convertToString(List<Employee> e) {
        List<String> strings = new ArrayList<>();
        for (Employee employee : e) {
            strings.add(
                    employee.getId() + COMMA +
                            employee.getName() + COMMA +
                            employee.getDateOfBirth() + COMMA +
                            employee.getGender() + COMMA +
                            employee.getIdentityCardNumber() + COMMA +
                            employee.getPhoneNumber() + COMMA +
                            employee.getEmail() + COMMA +
                            employee.getLevel() + COMMA +
                            employee.getPosition() + COMMA +
                            employee.getAmount());
        }
        return strings;
    }

    @Override
    public List<Employee> convertToE(List<String> strings) {
        List<Employee> employeeList = new ArrayList<>();
        for (String str : strings) {
            String[] data = str.split(COMMA);
            employeeList.add(new Employee(data[0],
                    data[1],
                    data[2],
                    data[3],
                    data[4],
                    data[5],
                    data[6],
                    data[7],
                    data[8],
                    data[9]));
        }
        return employeeList;
    }
}
