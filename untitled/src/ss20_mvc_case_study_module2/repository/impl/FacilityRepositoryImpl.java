package ss20_mvc_case_study_module2.repository.impl;

import ss20_mvc_case_study_module2.model.facility.Facility;
import ss20_mvc_case_study_module2.model.facility.House;
import ss20_mvc_case_study_module2.model.facility.Room;
import ss20_mvc_case_study_module2.model.facility.Villa;
import ss20_mvc_case_study_module2.repository.IFacilityRepository;
import ss20_mvc_case_study_module2.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;

public class FacilityRepositoryImpl implements IFacilityRepository {
    private final String PATH__FILE = "F:\\module 2\\C0623G1_LinhGiang_Module_2\\untitled\\src\\ss20_mvc_case_study_module2\\data\\facility.csv";
    private final String COMA = ",";

    @Override
    public void deleteFacility(String id) {
        List<Facility> facilityList = getList();
        for (Facility facility : facilityList) {
            if (facility.getId().equals(id)) {
                System.out.println(facility);
                facilityList.remove(facility);
                break;
            }
        }
        FileUtils.writeFile(PATH__FILE,convertToString(facilityList));
    }

    @Override
    public void displayFacility() {
        System.out.println("---");
    }

    @Override
    public void add(Facility facility) {
        List<Facility> facilityList = getList();
        facilityList.add(facility);

        FileUtils.writeFile(PATH__FILE, convertToString(facilityList));
    }



    @Override
    public List<Facility> getList() {
        return convertToE(FileUtils.readFile(PATH__FILE));
    }

    @Override
    public List<String> convertToString(List<Facility> facilityList) {
        List<String> strings = new ArrayList<>();
        String string;
        for (Facility facility : facilityList)
            if (facility.getId().contains("SVHO")) {
                House house = (House) facility;
                string = house.getId() + COMA +
                        house.getName() + COMA +
                        house.getUsableArea() + COMA +
                        house.getRentalCosts() + COMA +
                        house.getMaximumNumberOfPeople() + COMA +
                        house.getRentalType() + COMA +
                        house.getRoomStandard() + COMA +
                        house.getNumberOfFloors();
                strings.add(string);
            } else if (facility.getId().contains("SVRO")) {
                Room room = (Room) facility;
                string = room.getId() + COMA +
                        room.getName() + COMA +
                        room.getUsableArea() + COMA +
                        room.getRentalCosts() + COMA +
                        room.getMaximumNumberOfPeople() + COMA +
                        room.getRentalType() + COMA +
                        room.getFreeService();
                strings.add(string);
            } else {
                Villa villa = (Villa) facility;
                string = villa.getId() + COMA +
                        villa.getName() + COMA +
                        villa.getUsableArea() + COMA +
                        villa.getRentalCosts() + COMA +
                        villa.getMaximumNumberOfPeople() + COMA +
                        villa.getRentalType() + COMA +
                        villa.getRoomStandard() +
                        villa.getPoolArea() + COMA +
                        villa.getNumberOfFloors();
                strings.add(string);
            }
        return strings;
    }

    @Override
    public List<Facility> convertToE(List<String> strings) {
        List<Facility> facilityList = new ArrayList<>();
        for (String string : strings) {
            String[] data = string.split(COMA);
            if (data[0].contains("SVHO")) {
                House house = new House(data[0],data[1],data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5], data[6], Integer.parseInt(data[7]));
                facilityList.add(house);
            } else if (data[0].contains("SVRO")) {
                Room room = new Room(data[0],data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5], data[6]);
                facilityList.add(room);
            }else {
                Villa villa= new Villa(data[0],data[1],data[2],Integer.parseInt(data[3]), Integer.parseInt(data[4]),data[5], data[6], Integer.parseInt(data[7]), Integer.parseInt(data[7]));
                facilityList.add(villa);
            }
        }
        return facilityList;
    }

}
