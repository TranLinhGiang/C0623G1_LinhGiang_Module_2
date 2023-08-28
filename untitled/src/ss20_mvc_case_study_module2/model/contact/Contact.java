package ss20_mvc_case_study_module2.model.contact;

public class Contact {
    private String idBooking;       // mã bookig.
    private String numberContract;  // số hợp đồng.
    private String deposit;         // tiền cọc trước.
    private String totalPayment;    // Tổng tiền thanh toán.

    public Contact(String idBooking, String numberContract, String deposit, String totalPayment) {
        this.idBooking = idBooking;
        this.numberContract = numberContract;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idBooking='" + idBooking + '\'' +
                ", numberContract='" + numberContract + '\'' +
                ", deposit='" + deposit + '\'' +
                ", totalPayment='" + totalPayment + '\'' +
                '}';
    }
}
