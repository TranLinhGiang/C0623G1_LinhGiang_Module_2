package ss20_mvc_case_study_module2.model.persion;

public class Customer extends Person {
    private String customerType;  // loai khach hang
    private String address;


    public Customer(String id, String name, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String customerType, String address) {
        super(id, name, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + getId() + 
                ", name='" + getName() + 
                ", dateOfBirth='" + getDateOfBirth() + 
                ", gender='" + getGender() + 
                ", identityCardNumber=" + getIdentityCardNumber() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email= " + getEmail() +
                ", customerType='" + customerType + 
                ", address='" + address +
                '}';
    }
}
