package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceMock implements StudentService {
    private final List<Student> students = new ArrayList<>();

    @Override
    public Student createStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student findStudentById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Student> findAllStudents() {
        return students;
    }

    @Override
    public void displayAllStudents() {
        students.forEach(System.out::println);
    }
}
