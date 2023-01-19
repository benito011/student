package com.example.Student.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student.model.Student;
@Repository
public interface StudentRespository extends JpaRepository<Student,Long> {

}
