package service;

import model.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    Student findStudentById(int id);
    List<Student> findAllStudents();
    void displayAllStudents();
}
