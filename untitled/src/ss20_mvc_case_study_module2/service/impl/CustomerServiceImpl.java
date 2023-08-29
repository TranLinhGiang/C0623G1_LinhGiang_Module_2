package ss20_mvc_case_study_module2.service.impl;

import ss20_mvc_case_study_module2.model.persion.Customer;
import ss20_mvc_case_study_module2.repository.ICustomerRepository;
import ss20_mvc_case_study_module2.repository.impl.CustomerRepositoryImpl;
import ss20_mvc_case_study_module2.service.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {

private final ICustomerRepository customerRepository= new CustomerRepositoryImpl();
    @Override
    public void editCustomer(String id, Customer customer) {
        customerRepository.editCustomer(id,customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteCustomer(id);
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        return customerRepository.searchCustomer(name);
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public List<Customer> getList() {
        return customerRepository.getList();
    }
}
