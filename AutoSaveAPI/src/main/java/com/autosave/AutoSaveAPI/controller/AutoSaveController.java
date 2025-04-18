package com.autosave.autosaveapi.controller;

import com.autosave.autosaveapi.dto.AutoSaveRequest;
import com.autosave.autosaveapi.service.StudentAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/autosave")
public class AutoSaveController {

    @Autowired
    private StudentAnswerService studentAnswerService;

    @PostMapping
    public String autoSaveAnswers(@RequestBody @Valid AutoSaveRequest request) {
        studentAnswerService.saveStudentAnswers(request);
        return "Answers saved successfully!";
    }
}
