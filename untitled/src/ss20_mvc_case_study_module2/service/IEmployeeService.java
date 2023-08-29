package ss20_mvc_case_study_module2.service;

import ss20_mvc_case_study_module2.model.persion.Employee;

import java.util.List;

public interface IEmployeeService extends IService<Employee>{
    void editEmployee(String id, Employee employee);
    void deleteEmployee(String id);
    List<Employee> searchEmployee(String name);
}
