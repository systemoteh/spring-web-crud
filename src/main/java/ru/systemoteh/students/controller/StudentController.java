package ru.systemoteh.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.systemoteh.students.domain.Student;
import ru.systemoteh.students.service.StudentService;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public String findAll(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students";
    }

    @GetMapping(value = "/student/{id}")
    public String findById(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.findById(id));
        return "studentDetail";
    }
}
