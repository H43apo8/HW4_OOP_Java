package StudentService;

import java.util.Collections;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;
//Класс TeacherService реализует интерфейс iUserService для работы с объектами класса Teacher. 
//Он содержит список учителей и методы для получения всех учителей, получения учителя по id, создания, обновления и удаления учителя. 
//Также он содержит метод printSortedTeachers, который сортирует список учителей по имени и выводит его в консоль. 
public class TeacherService implements iUserService<Teacher> {

    private List<Teacher> teachers;

    public TeacherService(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public Teacher getById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public void create(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == teacher.getId()) {
                teachers.set(i, teacher);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == id) {
                teachers.remove(i);
                break;
            }
        }
    }

    public void printSortedTeachers() {
        Collections.sort(teachers, new UserComparator());
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}