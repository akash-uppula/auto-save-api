package com.autosave.autosaveapi.service;

import com.autosave.autosaveapi.dto.AutoSaveRequest;
import com.autosave.autosaveapi.dto.AnswerDTO;
import com.autosave.autosaveapi.model.StudentAnswer;
import com.autosave.autosaveapi.repository.StudentAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class StudentAnswerService {

    @Autowired
    private StudentAnswerRepository repository;

    @Transactional
    public void saveResponses(AutoSaveRequest request) {
        for (AnswerDTO answer : request.getAnswers()) {
            Optional<StudentAnswer> existing = repository.findByStudentIdAndTestIdAndQuestionId(
                request.getStudentId(), request.getTestId(), answer.getQuestionId());

            StudentAnswer studentAnswer = existing.orElse(new StudentAnswer());
            studentAnswer.setStudentId(request.getStudentId());
            studentAnswer.setTestId(request.getTestId());
            studentAnswer.setQuestionId(answer.getQuestionId());
            studentAnswer.setResponse(answer.getResponse());
            studentAnswer.setStatus(answer.getStatus());
            studentAnswer.setLastUpdated(LocalDateTime.now());

            repository.save(studentAnswer);
        }
    }
}
