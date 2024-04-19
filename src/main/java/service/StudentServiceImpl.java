package service;

import model.Student;
import repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createStudent(Student student) {
        // Implémentez la logique de création d'un étudiant
        return studentRepository.save(student);
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void displayAllStudents() {
        List<Student> students = findAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
