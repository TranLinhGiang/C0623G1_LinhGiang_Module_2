package ss20_mvc_case_study_module2.service;

import ss20_mvc_case_study_module2.model.facility.Facility;

public interface IFacilityService extends IService<Facility> {
    void deleteFacility(String id);

    void displayFacility();
}
