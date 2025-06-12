package org.example;

import org.example.bean.ChatMessages;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

@SpringBootTest
public class TestMongoCrud {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Test
    public void testInsert(){
        ChatMessages chatMessages = new ChatMessages();
        chatMessages.setContent("测试添加");
        mongoTemplate.insert(chatMessages);
    }
    @Test
    public void testUpdate(){
        Criteria criteria = Criteria.where("messageId").is(0);
        Query query = new Query(criteria);
        Update update = new Update();
        update.set("content", "测试更新");
        mongoTemplate.upsert(query, update, ChatMessages.class);
    }
    @Test
    public void testDelete() {
        Criteria criteria = Criteria.where("_id").is("684947100531b27d3cd80586");
        Query query = new Query(criteria);
        mongoTemplate.remove(query, ChatMessages.class);
    }
}
