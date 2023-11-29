package com.kambal.ba_graphql.repository;

import com.kambal.ba_graphql.models.Grade;
import com.kambal.ba_graphql.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
    Optional<Grade> findGradeByProfessor(Professor kv);
    Optional<Grade> findGradeByName(String name);
    Grade getGradeById(Long id);
}
