package mvc.service.impl;

import mvc.model.Student;
import mvc.model.Teacher;
import mvc.repository.ITeacherRepository;
import mvc.repository.impl.TeacherRepositoryImpl;
import mvc.service.IStudentService;
import mvc.service.ITeacherService;

import java.util.List;

public class TeacherServiceImpl implements ITeacherService {


    private final ITeacherRepository teacherRepository = new TeacherRepositoryImpl();

    @Override
    public void createTeacher(Teacher teacher) {
        this.teacherRepository.createTeacher(teacher);
    }

    @Override
    public void removeTeacher(int id) {
        this.teacherRepository.removeTeacher(id);
    }

    @Override
    public List<Teacher> getTeachers() {
        return this.teacherRepository.getTeachers();
    }
}
