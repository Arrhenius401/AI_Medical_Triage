package com.dd.ai_medical_triage.tool;


import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class DateTimeTools {
    @Tool(description = "返回用户当前时区的当前时间")
    public String getCurrentTime() {
        return java.time.LocalDateTime.now().toString();
    }
}
