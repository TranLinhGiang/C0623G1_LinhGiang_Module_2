package ss20_mvc_case_study_module2.repository;

import java.util.List;

public interface IRepository<E> {
    void add(E e);

    List<E> getList();

    List<String> convertToString(List<E> e);

    List<E> convertToE(List<String> strings);
}
