package ss20_mvc_case_study_module2.model.booking;

public class Booking {
    private String idBooking;
    private String dayBooking;
    private String firstDay;
    private String lastDay;
    private String idCustomer;

    public Booking(String idBooking, String dayBooking, String firstDay, String lastDay, String idCustomer) {
        this.idBooking = idBooking;
        this.dayBooking = dayBooking;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.idCustomer = idCustomer;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDayBooking() {
        return dayBooking;
    }

    public void setDayBooking(String dayBooking) {
        this.dayBooking = dayBooking;
    }

    public String getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public String getLastDay() {
        return lastDay;
    }

    public void setLastDay(String lastDay) {
        this.lastDay = lastDay;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dayBooking='" + dayBooking + '\'' +
                ", firstDay='" + firstDay + '\'' +
                ", lastDay='" + lastDay + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }
}
