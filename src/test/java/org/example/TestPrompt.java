package org.example;

import org.example.assistant.AssistantSeparate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestPrompt {
    @Autowired
    private AssistantSeparate assistantSeparate;
    @Test
    public void testSystemMessage() {
        String username = "tom";
        int age = 18;
        String answer = assistantSeparate
                .chat3(3, "明天是几号，我想挂明天下午的号", username, age);
        String answer2 = assistantSeparate
                .chat3(3, "我牙疼应该挂什么科室", username, age);
        System.out.println(answer);
        System.out.println(answer2);
    }
}
