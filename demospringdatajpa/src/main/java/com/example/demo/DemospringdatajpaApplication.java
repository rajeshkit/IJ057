package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemospringdatajpaApplication implements CommandLineRunner{
	@Autowired
	private StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemospringdatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run method started");
     	Student s1=new Student();
		s1.setStudentId(101);
		s1.setCollegeName("IIMT");
		s1.setDepartmentName("IT");
		s1.setStudentName("bcd");
		
		studentRepository.save(s1); // insert
		System.out.println("Run method Ended");
		List<Student> list=studentRepository.findAll(); // select
		list.forEach(e->System.out.println(e));
		
		 Optional<Student> student= studentRepository.findById(100);
		 if(student.isPresent()) {
			 System.out.println(student.get());
			 
		 }
		 studentRepository.deleteById(100); // delete
		// update
		
	}

}
