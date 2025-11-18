package com.dd.ai_medical_triage.Entity;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MedicalRecord {
    private int recordId;
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String diagnosis;
    private String prescription;
    private String suggestions;
    private LocalDateTime createdTime;
}
