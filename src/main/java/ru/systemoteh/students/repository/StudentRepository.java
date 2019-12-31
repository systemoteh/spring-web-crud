package ru.systemoteh.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.systemoteh.students.domain.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByFirstNameLikeOrLastNameLikeOrMiddleNameLikeOrEmailLike(String firstName,
                                                                               String middleName,
                                                                               String lastName,
                                                                               String email);
}
