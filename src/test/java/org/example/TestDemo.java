package org.example;

import org.example.assistant.AssistantMemory;
import org.example.assistant.AssistantSeparate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootTest
public class TestDemo {


    @Autowired
    private AssistantMemory assistantMemory;
    @Test
    public void testMemory(){
        String answer = assistantMemory.chat("i'm 李白");
        String answer2 = assistantMemory.chat("who am i");
        System.out.println(answer);
        System.out.println(answer2);

    }

    @Autowired
    private AssistantSeparate assistantSeparate;
    @Test
    public void testSeparate(){
        String answer = assistantSeparate.chat(1, "我是张三");
        String answer2 = assistantSeparate.chat(1, "我是谁");
        String answer3 = assistantSeparate.chat(2, "我叫什么");
        System.out.println(answer2);
        System.out.println(answer3);
    }
    @Autowired
    private ApplicationContext context;

    @Test
    void checkBeanName() {
        System.out.println(context.containsBean("ollamaChatModel"));  // 应该打印 true
    }
}
