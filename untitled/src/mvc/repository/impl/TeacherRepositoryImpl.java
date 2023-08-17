package mvc.repository.impl;

import mvc.model.Student;
import mvc.model.Teacher;
import mvc.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepositoryImpl implements ITeacherRepository {

    private final List<Teacher> teachers = new ArrayList<>();


    @Override
    public void createTeacher(Teacher teacher) {
        teacher.setId(this.teachers.size() + 1);
        this.teachers.add(teacher);
    }

    @Override
    public void removeTeacher(int id) {
        for (Teacher teacher : this.teachers) {
            if (teacher.getId() == id) {
                this.teachers.remove(teacher);
                return;
            }
        }
    }

    @Override
    public List<Teacher> getTeachers() {
        return this.teachers;
    }
}
