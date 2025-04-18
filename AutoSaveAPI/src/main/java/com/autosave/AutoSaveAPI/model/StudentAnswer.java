package com.autosave.autosaveapi.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;
    private Long testId;
    private Long questionId;
    private String response;
    private String status;
    private LocalDateTime lastUpdated;

    @Version
    private int version;
}
