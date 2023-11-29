package com.kambal.ba_graphql.repository;

import com.kambal.ba_graphql.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findStudentByEmailId(String emailId);
    List<Student> findStudentByLastName(String lastName);
}
