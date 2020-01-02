package ru.systemoteh.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping(value = {"/"})
    public String root() {
        return "redirect:/students";
    }
}
