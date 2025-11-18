package com.dd.ai_medical_triage.Entity;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class MessageQueueLog {
    private Long messageId;
    private String eventType;
    private String payload;
    private String status;
    private LocalDateTime createdTime;
}
