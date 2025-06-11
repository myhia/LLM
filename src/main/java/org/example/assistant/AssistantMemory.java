package org.example.assistant;

import dev.langchain4j.service.spring.AiService;


import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

@AiService(
        wiringMode = EXPLICIT,
        chatModel = "ollamaChatModel",
        chatMemoryProvider = "chatMemoryProvider"
)
public interface AssistantMemory {
    String chat(String msg);
}
