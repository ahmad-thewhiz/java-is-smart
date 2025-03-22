package com.ahmad.DataJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ahmad.DataJPA.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    @Query("select s from Student s where s.name = ?1")
    List<Student> findByName(String name);

    @Query("select s from Student s where s.marks = ?1")
    List<Student> findByMarks(int marks);

    @Query("select s from Student s where s.marks>=?1")
    List<Student> findByMarksGreaterThan(int marks);
}
