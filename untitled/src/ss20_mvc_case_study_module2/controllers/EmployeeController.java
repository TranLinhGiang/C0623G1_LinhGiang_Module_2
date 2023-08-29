package ss20_mvc_case_study_module2.controllers;
import ss20_mvc_case_study_module2.model.persion.Employee;
import ss20_mvc_case_study_module2.service.IEmployeeService;
import ss20_mvc_case_study_module2.service.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
    private final IEmployeeService employeeService = new EmployeeServiceImpl();

    public List<Employee> getList() {
        return employeeService.getList();
    }

    public void add(Employee employee) {
        employeeService.add(employee);
    }

    public void editEmployee(String id, Employee employee) {
        employeeService.editEmployee(id, employee);
    }

    public void deleteEmployee(String id) {
        employeeService.deleteEmployee(id);
    }

    public List<Employee> searEmployee(String name) {
        return employeeService.searchEmployee(name);
    }

}
