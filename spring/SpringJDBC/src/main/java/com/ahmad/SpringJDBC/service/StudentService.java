package com.ahmad.SpringJDBC.service;

import com.ahmad.SpringJDBC.Student;
import com.ahmad.SpringJDBC.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student) {
        System.out.println("Adding student");
        studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}
