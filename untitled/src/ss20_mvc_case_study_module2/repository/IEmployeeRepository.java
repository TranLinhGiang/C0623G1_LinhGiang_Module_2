package ss20_mvc_case_study_module2.repository;

import ss20_mvc_case_study_module2.model.persion.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee>{
 void editEmployee(String id,Employee employee);
 void deleteEmployee(String id);
 List<Employee> searchEmployee(String name);
}
