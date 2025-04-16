package com.ahmad.docker2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent() {
        Student s = new Student();
        s.setName("John");
        s.setAge(29);
        repo.save(s);
    }

}
