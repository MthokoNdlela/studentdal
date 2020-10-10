package com.mthoko.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mthoko.student.dal.entities.Student;
import com.mthoko.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		
		Student student = new Student();
		student.setName("Mthoko");
		student.setCourse("Java Course");
		student.setFee(34500d);
		
		studentRepository.save(student);
	}
	
	@Test
	public void testFindStudentByid() {
		
		Optional<Student> optionalStudent = studentRepository.findById(1l);
		Student student = optionalStudent.get();
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
		
		Optional<Student> optionalStudent = studentRepository.findById(1l);
		Student student = optionalStudent.get();
		student.setFee(2000d);
		
		studentRepository.save(student);
	}
}
