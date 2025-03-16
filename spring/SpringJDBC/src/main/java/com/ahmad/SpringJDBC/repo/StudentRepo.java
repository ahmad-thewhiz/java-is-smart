package com.ahmad.SpringJDBC.repo;

import com.ahmad.SpringJDBC.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) {
        String sql = "insert into student (rollno, name, marks) values (?,?,?)";
        int rows=jdbcTemplate.update(sql, student.getRollno(), student.getName(), student.getMarks());

        System.out.println(rows+" rows inserted");
    }

    public List<Student> findAll() {
        String sql = "select * from student";

//        RowMapper<Student> mapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//                Student student=new Student();
//                student.setRollno(rs.getInt("rollno"));
//                student.setName(rs.getString("name"));
//                student.setMarks(rs.getInt("marks"));
//
//                return student;
//            }
//        };

        RowMapper<Student>mapper = (ns, rowNum) -> {
            Student student=new Student();
            student.setRollno(ns.getInt("rollno"));
            student.setName(ns.getString("name"));
            student.setMarks(ns.getInt("marks"));

            return student;
        };

        return jdbcTemplate.query(sql, mapper);
    }
}
