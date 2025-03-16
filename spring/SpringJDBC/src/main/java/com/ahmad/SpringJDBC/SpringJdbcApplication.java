package com.ahmad.SpringJDBC;

import com.ahmad.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);


		Student s=context.getBean(Student.class);
		s.setRollno(101);
		s.setName("Naveen");
		s.setMarks(78);

		StudentService service=context.getBean(StudentService.class);

		service.addStudent(s);
		System.out.println(service.getAllStudents());
	}

}
