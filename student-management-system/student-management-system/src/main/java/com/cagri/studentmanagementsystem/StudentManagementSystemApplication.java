package com.cagri.studentmanagementsystem;

import com.cagri.studentmanagementsystem.entity.Student;
import com.cagri.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1 = new Student("Ahmet", "Yilmaz", "ahmet123@asd.com");
		studentRepository.save(student1);

		Student student2 = new Student("Ayse", "Solmaz", "ayse432@asd.com");
		studentRepository.save(student2);

		Student student3 = new Student("Saul", "Goodman", "saulg@asd.com");
		studentRepository.save(student3);
		*/
	}
}
