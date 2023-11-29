package com.kambal.ba_graphql.controller;

import com.kambal.ba_graphql.models.Grade;
import com.kambal.ba_graphql.models.Professor;
import com.kambal.ba_graphql.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class GradeController {

    @Autowired
    GradeService gradeService;

    @QueryMapping
    public List<Grade> grades(){
        return gradeService.getGrades();
    }

    @QueryMapping
    public Optional<Grade> gradeById(@Argument Long id){
        return gradeService.getGrade(id);
    }

    @QueryMapping
    public Optional<Grade> gradeByName(@Argument String name){
        return gradeService.getGradeByName(name);
    }


    @QueryMapping
    public Optional<Grade> gradeByKV(@Argument Professor kv){
        return gradeService.getGradeByProfessor(kv);
    }

    @MutationMapping
    public Grade createGrade(@Argument Grade grade){
        return gradeService.createGrade(grade);
    }

    @MutationMapping
    public Grade updateGrade(@Argument Long id, @Argument Grade grade){
        return gradeService.updateGrade(id, grade);
    }

    @MutationMapping
    public Grade deleteGrade(@Argument Grade grade){
        return gradeService.deleteGrade(grade);
    }

}
