package ss20_mvc_case_study_module2.service;

import ss20_mvc_case_study_module2.model.persion.Employee;

import java.util.List;

public interface IService<E> {
    void add (E e);
    List<E> getList();

}
