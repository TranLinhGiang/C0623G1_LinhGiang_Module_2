package ss20_mvc_case_study_module2.repository;

import ss20_mvc_case_study_module2.model.persion.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer>{
  void editCustomer(String id, Customer customer);

  void deleteCustomer(String id);

  List<Customer> searchCustomer(String name);
}
