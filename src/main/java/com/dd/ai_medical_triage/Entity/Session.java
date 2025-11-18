package com.dd.ai_medical_triage.Entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Session {
    private int sessionId;
    private int patientId;
    private LocalDateTime createdTime;
    private String status;
}
