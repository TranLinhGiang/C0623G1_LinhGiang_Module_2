package ss20_mvc_case_study_module2.model.facility;

public class Villa extends Facility {
    private String roomStandard;  // tiêu chuẩn phòng
    private int poolArea;        // diện tích hồ bơi
    private int numberOfFloors;   // số tầng

    public Villa() {
    }
    public Villa(String id, String name, String usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandard, int poolArea, int numberOfFloors) {
        super(id, name, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
