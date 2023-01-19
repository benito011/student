package com.example.Student.service;
package com.example.Student.Respository;

import java.time.LocalDate;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.model.Student;
@Service
public class StudentService {
   private final StudentRepository studentRepository;
   
   @Autowired
   public StudentService(StudentRepository studentRepository) {
	   this.studentRepository = studentRepository;
	   
   }
   
	public List<Student> getStudents() {
		return studentRepository.findAll();
				
	}
 
 }

