package ss20_mvc_case_study_module2.controllers;

import ss20_mvc_case_study_module2.model.facility.Facility;
import ss20_mvc_case_study_module2.service.IFacilityService;
import ss20_mvc_case_study_module2.service.impl.FacilityServiceImpl;

import java.util.List;

public class FacilityController {
    private final IFacilityService facilityService = new FacilityServiceImpl();

    public List<Facility> getList() {
        return facilityService.getList();
    }

    public void add(Facility facility) {
        facilityService.add(facility);
    }

    public void deleteFacility(String id) {
        facilityService.deleteFacility(id);
    }

    public void displayFacility(){
        facilityService.displayFacility();
    }
}
