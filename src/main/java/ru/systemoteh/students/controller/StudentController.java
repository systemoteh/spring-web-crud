package ru.systemoteh.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String getAllStudents(Model model) {
        return "students";
    }

    @GetMapping(value = "/student/{studentUid}")
    public String getStudentById(@PathVariable String studentUid, Model model) {
        return "studentDetail";
    }
}
