package com.autosave.autosaveapi.dto;

import javax.validation.constraints.NotNull;
import java.util.List;

public class AutoSaveRequest {

    @NotNull(message = "Student ID cannot be null")
    private Long studentId;

    @NotNull(message = "Test ID cannot be null")
    private Long testId;

    @NotNull(message = "Answer list cannot be null")
    private List<AnswerDTO> answers;

    // Getters and setters
}
