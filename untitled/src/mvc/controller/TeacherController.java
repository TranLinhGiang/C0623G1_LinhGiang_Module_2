package mvc.controller;

import mvc.model.Teacher;
import mvc.service.ITeacherService;
import mvc.service.impl.TeacherServiceImpl;

import java.util.List;

public class TeacherController {

    private final ITeacherService teacherService = new TeacherServiceImpl();

    public void createTeacher(Teacher teacher) {
        this.teacherService.createTeacher(teacher);
    }

    public void removeTeacher(int id) {
        this.teacherService.removeTeacher(id);
    }

    public List<Teacher> getTeachers() {
        return this.teacherService.getTeachers();
    }
}
