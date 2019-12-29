package ru.systemoteh.students.service;

import ru.systemoteh.students.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> findAll();

    Optional<Student> findById(Long id);

    void deleteById(Long id);

    void save(Student student);
}
