package ss20_mvc_case_study_module2.service.impl;

import ss20_mvc_case_study_module2.model.persion.Employee;
import ss20_mvc_case_study_module2.repository.IEmployeeRepository;
import ss20_mvc_case_study_module2.repository.impl.EmployeeRepositoryImpl;
import ss20_mvc_case_study_module2.service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private final IEmployeeRepository employeeRepository= new EmployeeRepositoryImpl();


    @Override
    public List<Employee> getList() {
        return employeeRepository.getList();
    }
    @Override
    public void add(Employee employee) {
    employeeRepository.add(employee);
    }

    @Override
    public void editEmployee(String id, Employee employee) {
    employeeRepository.editEmployee(id, employee);
    }

    @Override
    public void deleteEmployee(String id) {
    employeeRepository.deleteEmployee(id);
    }

    @Override
    public List<Employee> searchEmployee(String name) {
        return employeeRepository.searchEmployee(name);
    }
}
