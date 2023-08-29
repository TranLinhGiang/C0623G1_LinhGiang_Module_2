package ss20_mvc_case_study_module2.repository;

import ss20_mvc_case_study_module2.model.persion.Customer;

import java.util.List;

public interface IContactRepository extends  IRepository<Customer>{
    void editContract(String id);

    void editCustomer(String id, Customer customer);

    List<Customer> searchCustomer(String name);

    void del(String id);
}
