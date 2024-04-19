package repository;

import model.Student;

import java.util.List;

public interface StudentRepository {
    Student save(Student student);
    Student findById(int id);
    List<Student> findAll();
}
