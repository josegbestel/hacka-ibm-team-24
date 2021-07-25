package com.team24.hackaibm.repository;

import com.team24.hackaibm.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    boolean existsByTitle(String title);
}
