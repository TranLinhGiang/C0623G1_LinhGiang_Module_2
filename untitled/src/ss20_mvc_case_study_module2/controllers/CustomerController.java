package ss20_mvc_case_study_module2.controllers;
import ss20_mvc_case_study_module2.model.persion.Customer;
import ss20_mvc_case_study_module2.model.persion.Employee;
import ss20_mvc_case_study_module2.service.ICustomerService;
import ss20_mvc_case_study_module2.service.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private final ICustomerService customerService= new CustomerServiceImpl();

    public List<Customer> getList() {
        return customerService.getList();
    }

    public void add(Customer customer) {
        customerService.add(customer);
    }

    public void editCustomer(String id, Customer customer) {
        customerService.editCustomer(id,customer);
    }

    public void deleteCustomer(String id) {
        customerService.deleteCustomer(id);
    }

    public List<Customer> searchCustomer(String name) {
        return customerService.searchCustomer(name);
    }
}
