package com.dd.ai_medical_triage.Entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Appointment {
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private LocalDateTime appointmentTime;
    private String status;
}
