package org.example;

import org.example.bean.ChatMessages;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

@SpringBootTest
public class MongoCrudTest {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Test
    public void testInsert(){
        ChatMessages chatMessages = new ChatMessages();
        chatMessages.setContent("聊天记录");
        mongoTemplate.insert(chatMessages);
    }
    @Test
    public void testUpdate(){
        Criteria criteria = Criteria.where("_id").is("68494bd41dc9ab349a25b15f");
        Query query = new Query(criteria);
        Update update = new Update();
        update.set("content", "新的聊天记录");
        mongoTemplate.updateFirst(query, update, ChatMessages.class);
    }
    @Test
    public void testDelete() {
        Criteria criteria = Criteria.where("_id").is("684947100531b27d3cd80586");
        Query query = new Query(criteria);
        mongoTemplate.remove(query, ChatMessages.class);
    }
}
