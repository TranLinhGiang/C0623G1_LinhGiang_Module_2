package ss20_mvc_case_study_module2.model.facility;

public class Room extends Facility {
    private String freeService;  // dịch vụ miễn phí đi kèm

    public Room() {
    }

    public Room(String  id, String name, String usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String freeService) {
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
                "freeService='" + freeService + '\'' +
                '}';
    }
}
