package mvc.service;

import mvc.model.Student;
import mvc.model.Teacher;

import java.util.List;

public interface IStudentService {

    void createStudent(Student student);

    void removeStudent(int id);

    List<Student> getStudents();
}
