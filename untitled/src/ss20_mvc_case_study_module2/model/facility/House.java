package ss20_mvc_case_study_module2.model.facility;

public class House extends Facility {
     private String roomStandard;
     private int numberOfFloors;

    public House(String id, String name, String usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(id, name, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }


    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", usableArea='" + getUsableArea() + '\'' +
                ", rentalCosts=" + getRentalCosts() +
                ", maximumNumberOfPeople=" + getMaximumNumberOfPeople() +
                ", rentalType='" + getRentalType() + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
