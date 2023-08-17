package mvc.repository;

import mvc.model.Teacher;

import java.util.List;

public interface ITeacherRepository {

    void createTeacher(Teacher teacher);

    void removeTeacher(int id);


    List<Teacher> getTeachers();

}
