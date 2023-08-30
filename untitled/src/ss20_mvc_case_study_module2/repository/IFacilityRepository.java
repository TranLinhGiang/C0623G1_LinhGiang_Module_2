package ss20_mvc_case_study_module2.repository;

import ss20_mvc_case_study_module2.model.facility.Facility;

import java.util.List;

public interface IFacilityRepository extends IRepository<Facility>{
    void deleteFacility(String id);

    void displayFacility();

    void add(Facility facility);

    @Override
    List<String> convertToString(List<Facility> e);

    @Override
    List<Facility> convertToE(List<String> strings);
}
