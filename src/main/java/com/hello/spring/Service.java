package com.hello.spring;

import com.hello.spring.data.StudentRepository;
import com.hello.spring.data.models.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private StudentRepository studentRepo;

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public String foo() {
        return "fooasd";
    }
}
