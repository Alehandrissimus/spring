package com.hello.spring;

import com.hello.spring.data.StudentRepository;
import com.hello.spring.data.TestRepo;
import com.hello.spring.data.models.Student;
import com.hello.spring.data.models.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {


    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private TestRepo testRepo;

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Test test() {
        System.out.println(testRepo.findAll().get(0));
        return testRepo.findAll().get(0);
    }

    public String foo() {
        return "fooasd";
    }
}
