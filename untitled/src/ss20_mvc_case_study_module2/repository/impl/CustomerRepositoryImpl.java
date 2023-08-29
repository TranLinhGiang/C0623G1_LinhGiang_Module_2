package ss20_mvc_case_study_module2.repository.impl;

import ss20_mvc_case_study_module2.model.persion.Customer;
import ss20_mvc_case_study_module2.repository.ICustomerRepository;
import ss20_mvc_case_study_module2.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {

    private final String pathFile = "F:\\module 2\\C0623G1_LinhGiang_Module_2\\untitled\\src\\ss20_mvc_case_study_module2\\data\\customer.scv";
    private final String COMMA = ",";


    @Override
    public void editCustomer(String id, Customer customer) {
        List<Customer> customerList = getList();
        int index;
        for (Customer data : customerList) {
            if (data.getId().equals(id)) {
                index = customerList.indexOf(data);
                customerList.get(index); //////////////////// thieu////////////////
            }
        }
        FileUtils.writeFile(pathFile, convertToString(customerList));
    }

    @Override
    public void deleteCustomer(String id) {
        int index;
        List<Customer> customerList = getList();
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                index = customerList.indexOf(customer);
                customerList.remove(index);
                break;
            }
        }
        FileUtils.writeFile(pathFile, convertToString(customerList));
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        List<Customer> customerList = getList();
        List<Customer> customerSearch = new ArrayList<>();
        for (Customer customer : customerList) {
            customerSearch.add(customer);
        }
        FileUtils.writeFile(pathFile, convertToString(customerList));
        return customerSearch;
    }

    @Override
    public void add(Customer customer) {
        List<Customer> customerList= getList();
        customerList.add(customer);
        FileUtils.writeFile(pathFile, convertToString(customerList));
    }

    @Override
    public List<Customer> getList() {
        return convertToE(FileUtils.readFile(pathFile));
    }

    @Override
    public List<String> convertToString(List<Customer> e) {
        List<String> strings= new ArrayList<>();
        for (Customer customer: e) {
            strings.add(
                    customer.getId() + COMMA +
                            customer.getName() + COMMA +
                            customer.getDateOfBirth() + COMMA +
                            customer.getGender() + COMMA +
                            customer.getIdentityCardNumber() + COMMA +
                            customer.getPhoneNumber() + COMMA +
                            customer.getEmail() + COMMA +
                            customer.getCustomerType() + COMMA +
                            customer.getAddress());

        }
        return strings;
    }

    @Override
    public List<Customer> convertToE(List<String> strings) {
        List<Customer> customerList= new ArrayList<>();
        for (String str:strings) {
            String[] data= str.split(COMMA);
            customerList.add(new Customer(data[0],
                    data[1],
                    data[2],
                    data[3],
                    data[4],
                    data[5],
                    data[6],
                    data[7],
                    data[8]
                   ));


        }
        return customerList;
    }
}
