package com.autosave.autosaveapi.dto;

import javax.validation.constraints.NotNull;

public class AnswerDTO {

    @NotNull(message = "Question ID cannot be null")
    private Long questionId;

    @NotNull(message = "Response cannot be null")
    private String response;

    @NotNull(message = "Status cannot be null")
    private String status;

    // Getters and setters
}
