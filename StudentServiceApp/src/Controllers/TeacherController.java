package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;

//Класс TeacherController реализует интерфейс iUserController для работы с объектами класса Teacher. 
//Он содержит ссылку на объект TeacherService и реализует методы для создания, обновления, удаления, 
//получения всех учителей и получения учителя по id. Все эти методы делегируют свою работу объекту TeacherService.

public class TeacherController implements iUserController<Teacher> {

    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void create(Teacher teacher) {
        teacherService.create(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        teacherService.update(teacher);
    }

    @Override
    public void delete(int id) {
        teacherService.delete(id);
    }

    @Override
    public void getAll() {
        List<Teacher> teachers = teacherService.getAll();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Override
    public void getById(int id) {
        Teacher teacher = teacherService.getById(id);
        if (teacher != null) {
            System.out.println(teacher);
        } else {
            System.out.println("Teacher not found");
        }
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}