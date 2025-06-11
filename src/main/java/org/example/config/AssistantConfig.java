package org.example.config;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.service.MemoryId;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AssistantConfig {

    @Bean
    public ChatMemory chatMemory(){
        return MessageWindowChatMemory.withMaxMessages(10);
    }
    @Bean
    public ChatMemoryProvider chatMemoryProvider(){
        return MemoryId -> MessageWindowChatMemory
                .builder()
                .id(MemoryId)
                .maxMessages(10)
                .build();
    }
}
