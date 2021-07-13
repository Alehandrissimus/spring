package com.hello.spring;

import com.hello.spring.data.models.Student;
import com.hello.spring.data.models.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private Service service;

    public void addStudent(Student student) {
        service.addStudent(student);
    }

    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    public Test test() {
        return service.test();
    }

    public String foo() {
        return service.foo();
    }
}