package com.hello.spring;

import com.hello.spring.data.models.Student;
import com.hello.spring.data.models.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private Controller controller;

    @GetMapping("/hello")
    public String hello() {
        return "hello spring";
    }

    @GetMapping("/students")
    public String  students() {
        return controller.getAllStudents().toString();
    }

    @GetMapping("/test")
    public String test() {
        return controller.test().toString();
    }
}
