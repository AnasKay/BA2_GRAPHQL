package com.kambal.ba_graphql.controller;

import com.kambal.ba_graphql.models.Professor;
import com.kambal.ba_graphql.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @QueryMapping
    public List<Professor> professors(){
        return professorService.getProfessor();
    }

    @QueryMapping
    public Professor professorById(@Argument Long id){
        return  professorService.getProfessor(id);
    }

    @QueryMapping
    public Professor professorByEmail(@Argument String emailId){
        return  professorService.getProfessorByEmailId(emailId);
    }

    @QueryMapping
    public List<Professor> professorByLastName(@Argument String lastName){
        return  professorService.getProfessorsByLastName(lastName);
    }

    @MutationMapping
    public Professor createProfessor(@Argument Professor professor){
        return professorService.createProfessor(professor);
    }

    @MutationMapping
    public Professor updateProfessor(@Argument Long id, @Argument Professor professor){
        return professorService.updateProfessor(id, professor);
    }

    @MutationMapping
    public Professor deleteProfessor(@Argument Professor professor){
        return professorService.deleteProfessor(professor);
    }


}
