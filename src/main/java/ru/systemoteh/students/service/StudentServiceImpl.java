package ru.systemoteh.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.systemoteh.students.domain.Student;
import ru.systemoteh.students.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public void save(Student student) {
        studentRepository.save(student);
    }
}
