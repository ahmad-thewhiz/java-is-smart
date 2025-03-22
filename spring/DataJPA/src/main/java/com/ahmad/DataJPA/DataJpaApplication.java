package com.ahmad.DataJPA;

import com.ahmad.DataJPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DataJpaApplication.class, args);

		StudentRepo repo=context.getBean(StudentRepo.class);

//		Student s1=context.getBean(Student.class);
//		Student s2=context.getBean(Student.class);
//		Student s3=context.getBean(Student.class);
//		Student s4=context.getBean(Student.class);

//		s1.setRollno(101);
//		s2.setRollno(102);
//		s3.setRollno(103);
//		s4.setRollno(105);

//		s1.setName("Harsh");
//		s2.setName("Gautam");
//		s3.setName("Ankit");
//		s4.setName("Sarah");

//		s1.setMarks(98);
//		s2.setMarks(97);
//		s3.setMarks(96);
//		s4.setMarks(98);

//		Insertion
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);
//		repo.save(s4);

//		FetchAll
//		System.out.println(repo.findAll());

//		FindById
//		System.out.println(repo.findById(103));

//		Optional<Student> s=repo.findById(1011);
//		System.out.println(s.orElse(new Student()));

//		System.out.println(repo.findByName("Harsh"));
//		System.out.println(repo.findByMarks(98));
//		System.out.println(repo.findByMarksGreaterThan(97));

//		repo.delete(s1);

	}

}
