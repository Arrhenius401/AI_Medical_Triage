package com.dd.ai_medical_triage.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.dd.ai_medical_triage.utils.AIConstants.MADICAL_TRIAGE_SYSTEM;
import static com.dd.ai_medical_triage.utils.AIConstants.TOOL_CALLING;

@Configuration
public class AIConfig {

    public final ChatMemory chatMemory;

    public AIConfig(ChatMemory chatMemory) {
        this.chatMemory = chatMemory;
    }

    @Bean
    public ChatClient chatClient(OpenAiChatModel model) {
        return ChatClient
                .builder(model)
                .defaultSystem(MADICAL_TRIAGE_SYSTEM)
                .defaultSystem(TOOL_CALLING)
                .defaultAdvisors(MessageChatMemoryAdvisor.builder(chatMemory).build())
                .build();

    }


}
