package repository;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {
    private final Map<Integer, Student> studentsMap = new HashMap<>();
    private int nextId = 1;

    @Override
    public Student save(Student student) {
        student.setId(nextId++);
        studentsMap.put(student.getId(), student);
        return student;
    }

    @Override
    public Student findById(int id) {
        return studentsMap.get(id);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentsMap.values());
    }
}
