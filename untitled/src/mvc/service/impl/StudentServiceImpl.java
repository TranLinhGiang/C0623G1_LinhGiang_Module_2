package mvc.service.impl;

import mvc.model.Student;
import mvc.repository.IStudentRepository;
import mvc.repository.ITeacherRepository;
import mvc.repository.impl.StudentRepositoryImpl;
import mvc.repository.impl.TeacherRepositoryImpl;
import mvc.service.IStudentService;

import java.util.List;

public class StudentServiceImpl implements IStudentService {


    private final IStudentRepository studentRepository = new StudentRepositoryImpl();


    @Override
    public void createStudent(Student student) {
        this.studentRepository.createStudent(student);
    }

    @Override
    public void removeStudent(int id) {
        this.studentRepository.removeStudent(id);
    }

    @Override
    public List<Student> getStudents() {
        return this.studentRepository.getStudents();
    }
}
