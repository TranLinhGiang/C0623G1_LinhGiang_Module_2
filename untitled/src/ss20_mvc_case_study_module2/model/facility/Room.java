package ss20_mvc_case_study_module2.model.facility;

public class Room extends Facility {
    private String freeService;


    public Room(String id, String name, String usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String freeService) {
        super(id, name, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", usableArea='" + getUsableArea() + '\'' +
                ", rentalCosts=" + getRentalCosts() +
                ", maximumNumberOfPeople=" + getMaximumNumberOfPeople() +
                ", rentalType='" + getRentalType() + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
