package org.example.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;


import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

@AiService(
        wiringMode = EXPLICIT,
        chatModel = "qwenChatModel",
        chatMemoryProvider = "chatMemoryProvider",
        tools = "calculatorTools" //配置tools
)
public interface AssistantSeparate {
    @SystemMessage(fromResource = "prompt_template.txt")//系统消息提示词
    String chat(@MemoryId int MemoryId, @UserMessage String msg);
    @UserMessage("请用粤语回答问题。{{message}}")
    String chat2(@MemoryId int memoryId, @V("message") String userMessage);
    @SystemMessage(fromResource = "prompt_template2.txt")
    String chat3(
            @MemoryId int memoryId,
            @UserMessage String userMessage,
            @V("username") String username,
            @V("age") int age
    );
}
