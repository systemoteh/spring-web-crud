package ru.systemoteh.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/students")
    public String giveAllStudents(Model model) {
        return "students";
    }
}
