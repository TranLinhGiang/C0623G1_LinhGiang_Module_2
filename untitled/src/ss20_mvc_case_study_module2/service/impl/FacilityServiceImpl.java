package ss20_mvc_case_study_module2.service.impl;

import ss20_mvc_case_study_module2.model.facility.Facility;
import ss20_mvc_case_study_module2.repository.IFacilityRepository;
import ss20_mvc_case_study_module2.repository.impl.FacilityRepositoryImpl;
import ss20_mvc_case_study_module2.service.IFacilityService;

import java.util.List;

public class FacilityServiceImpl implements IFacilityService {
    private final IFacilityRepository facilityRepository= new FacilityRepositoryImpl();

    @Override
    public void deleteFacility(String id) {
        facilityRepository.deleteFacility(id);
    }

    @Override
    public void displayFacility() {
        facilityRepository.displayFacility();
    }

    @Override
    public void add(Facility facility) {
        facilityRepository.add(facility);
    }

    @Override
    public List<Facility> getList() {
        return facilityRepository.getList();
    }

}
