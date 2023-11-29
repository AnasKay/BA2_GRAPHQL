package com.kambal.ba_graphql.controller;

import com.kambal.ba_graphql.models.Professor;
import com.kambal.ba_graphql.models.Student;
import com.kambal.ba_graphql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @QueryMapping
    public List<Student> students(){
        return studentService.getStudents();
    }

    @QueryMapping
    public Optional<Student> studentById(@Argument Long id){
        return studentService.getStudent(id);
    }

    @QueryMapping
    public Student studentByEmail(@Argument String emailId){
        return studentService.getStudentByEmailId(emailId);
    }

    @QueryMapping
    public List<Student> studentByLastName(@Argument String lastName){
        return studentService.getStudentByLastName(lastName);
    }


    @MutationMapping
    public Student createStudent(@Argument Student student){
        return studentService.createStudent(student);
    }

    @MutationMapping
    public Student updateStudent(@Argument Long id, @Argument Student student){
        return studentService.updateStudent(id, student);
    }

    @MutationMapping
    public Student deleteStudent(@Argument Student student){
        return studentService.deleteStudent(student);
    }


}
