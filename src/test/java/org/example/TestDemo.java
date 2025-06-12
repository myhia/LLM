package org.example;


import org.example.assistant.AssistantSeparate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootTest
public class TestDemo {
    @Autowired
    private AssistantSeparate assistantSeparate;
    @Test
    public void testSeparate(){
        //String answer = assistantSeparate.chat(1, "我是张三");
        String answer = assistantSeparate.chat(1, "现在你是子恒");
        String answer2 = assistantSeparate.chat(1, "请问你是谁");
        String answer3 = assistantSeparate.chat(2, "你是谁");
        System.out.println(answer);
        System.out.println(answer2);
        System.out.println(answer3);
    }
}
