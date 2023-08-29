package ss20_mvc_case_study_module2.repository.impl;

import ss20_mvc_case_study_module2.model.persion.Customer;
import ss20_mvc_case_study_module2.repository.IContactRepository;

import java.util.List;

public class ContactRepositoryImpl implements IContactRepository {

    @Override
    public void editContract(String id) {

    }

    @Override
    public void editCustomer(String id, Customer customer) {

    }

    @Override
    public List<Customer> searchCustomer(String name) {
        return null;
    }

    @Override
    public void del(String id) {

    }

    @Override
    public void add(Customer customer) {

    }

    @Override
    public List<Customer> getList() {
        return null;
    }

    @Override
    public List<String> convertToString(List<Customer> e) {
        return null;
    }

    @Override
    public List<Customer> convertToE(List<String> strings) {
        return null;
    }
}
