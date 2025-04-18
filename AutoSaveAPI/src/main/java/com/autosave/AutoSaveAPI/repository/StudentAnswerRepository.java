package com.autosave.autosaveapi.repository;

import com.autosave.autosaveapi.model.StudentAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentAnswerRepository extends JpaRepository<StudentAnswer, Long> {
    Optional<StudentAnswer> findByStudentIdAndTestIdAndQuestionId(Long studentId, Long testId, Long questionId);
}
