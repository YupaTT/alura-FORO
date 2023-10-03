package com.carlosg.aluraforo.repository;

import com.carlosg.aluraforo.domain.answers.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>{
    List<Answer> findByUserId(Long id);

    List<Answer> findByTopicId(Long id);
}
