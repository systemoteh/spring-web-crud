package ru.systemoteh.students.service;

import ru.systemoteh.students.domain.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    void deleteById(Long id);

    void save(Student student);

    List<Student> findByQuery(String query);
}
