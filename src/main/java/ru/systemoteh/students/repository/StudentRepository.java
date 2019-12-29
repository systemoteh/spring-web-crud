package ru.systemoteh.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.systemoteh.students.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
