package com.dd.ai_medical_triage.Entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ChatRecord {
    private int chatId;
    private int patientId;
    private LocalDateTime timestamp;
    private String question;
    private String aiReply;
}
