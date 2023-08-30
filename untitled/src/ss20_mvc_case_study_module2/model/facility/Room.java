package ss20_mvc_case_study_module2.model.facility;

public class Room extends Facility {
    private String freeService;  // dịch vụ miễn phí đi kèm

    public Room(String datum, int i, float v, int parseInt, int anInt, String s) {
    }

    public Room(String  id, String name, int usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String freeService) {
        super(id, name, String.valueOf(usableArea), rentalCosts, maximumNumberOfPeople, rentalType);
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
