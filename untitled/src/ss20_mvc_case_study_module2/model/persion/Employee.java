package ss20_mvc_case_study_module2.model.persion;

public class Employee extends Person {
    private String level;
    private String position;
    private String amount;

    public Employee(String id, String name, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String level, String position, String amount) {
        super(id, name, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.amount = amount;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + getId() + 
                ", name='" + getName() + 
                ", dateOfBirth='" + getDateOfBirth() + 
                ", gender='" + getGender() + 
                ", identityCardNumber=" + getIdentityCardNumber() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email= " + getEmail() +
                ", level='" + level + 
                ", position='" + position + 
                ", amount='" + amount + 
                '}';
    }
}
